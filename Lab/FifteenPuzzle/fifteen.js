
let emptyRow = 300;
let emptyCol = 300;
const PUZZLE_NUMBER = 4;
const TILE_SIZE = 100;

$(document).ready(function(){
   
    $("#puzzlearea div").each(function (i){  
        // calculate x and y for this piece
        let row = i % PUZZLE_NUMBER;
        let col = Math.floor(i / PUZZLE_NUMBER);
        let x = (row * TILE_SIZE);
        let y = (col * TILE_SIZE);

        // set basic style and background
        this.className = "puzzlepiece";
        this.id = "square_" + row + "_" + col;
        this.style.left = x + 'px';
        this.style.top = y + 'px';
        this.style.backgroundImage = 'url("background.jpg")';
        this.style.backgroundPosition = -x + 'px ' + (-y) + 'px';
        
        $(this).click(function () {
            let currentLeft = $(this).position().left;
            let currentTop = $(this).position().top;
            if (currentLeft === emptyRow) {
                if (Math.abs(emptyCol - currentTop) === TILE_SIZE) {
                    if (emptyCol === currentTop + TILE_SIZE) {
                        $(this).animate({top: currentTop + TILE_SIZE});
                    }
                    else {
                        $(this).animate({top: currentTop - TILE_SIZE});
                    }
                    emptyCol = currentTop;
                }
            }
            else if (currentTop === emptyCol) {
                if (Math.abs(emptyRow - currentLeft) === TILE_SIZE) {
                    if (emptyRow === currentLeft + TILE_SIZE) {
                        $(this).animate({left: currentLeft + TILE_SIZE});
                    } else {
                        $(this).animate({left: currentLeft - TILE_SIZE});
                    }
                    emptyRow = currentLeft;
                }
            }
        });
        
        $(this).hover(function () {
            if (possiableMove($(this))) {
                $(this).addClass("movablepiece");
            }
        },
        function () {
            $(this).removeClass("movablepiece");
        });
        
        let possiableMove = function(object){
            let currentLeft = object.position().left;
            let currentTop = object.position().top;

            if(currentLeft === emptyRow || currentTop === emptyCol){
                if(Math.abs(emptyRow - currentLeft) === TILE_SIZE || Math.abs(emptyCol - currentTop) === TILE_SIZE){
                    return true;
                }
            }
            return false;
        };
    });
    
    $("#shufflebutton").click(function(){
        const timeout = 1000;
        const timeShuffle = 10;
        let timer = setInterval(shuffle, timeShuffle);
        
        setTimeout(function (){
            clearTimeout(timer);
        }, timeout);
        
    });
    
    let shuffle = function (){
        let itemArr = [];
        
        // above the blank square
        if (emptyRow - TILE_SIZE >= 0) {
            let rowIdx = (emptyRow - TILE_SIZE) / TILE_SIZE;
            itemArr.push("#square_" + rowIdx + "_" + (emptyCol / TILE_SIZE));
        }
        
        // below the blank square
        if (emptyRow + TILE_SIZE < TILE_SIZE * PUZZLE_NUMBER) {
            let rowIdx = (emptyRow + TILE_SIZE) / TILE_SIZE;
            itemArr.push("#square_" + rowIdx + "_" + (emptyCol / TILE_SIZE));
        }

        // left of the blank square
        if (emptyCol - TILE_SIZE >= 0) {
            let colIdx = (emptyCol - TILE_SIZE) / TILE_SIZE;
            itemArr.push("#square_" + (emptyRow / TILE_SIZE) + "_" + colIdx);
        }

        // right of the blank square
        if (emptyCol + TILE_SIZE < TILE_SIZE * PUZZLE_NUMBER) {
            let colIdx = (emptyCol + TILE_SIZE) / TILE_SIZE;
            itemArr.push("#square_" + (emptyRow / TILE_SIZE) + "_" + colIdx);
        }

        // random select neighbor of the blank square
        let randomIndex = Math.floor(Math.random() * itemArr.size());
        let tLeft = $(itemArr[randomIndex]).position().left;
        let tTop = $(itemArr[randomIndex]).position().top;

        // move it to the blank square position
        $(itemArr[randomIndex]).css({"left": emptyRow, "top": emptyCol});

        // keep tracking the blank square
        emptyCol = tTop;
        emptyRow = tLeft;
        
    };
        
    
   
});



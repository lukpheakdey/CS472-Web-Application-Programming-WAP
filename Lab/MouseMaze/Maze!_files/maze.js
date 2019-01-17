"use strict";
let touch = false;
let win = false;
let start = false;
let mazeEnter = false;

$(document).ready(function(){

    (function(){
        function DeleteItem(){
            $(this).parent().detech();
        }

        $(document).ready(function (){
            $("button").click(DeleteItem);
        });
    })();

    $("#maze").find(".boundary").mousemove(function(){
        if(start === true && win === false){
            $("#status").text("You lose!");
            $(this).addClass("youlose");   
        }
        touch = true;
    });
    
    $("#end").mouseover(function(){
        if(touch === false){
            //alert('You win');
            if(mazeEnter === true && touch === false){
                $("#status").text("You win! :]");
                win = true;  
            }
        }else{
            //alert("You lose");
            $("#status").text("You lose!");
            start = false;
        }
    });
    
    $("#start").click(function(){
        $("#maze").find(".boundary").removeClass("youlose");
        $("#status").text("Start new game!!!!!");
        start = true;
        touch = false;
        win = false;
    });
    
    $("#maze").mouseenter(function(){
        mazeEnter = true;
    });
    
    $("#maze").mouseleave(function(){
        mazeEnter = false;
        touch = true;
        if (start === true && win === false) {
            $('.boundary').addClass("youlose");
            $("#status").text("You lose!");
        }
    });
    
 
});



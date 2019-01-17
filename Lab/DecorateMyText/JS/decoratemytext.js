
var myIncreaseFontSize;
var currentFontSize;

function clickBigger(){
    //document.getElementById("textarea_id").style.fontSize = "24pt";
    currentFontSize = (0.75) * parseInt($("#textarea_id").css('font-size'));
    myIncreaseFontSize = setInterval(increseFontSize, 500);
}

function increseFontSize(){
    currentFontSize = currentFontSize + 2;
    $("#textarea_id").css('font-size', currentFontSize + "pt");
}

function onChangeCheck(){
    if(document.getElementById("bling").checked === true){
        $("#textarea_id").addClass("new-style");
        $("body").css('background-image', 'url("http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg")');
    } else{
        $("#textarea_id").removeClass("new-style");
        $("body").css('background-image', '');
    }
}

function OnClinckIgpayAtinlay(){
    var txtStr = document.getElementById("textarea_id").value;
    var str = txtStr.trim().split(" ");
    var str_new = "";
    for(var i = 0; i<str.length; i++){
        str_new += translateIgpayAtinlay(str[i]) + " ";
    }
    document.getElementById("textarea_id").value = str_new;
}

function translateIgpayAtinlay(str) {
    return str.replace(/\b(\w)(\w+)\b/g, function (a, b, c) {
        if (/[A-Z]/.test(b)) {
            c = c.replace(/^\w/, function (x) {
                return x.toUpperCase()
            });
        }
        return c + b.toLowerCase() + (/[aeiou]/i.test(b) ? 'way' : 'ay');
    });
}

function OnClickMalkovitch(){
    var txtStr = document.getElementById("textarea_id").value;
    var str = txtStr.trim().split(" ");
    var str_new = "";
    for(var i = 0; i<str.length; i++){
        if(str[i].length >= 5){
            str_new += "Malkovitch ";
        }else{
            str_new += str[i] + " ";
        }
    }
    document.getElementById("textarea_id").value = str_new;
}






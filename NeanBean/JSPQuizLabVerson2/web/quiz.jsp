<%-- 
    Document   : quiz
    Created on : Dec 3, 2018, 8:07:20 PM
    Author     : lukpheakdey
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> JSP Version Quiz </title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script>
            function clickTest(hint){
                alert(hint);
            }
         
            function clickRetart() {
                var r = confirm("Do you want to start over?");
                if (r == true) {
                    document.theForm.action="quiz.do";
                } 
            }

        </script>
    </head>
    <body>
        <h1> Have fun with NumberQuiz!</h1>
        <form action="quiz.do" method="POST">
            <p> Your current score is ${score} </p>
            <p> Attempt ${attempts}/3 </p>
            <p> Guess the next number in the sequence ! </p>
            <p> [${currentQuestion}, <span style="color: red; font-weight: bold;">?</span> ] </p>
            <p> Your answer: <input type="text" name="guess" value="${answer}"> </p>
            <p>
                <input type="submit" name="btnNext" value="Next">
            </p>
        </form>
        <form NAME="theForm">
            <p>
                <input type="submit" name="btnRestart" value="Restart!" onclick="clickRetart()">
                <input type="hidden" name="option" value="STARTOVER"> 
            </p>
        </form>
        
        <p><span style="color: red;"> ${tryMsg} </span> </p>
        <p><input type="button" value="hint?" onclick="clickTest('${currentHint}')"></p>
           
    </body>
</html>

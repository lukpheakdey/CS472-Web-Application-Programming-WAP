<%-- 
    Document   : Choose
    Created on : Dec 3, 2018, 1:21:40 PM
    Author     : lukpheakdey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Choose</title>
</head>
<body>
    <form method='post' action='ChooseServlet'>
        <p>Is JSP cool?</p>
        <input type='radio' value='1' name='radioJSPCool' ${sessionScope.radioState.yesCheck} ><span>Yes</span><br/>
        <input type='radio' value='0' name='radioJSPCool' ${sessionScope.radioState.noCheck} ><span>No</span><br/>
        <input type='submit' name='btnSubmit' value='Submit'/>
        
        <p>Is JSF way cool?</p>
        <input type='radio' value='1' name='JSFwayCool' ${sessionScope.radioState2.yesCheck} ><span>Yes</span><br/>
        <input type='radio' value='0' name='JSFwayCool' ${sessionScope.radioState2.noCheck} ><span>No</span><br/>
        <input type='submit' name='btnSubmit' value='Submit'/>
        
        <p>Is the moon made of cheese?</p>
        <input type='radio' value='1' name='moonCheese' ${sessionScope.radioState3.yesCheck}><span>Yes</span><br/>
        <input type='radio' value='0' name='moonCheese' ${sessionScope.radioState3.noCheck}><span>No</span><br/>
        <input type='submit' name='btnSubmit' value='Submit'/>
    </form>
</body>
</html>

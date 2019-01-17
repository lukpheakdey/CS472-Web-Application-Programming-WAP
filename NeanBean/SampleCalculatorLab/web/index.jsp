
<html>
    <head>
        <title> Sample Calculator Lab Improved  </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action ="improvedCalculator.do" method ="POST">
            <input type="text" name="add_number1" size="7" value="<%= request.getParameter("add_number1") %>"/> + 
            <input type="text" name="add_number2" size="7" value="<%= request.getParameter("add_number2") %>"/> = 
            <input type="text" name="resultAdd" size="7" value=${resultAdd}>
            <br>
            <input type="text" name="mulit_number1" size="7" value="<%= request.getParameter("mulit_number1") %>"/> *  
            <input type="text" name="mulit_number2" size="7" value="<%= request.getParameter("mulit_number2") %>"/> = 
            <input type="text" name="resultMulti" size="7" value="${resultMulit}">
            <br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>

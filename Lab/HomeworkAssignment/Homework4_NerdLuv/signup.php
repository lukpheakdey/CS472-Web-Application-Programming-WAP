
<?php include("top.html") ?>
    <form action="signup-submit.php" method="POST">
        <fieldset>
            <legend> New User Signup:</legend>

            <label> Name :</label>
            <input type="text" name="name" maxlength="16">

            <label> Gender :</label>
            <input type="radio" name="gender" value="male"> Male 
            <input type="radio" name="gender" value="female" checked> Female

            <label> Age :</label>
            <input size="6" type="text" name="age" maxlength="2">

            <label> Personality type :</label>
            <input size="6" type="text" name="personality" maxlength="2"> 
            (<a href="http://www.humanmetrics.com/cgi-win/JTypes2.asp"> Don't you know your type? </a>)

            <label> Favorite OS :</label>
            <select name="os" >
                <option value="widow" selected> Windows</option>
                <option value="macOS"> Mac OS X</option>
                <option value="ubuntu"> Linux </option>
            </select>

            <label> Seeking age :</label> </td>
            <input type="text" name="min" size="6" placeholder="min" maxlength="2"> 
            to
            <input type="text" name="max" size="6" placeholder="max" maxlength="2">
            <input class="submit_button" type="submit" value="Sign Up">

            <!--
            <table>
                <tr> 
                    <td> <label> Name :</label> </td>
                    <td> <input type="text" name="name" maxlength="16"> </td>
                <tr>
                <tr> 
                    <td> <label> Gender :</label> </td>
                    <td> 
                        <input type="radio" name="gender" value="male"> Male 
                        <input type="radio" name="gender" value="female" checked> Female
                    </td>
                <tr>
                <tr> 
                    <td> <label> Age :</label> </td>
                    <td> <input size="6" type="text" name="age" maxlength="2"> </td>
                <tr>
                <tr> 
                    <td> <label> Personality type :</label>  </td>
                    <td> <input size="6" type="text" name="personality" maxlength="2"> 
                    (<a href="http://www.humanmetrics.com/cgi-win/JTypes2.asp"> Don't you know your type? </a>)</td>
                <tr>
                <tr> 
                    <td> <label> Favorite OS :</label> </td>
                    <td> 
                        <select name="os" >
                            <option value="widow" selected> Windows</option>
                            <option value="macOS"> Mac OS X</option>
                            <option value="ubuntu"> Linux </option>
                        </select>
                    </td>
                <tr>
                <tr> 
                    <td> <label> Seeking age :</label> </td>
                    <td> 
                        <input type="text" name="min" size="6" placeholder="min" maxlength="2"> 
                        to
                        <input type="text" name="max" size="6" placeholder="max" maxlength="2">
                    </td>
                <tr>
                <tr> 
                    <td colspan="2"> <input class="submit_button" type="submit" value="Sign Up"> </td>
                <tr>
            </table>
-->
        </fieldset>
    </form>
<?php include("bottom.html") ?>

<?php include("top.html") ?>
    <form action="signup-submit.php" method="POST">
        <fieldset>
            <legend> New User Signup:</legend>

            <strong> Name :</strong>
            <input type="text" name="name" maxlength="16">
            
            <div class="clear5"></div>
            <strong> Gender :</strong>
            <input type="radio" name="gender" value="male"> Male 
            <input type="radio" name="gender" value="female" checked> Female

            <div class="clear5"></div>
            <strong> Age :</strong>
            <input size="6" type="text" name="age" maxlength="2">

            <div class="clear5"></div>
            <strong> Personality type :</strong>
            <input size="6" type="text" name="personality" maxlength="2"> 
            (<a href="http://www.humanmetrics.com/cgi-win/JTypes2.asp"> Don't you know your type? </a>)

            <div class="clear5"></div>
            <strong> Favorite OS :</strong>
            <select name="os" >
                <option value="widow" selected> Windows</option>
                <option value="macOS"> Mac OS X</option>
                <option value="ubuntu"> Linux </option>
            </select>

            <div class="clear5"></div>
            <strong> Seeking age :</strong>
            <input type="text" name="min" size="6" placeholder="min" maxlength="2"> 
            to
            <input type="text" name="max" size="6" placeholder="max" maxlength="2">

            <div class="clear5"></div>
            <input class="submit_button" type="submit" value="Sign Up">

        </fieldset>
    </form>
<?php include("bottom.html") ?>
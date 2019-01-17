<?php include("top.html") ?>

    <form action="matches-submit.php" method="POST">
        <fieldset>
            <legend> Returning User:</legend>
            <table>
                <tr>
                    <td> <label> Name </label> </td>
                    <td> <input type="text" name="name" maxlength="16"> </td>
                </tr>
                <tr>
                    <td colspan="2"> <input type="submit" value="View My Matches"> </td>
                </tr>
            </table>
        </fieldset>
    </form>

<?php include("bottom.html") ?>
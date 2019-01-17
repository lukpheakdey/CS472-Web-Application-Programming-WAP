<!DOCTYPE html>

<html>
    <head>
        <title> Beer Selection Page </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="SelectorBeer.do" method="POST">
            <p>Select beer characteristic </p>
            <select name="color" size="1">
                <option value="light"> light </option>
                <option value="amber"> amber </option>
                <option value="brown"> brown </option>
                <option value="dark"> dark </option>
            </select>
            <br><br>
            <center>
                <input type="submit">
            </center>
        </form>
    </body>
</html>

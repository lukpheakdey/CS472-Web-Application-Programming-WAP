<?php include("top.html") ?>

<?php 
    $loginData = file('singles.txt');
    $array = array();
    $flag = false;
    foreach ($loginData as $line) {
        $array = explode(',', $line);
        if($array[0] == $_POST['name']){
            $name = $array[0];
            $gender = $array[1];
            $age = $array[2];
            $type = $array[3];
            $os = $array[4];
            $min = $array[5];
            $max = $array[6];
            $flag = true;
            break;
        }
    }
?>
    <div>
        <b> Matches for  <?php echo $_POST["name"]; ?> </b> 
    </div>
    <br>
    <div class="match">
        <img src="images/user.jpg" alt="user">
        <div>
            <p>Pheakdey Luk</p>
            <table>
                <tr> 
                    <td> <b> gender: </b> </td>
                    <td> <?php echo $gender; ?> </td>
                <tr>
    
                <tr> 
                    <td> <b> age: </b> </td>
                    <td> <?php echo $age; ?></td>
                <tr>
    
                <tr> 
                    <td> <b> type: </b> </td>
                    <td> <?php echo $type; ?></td>
                <tr>
    
                <tr> 
                    <td> <b> OS: </b></td>
                    <td> <?php echo $os; ?> </td>
                <tr>
            </table>
        </div>
    </div>
    
<?php include("bottom.html") ?>
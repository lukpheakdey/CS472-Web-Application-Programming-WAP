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


        <div class="column">
            <p>Pheakdey Luk</p>
            <div class="clear5"></div>
            <div class="column">
                <strong class="margin20"> gender: </strong>
                <label>  <?php echo $gender; ?></label>
            </div>
            <div class="column">
                <strong> age: </strong>  
                <label> <?php echo $age; ?> </label>
            </div>
            <div class="column">
                <strong> OS: </strong>  
                <label> <?php echo $os; ?>  </label>
            </div>
        </div>
    </div>
<?php include("bottom.html") ?>
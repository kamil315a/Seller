<?php

require_once "dbconnect.php";

// Create connection by dbconnect
$connection = mysqli_connect($servername, $username, $password, $db);

if (isset($_POST['firstname'])){
   $firstname = $_POST['firstname'];
   echo $firstname;
}
if (isset($_POST['lastname'])){
   $lastname = $_POST['lastname'];
}
if (isset($_POST['userEmail'])){
   $userEmail = $_POST['userEmail'];
}
if (isset($_POST['userZipcode'])){
   $userZipcode = $_POST['userZipcode'];
}

/*$firstname = "sd";
$lastname = "fs";
$email = "sa";
$userZipcode = "33450" ;  */

$sql1= "INSERT INTO users (`firstname`, `lastname`, `email`, `zip code`)
         VALUES ('$firstname', '$lastname','$email', '$userZipcode');";

if (mysqli_query($connection,$sql1)) {
      echo "Values have been inserted successfully sql1";
}




 $sql= "INSERT INTO users (`firstname`, `lastname`, `email`, `zip code`)
         VALUES ('admin', 'admin','adminstrator@admin.pl', '33340');" ;

   if (mysqli_query($connection,$sql)) {
      echo "Values have been inserted successfully sql";
}


echo $_SERVER['SERVER_NAME'];


mysqli_close($connection);
?>
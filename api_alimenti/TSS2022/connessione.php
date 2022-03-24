<?php

include 'config.php';

$connessione = mysqli_connect(HOST, USER, PW, DB);

if (mysqli_connect_errno()){
    die("La connessione al db è fallita per: " . mysqli_connect_errno()
    . " " . mysqli_connect_error()
);

}

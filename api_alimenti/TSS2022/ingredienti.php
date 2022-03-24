<?php

include 'connessione.php';

$query = "select * from alimenti";
$ingredienti = [];


if (  isset( $_GET['search'])){

    switch ($_GET['search']) {
        case 'cat':
            $query = "select distinct(categoria) from alimenti order by categoria";
            break;
        
        case 'bycat':

            $query = "select * from alimenti where categoria = '" . $_GET['find'] . "'";
            break;
        
        case 'byprod':

            $query = "select * from alimenti where prodotto like '%" . $_GET['find'] . "%'";
            break;
        
        case 'byid':

            $query = "select * from alimenti where id = '" . $_GET['find'] . "'";
            break;
        
        default:
            # code...
            break;
    }



}


$risultati = mysqli_query($connessione, $query);

if ( isset($_GET['search']) && $_GET['search'] == 'cat' ){

    while ($ingr = mysqli_fetch_assoc($risultati)) {
        $ingredienti[] = [ "categoria" => $ingr['categoria'] ];
    }

} else {

    while ($ingr = mysqli_fetch_assoc($risultati)) {
        $ingredienti[] = [ 
            "categoria" => $ingr['categoria'],   
            "prodotto" => $ingr['prodotto'],   
            "proteine" => $ingr['proteine'],   
            "lipidi" => $ingr['lipidi'],   
            "carboidrati" => $ingr['carboidrati'],   
            "energia" => $ingr['energia'],   
        ];
    }
}







header("Content-Type: application/json");
echo json_encode($ingredienti);

?>
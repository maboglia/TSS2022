const ingredientiArr = [];
const textAreaArr = [];


const BTN_ADD = document.getElementById('btnAddIngrediente');
const MODALE = document.getElementById('modale');
const INGREDIENTI = document.getElementById('ingredienti');
const CHECKOUT = document.getElementById('checkout');
const LISTA = document.getElementById('lista');
const URL = 'http://api.bogliaccino.it/alimenti/ingredienti.php?';
const URL_CAT = URL + 'search=cat';
const URL_CAT_FIND = URL + 'search=bycat&find=';
const URL_PROD_FIND = URL + 'search=byprod&find=';
const URL_ID_FIND = URL + 'search=byid&find=';

function findCat(){
    fetch(URL_CAT).then(j => j.json()).then(data => {
        console.log(data);
    });
}

function findCatFind(categoria){
    fetch(URL_CAT_FIND+categoria).then(j => j.json()).then(data => {
        console.log(data);
    });
}

function findProdFind(prodotto){
    ingredientiArr.length = 0;
    LISTA.innerHTML = '';
    fetch(URL_PROD_FIND+prodotto).then(j => j.json()).then(data => {
        data.forEach(element => {
            ingredientiArr.push(element);
        });
        UL = populateUL(ingredientiArr);
        LISTA.appendChild(UL);
        console.log(ingredientiArr);

    });
}

function findIdFind(id){
    fetch(URL_ID_FIND+id).then(j => j.json()).then(data => {
        console.log(data);
        generateComponent(data[0].prodotto,100);
    });
}

function populateUL(prodottiList){
    const UL = document.createElement('ul');
    for (const prodotto of prodottiList) {
        const LI = document.createElement('li');
        const ANCHOR = document.createElement('a');
        ANCHOR.addEventListener('click',function(){
            findIdFind(prodotto.id);
        });
        ANCHOR.setAttribute('href','#');
        ANCHOR.textContent = prodotto.prodotto;
        LI.appendChild(ANCHOR);
        UL.appendChild(LI);
    }
    return UL;
}

BTN_ADD.addEventListener('click',showModale(),false);

function showModale() {
	console.log("!!");
    const INPUT = document.createElement('input');
    INPUT.setAttribute('type','text');
    const BUTTON = document.createElement('button');
    BUTTON.addEventListener('click',function(){
        findProdFind(INPUT.value);
    });
    MODALE.appendChild(INPUT);
    MODALE.appendChild(BUTTON);
    // generateComponent("",0);

}

function generateComponent(valueInput, valueQuantita){
    const INPUT = document.createElement('input');
    INPUT.setAttribute('type','text');
    INPUT.setAttribute('value',valueInput);

    const QUANTITA = document.createElement('input');
    QUANTITA.setAttribute('type','number');
    QUANTITA.setAttribute('value',valueQuantita);

    let ingr = {
        nome: INPUT.value,
        quantita: QUANTITA.value
    }

    textAreaArr.push(ingr);

    // da inserire in modale
    MODALE.appendChild(INPUT);
    MODALE.appendChild(QUANTITA);
}

function caricaIngredienti(){
    INGREDIENTI.innerText = '';
    console.log('!!' + textAreaArr);
    INGREDIENTI.innerText = JSON.stringify(textAreaArr);
}

CHECKOUT.addEventListener('click',caricaIngredienti,false);
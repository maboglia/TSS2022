const STUDENTI = document.getElementById("studente");
const ESAMI = document.getElementById("esame");
const VOTO = document.getElementById("voto");
const DATA = document.getElementById("date");

const URL_STUDENTI = "http://localhost:9010/scuola/api/studenti";
const URL_ESAMI = "http://localhost:9010/scuola/api/esami";

fetch(URL_STUDENTI).then(e => e.json()).then(e => {
    for (const stud of e) {
        const OPT = document.createElement("option");
        OPT.setAttribute("value", stud.id);
        OPT.textContent = stud.nome;
        STUDENTI.appendChild(OPT);
    }
})

fetch(URL_ESAMI).then(e => e.json()).then(e => {
    for (const esam of e) {
        const OPT = document.createElement("option");
        OPT.setAttribute("value", esam.id);
        OPT.textContent = esam.nome;
        ESAMI.appendChild(OPT);
    }
})

DATA.value = new Date().toISOString();
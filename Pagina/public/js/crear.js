const url = 'http://localhost:3000/juego/crear';

const id = document.querySelector("#id");
const p1 = document.querySelector("#uno");
const p2 = document.querySelector("#dos");
const p3 = document.querySelector("#tres");

const agregar = document.querySelector(".FormularioCrear");
agregar.addEventListener('submit', (evento) => {
    evento.preventDefault();

    let id = document.getElementById("id");
    let uno = document.getElementById("uno");
    let dos = document.getElementById("dos");
    let tres = document.getElementById("tres");

    localStorage.setItem("id", id.value);
    localStorage.setItem("uno", uno.value);
    localStorage.setItem("dos", dos.value);
    localStorage.setItem("tres", tres.value);

    let valorId = localStorage.getItem("id");
    let valorUno = localStorage.getItem("uno");
    let valorDos = localStorage.getItem("dos");
    let valorTres = localStorage.getItem("tres");

    let jugadores = [
        { idj: 0, nombre: valorUno, apuesta: 0 },
        { idj: 1, nombre: valorDos, apuesta: 0 },
        { idj: 2, nombre: valorTres, apuesta: 0 }
    ];
    let ganador;

    console.log(valorId);
    console.log(jugadores);

    fetch(url, {
        method: 'POST',
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ valorId, jugadores, ganador })
    }).then(response => response.json())
    // .catch(error => console.log(error));
});
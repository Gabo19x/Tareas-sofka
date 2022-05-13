
/** Obtener juegos
 * obtiene todos los juegos y los muestra
 */
fetch('http://localhost:3000/juego/inicio', {
    method: 'GET',
    headers: { "Content-Type": "application/json" },
})
    .then(response => response.json())
    .then(data => MostrarData(data, 'tabla'))
    .catch(error => console.log(error));


const MostrarData = (data, c) => {
    let body = '';
    for (let i = 0; i < 100; i++) {
        body += `<tr id="a${i}"><td> ${data[i].id}</td><td>${data[i].jugadores[0].nombre}</td><td>${data[i].jugadores[1].nombre}</td><td>${data[i].jugadores[2].nombre}</td></tr>`;
    }
    document.getElementById(c).innerHTML = body;
};

/** Empezar juego
 * Empieza el juego segun un id
 */
const id = document.querySelector("#id");
let valorId;

const empezar = document.querySelector(".EmpezarBoton");
empezar.addEventListener('submit', (evento) => {
    evento.preventDefault();

    let id = document.getElementById("id");
    localStorage.setItem("id", id.value);
    valorId = localStorage.getItem("id");

    fetch(`http://localhost:3000/juego/empezar`, {
        method: 'GET',
        headers: { "Content-Type": "application/json" },
        // body: valorId
    }).then(response => response.json())
        .then(data => juego = req.param.id)
        .catch(error => console.log(error));
});


/** Obtener juego por id
 * obtiene un juego juego y los muestra
 */
fetch(`http://localhost:3000/juego/ganador`, {
    method: 'GET',
    headers: { "Content-Type": "application/json" },
    // body: { juego }
}).then(response => response.json())
    .then(data => MostrarDataCompleta(data, 'tablaJuego'))
    .catch(error => console.log(error));


const MostrarDataCompleta = (data, c) => {
    let body = '';
    for (let i = 0; i < 1; i++) {
        body += `<tr id="a${i}">
        <td> ${data.id}</td>
        <td>${data[i].jugadores[0].nombre}</td><td>${data[i].jugadores[0].apuesta}</td>
        <td>${data[i].jugadores[1].nombre}</td><td>${data[i].jugadores[1].nombre}</td>
        <td>${data[i].jugadores[2].nombre}</td><td>${data[i].jugadores[2].nombre}</td>
        </tr>`;
    }
    document.getElementById(c).innerHTML = body;
};

/** Obtener ganador
 * obtiene el ganador de un juego y lo muestra
 */
fetch(`http://localhost:3000/juego/ganador`, {
    method: 'GET',
    headers: { "Content-Type": "application/json" },
}).then(response => response.json())
    .then(data => MostrarDataGanador(data, 'tablaGandor'))
    .catch(error => console.log(error));

const MostrarDataGanador = (data, c) => {
    let body = '';
    for (let i = 0; i < 1; i++) {
        body += `<tr><td>${data[i].ganador.nombre}</td><td>${data[i].ganador.apuesta}</td></tr>`;
    }
    document.getElementById(c).innerHTML = body;
};

// Eliminar juego
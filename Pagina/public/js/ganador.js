
const url = 'http://localhost:3000/id/ganador';

fetch(url) // Obtener juego
    .then(response => response.json())
    .then(data => MostrarData(data, 'tabla'))
    .catch(error => console.log(error));


const MostrarData = (data, c) => {
    let body = '';
    for (let i = 0; i < 10; i++) {
        body +=  `<tr id="a${i}">
        <td> ${id}</td>
        <td>${nombre1}</td><td>${apuesta1}</td>
        <td>${nombre2}</td><td>${apuesta2}</td>
        <td>${nombre3}</td><td>${apuesta3}</td>
        </tr>`;
    }
    document.getElementById(c).innerHTML = body;
};

// Obtener ganador
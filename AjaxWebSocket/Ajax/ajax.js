const c = document.getElementById("contenido");
const b = document.getElementById("btnLoad");
const msg = document.getElementById("msg");

b.addEventListener("click", (evt) => {
  const xhr = new XMLHttpRequest();
  // console.log('Objeto Creaodo,Estado : ', xhr.readyState)

  xhr.open("GET", "/data.json", true);
  // console.log('Objeto Abierto : ', xhr.readyState)

  xhr.addEventListener("load", (e) => {
    switch (e.target.status) {
      case 200:
        const data = JSON.parse(e.target.responseText);
        draw(data);
        break;

      case 401:
        msg.textContent = "No esta autorizado para realizar esta accion";
        break;

      case 404:
        msg.textContent = "No existe información... pagina 404 muy bonita";
        break;

      case 500:
        msg.textContent = "Hubo un error en el servidor, por favor espere!";
        break;

      default:
        console.log("ERRRO");
        break;
    }

    // console.log(e.target)
    // console.log('Objeto cargado : ', xhr.readyState)
    // console.log(data[0]);
    // console.log(typeof data)
    // var o = JSON.parse(data);
    // var json = JSON.stringify(o);
    // console.log(typeof json)
  });
  xhr.send();
});

const draw = (data) => {
  c.innerHTML = "";
  const f = document.createDocumentFragment();
  data.forEach((n) => {
    // const container = document.createElement('div');
    // const codigo = document.createElement('h2');
    // const descripcion = document.createElement('p');
    const option = document.createElement("option");
    // console.log(option);

    // codigo.textContent = n.codi
    option.textContent = n.desCorto;
    option.setAttribute("value", n.codi);

    // container.appendChild(codigo);
    // container.appendChild(descripcion);
    // c.innerHTML = ;

    f.appendChild(option);
  });
  c.appendChild(f);
};

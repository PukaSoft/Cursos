const myContent = document.getElementById("myContent");
const btn = document.getElementById("btn");

const setText = (data) => {
  myContent.textContent = data;
};

const getData = () => {
  return new Promise((resolve, reject) => {
    setText("Solicitando autorizacion");
    setTimeout(() => {
      resolve(true);
    }, 2000);
  });
};

const showData = (callback) => {
  return new Promise((resolve, reject) => {
    setText("Esperando a mostrat la informacion");
    setTimeout(() => {
      resolve({ name: "Carol" });
    }, 2000);
  });
};

btn.addEventListener("click", async () => {
  let user = null
  const authorization = await getData()
      if (authorization) {
        user = await showData();
      }
      setText(user.name);
    });





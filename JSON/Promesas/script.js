const myContent = document.querySelector("#myContent");
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

btn.addEventListener("click", () => {
  getData()
    .then((authorization) => {
      if (authorization) {
        return showData();
      }
    })
    .then((user) => {
      setText(user.name);
    });
});

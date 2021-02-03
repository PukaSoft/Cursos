const myContent = document.querySelector('#myContent');
const btn = document.getElementById('btn');

const setText = data => {
    myContent.textContent = data
}

const getData = callback => {
    setText('Solicitando autorizacion')
    setTimeout(() => {
        callback(true);
    }, 2000);
}

const showData = callback =>{
    setText('Esperando a mostrat la informacion')
    setTimeout(() => {
        callback({name : 'Carol'});
    }, 2000);
}

btn.addEventListener('click',()=>{
    getData(authorizarion => {
        if (authorizarion) {
            showData(user => {
                setText(user.name)
            })
        }
    })
})
//While
let user2 = ["user","invitado","admin"];
let password2  = ["1","12","123"];

let user = "otro";
let password = "555";


while(user != "admin" && password != "123"){

    for( let i=0; i < 3; i++){
        if (user2[i] == "admin"){
            user = user2[i];
        }

        if (password2[i] == "123") {
            password = password2[i];
        }

        if(user == "admin" && password =="123") {
            console.log("Bienvenido!!");
        }else {
            console.log("Intento : " + (i+1));
        }


    }

}

do {
console.log("Me ejecuto igual :)");
}while(user != "admin" && password != "123");


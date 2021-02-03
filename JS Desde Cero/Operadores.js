/**
 #Operadores
 - Aritmetica
 - Logicos
 - Comporativo
 - Negacion
 */

let resultado = 3 + 4 - 9 / 3 * 4 % 3;
let num1= 30;
let num2=40;
let num3= 60;
let num4=70;

let valor = (num1 < num2) && (num3 < num4); // V AND V = V
let valor2 = (num1 != num2) || (num3 < num4); // F OR F = F


//Login
let password = '123456';
let user = 'admin';

let acceso = (user == 'admin') && (password == '123456'); 


console.log(!valor2)

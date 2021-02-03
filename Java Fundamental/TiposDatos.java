 public class TiposDatos{
     
/* 
#Datos primitivos
- Numericos : short, int, long, float, double
- Logicos : boolean
- Caracter : char
valor por defecto
- Numericos : 0
- Logicos : false
- caracter : empty ('') 

#Referencial :  Por Defecto
- String :  null
- Objetos : null
- Listas : null
- Arrays : []
*/

public static void main(String... args){

short enteroCorto = 0x32;
int enteroMedio=0x32;
long enteroLargo=0x32;

float decimalPequenio = 0x32;
double decimalLargo = 0x14ae;

char caracter='\u0038';
boolean logico = true;

String cadena = "Hola Mundo";
String frutas[] = {"Naranja","Pera","Durazno"};

System.out.println(cadena.hashCode());

}

}


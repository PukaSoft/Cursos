public class Operadores {

    /*
    #Operadores Aritmeticos
       *,-,+./,%

    #Operadore Logicos
       &&,||
    #Operadores de Comparacion
      >,<,==,>=,<=
    #Operador de Negacion
      !,!=
    #Operador de asignacion
        =, 
    #Operador de incremento y decremento [post, pre]
      ++variable, variable++, --variable, variable--
      */
    public static void main(String... args){
       //Calculadora
       int n1=10,n2=7,res;
       /*Jerarquia
       nivel 1 : /,*,%
       nivel 2 : +,-
       */
       res = n1+n2/n2*n1%(n2-n1);

       //Otros
       boolean log = !(n1 != n2);
       boolean log2 = n1 > n2;
       boolean resLog = log || log2; //F OR V = V 

       System.out.println(resLog); 
    }
    
}

public class Caso {
    /*
    #SWITCH
        switch(opcion){
            Case 1 :
            to-do
            break; 

            Case 2 :
            to-do
            break;
            
            Case 3 :
            to-do
            break; 

            default:
            to-do
            break;
        }
        */

    public static void main(String... args){
        //Calculador 
        char operador ='-';
        int n1 = 20, n2 = 5;

        switch (operador) {
            case '*':
                System.out.println("La Multiplicación es " + (n1*n2));
                break;
            case '+':
                System.out.println("La Suma es " + (n1+n2));
                break;  
            case '-':
                System.out.println("La Resta es " + (n1-n2));
                break;      
            case '/':
                System.out.println("La División es " + (n1/n2));
                break;
            case '%':
                System.out.println("El Residuo es " + (n1%n2));
                break;                
            default:
                System.out.println("Operador incorrecto");
                break;
        }

    }
}

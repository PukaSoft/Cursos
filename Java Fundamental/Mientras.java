import java.util.Scanner;
public class Mientras {
    /*
    # Mientras
    Ejecuta hasta que la condicion se cumpla
    
    while(condicion){
        to-do
    }

    #Hacer Mientras
     Ejecuta por lo menos una vez, y hasta que la conducion se cumpla

     do{

     }while(condicion);
    */
    
    public static void main(String[] args){
        int num=1;
        Scanner teclado = new Scanner(System.in);
       
        while(num !=0){
            System.out.println("****Tienda****");
            System.out.println("(1) Comprar");
            System.out.println("(0) Salir");
            System.out.println("Escribe un numero");
            num = teclado.nextInt();

        }

        // do {
        //     System.out.println("****Tienda****");
        //     System.out.println("(1) Comprar");
        //     System.out.println("(0) Salir");
        //     System.out.println("Escribe un numero");
        //     num = teclado.nextInt();

        // } while (num !=0);

    }
}

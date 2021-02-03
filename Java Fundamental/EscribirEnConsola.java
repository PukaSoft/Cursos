import java.util.Scanner;

public class EscribirEnConsola {
    /*
    #Scanner me permite escribir en consola
    */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = teclado.nextInt();
        System.out.println("El numero que ingresastes es " + numero);

    }
}

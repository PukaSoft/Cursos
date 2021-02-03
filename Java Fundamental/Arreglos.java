public class Arreglos {

    /**
     #Array, Vectores

     */

    public static void main(String... args){
        String fruta1 = "naraja";
        String fruta2 = "pera";
        String fruta3 = "platanos";
        
        //Sintaxis 1
        String frutas[] = new String[3];
        //[0] [1] [2]
        frutas[0] = fruta1; frutas[1] = fruta2; frutas[2] = fruta3;
       
        //Sintaxis 2
        String frutas2[] = {fruta1,fruta2,fruta3};


        // for(int i=0;i<frutas2.length;++i){
        //     System.out.println(frutas2[i]);
        // }

        // for(String fruta : frutas2){
        //     System.out.println(fruta);
        // }


        String asiento[][] = new String[3][3]; //F:3 y C:3
        //      1    2    3
        //1   [0,0][0,1][0,2]
        //2   [1,0][1,1][1,2]    
        //3   [2,0][2,1][2,2] 

        asiento[0][0]="Juan";asiento[0][1]="Perci";asiento[0][2]="Marcos";
        asiento[1][0]="Goku";asiento[1][1]="Homero";asiento[1][2]="Liza";
        asiento[2][0]="Tony";asiento[2][1]="Peter";asiento[2][2]="Thor";
        
        System.out.println(asiento[2][2]);

    }
    
}

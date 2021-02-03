public class Condicional {
    /* 
    #Condicional Simple
        if (condicion){
            to-do
        }
 
         if (condicion) {
            to-do
        }else {
            to-do
        }
    
    #Condicional Doble
       if (condicion) {
           to-do
       }else if (condicion){
           to-do
       }else {
           to-do
       }

    #Condicional Multiple
        if (condicion) {
           to-do
       }else if (condicion){
           to-do
       }else if (condicion) {
           to-do
       }else if ...

    #Condicional Anidado
        if (condicion) {
           to-do
         if (condicion){
             to-do
         }else if (condicion){
             to-do
                if (condicion)...
            }
       
        }else...

        }
    */ 

    public static void main(String... args){
      //Categoria A, B, C 
      // A : A-1,A-2 | A-1 : Master, A-2 : Aprendiz
      // B : B-1,B-2
      // C : C-1,C-2
      String cat="B";
      String subCat="B-3";  

        if (cat.equals("A")){
            System.out.println("---Categoria A---");
            if(subCat.equals("A-1")){
                System.out.println("Eres Master");
            }else if(subCat.equals("A-2")){
                System.out.println("Eres Aprendiz");
            }else {
                System.out.println("La subcategoria no existe");
            }
        }else if (cat.equals("B")){
            System.out.println("---Categoria B---");
            if(subCat.equals("B-1")){
                System.out.println("Eres Master");
            }else if(subCat.equals("B-2")){
                System.out.println("Eres Aprendiz");
            }else {
                System.out.println("La subcategoria no existe");
            }
        }else if (cat.equals("C")){
            System.out.println("---Categoria C---");
            if(subCat.equals("C-1")){
                System.out.println("Eres Master");
            }else if(subCat.equals("C-2")){
                System.out.println("Eres Aprendiz");
            }else {
                System.out.println("La subcategoria no existe");
            }

        }else {
            System.out.println("Categoria no existe");
        }


    }

}

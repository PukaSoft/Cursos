public class Metodos {
    /*
            - Con parametro (tipoDato name)
            - Sin Parametro ()
        #Return
            TipoDato name(){
                return algo;
            }
        #void
            void name(){
                System.out.print("Hello");
            }

    */
            
    String saludar(){
        return "Hola a todos por metodo return";
    }

    void saludar2(){
        System.out.println("Hola a todos por metodo void");
    }

    public static void main(String[] args){
        Metodos objeto = new Metodos();
        objeto.saludar2(); 
        String miSaludo = objeto.saludar() + ", espero que esten entendiendo";
        System.out.println(miSaludo);              
    }
}


public class Excepcion {

    /**
        try{
            to-do
        }catch(Exeception v){
            imprimir(v)
        }
      
     */

    public static void main(String[] args){
        Excepcion excepcion = new Excepcion();
        int resultado;
        try {
            resultado = excepcion.division(50, 0);

        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println("Error : " + e);
        } finally{
            System.out.println("Termino el proceso");
        }
            System.out.println("El programa sigue funcionando");
        
        
            try {
                excepcion.superior();
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        
        }
        

    int division(int a, int b) throws ArithmeticException{
        return a/b;
    }

    void superior() throws Exception {
        try {
            intermedio();
        } catch (Exception e) {
            //TODO: handle exception
            throw new Exception("Error metodo Superior "  + e);
        }
    }

    void intermedio() throws Exception{
        try{
            inferior();
        }catch(Exception e){
            throw new Exception("Error metodo Intermedio "  + e);

        }
    }

    void inferior() throws Exception{
        throw new Exception("Error metodo inferior");
    }
    
}

public class Ej22 {
    public static void main (String[] args){
    /*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos. */
        
        boolean primo = false;

        for (int x = 2; x <= 100; x++) {

            primo = true;
            for (int i = 2; i < x; i++) {
              if (x % i == 0) {
                primo = false;
              }
            }
      
            if (primo) {
              System.out.print(x + " ");
            }
          }


    }
}

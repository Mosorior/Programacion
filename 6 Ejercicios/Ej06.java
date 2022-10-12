import java.util.Scanner;
public class Ej06 {
    public static void main (String[] args) {
        /* Escribe un programa que piense un número al azar entre 0 y 100. El usuario
debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 */
        System.out.println("Se ha generado automáticamente un número, intenta adivinarlo: ");
        double numSecD = Math.random()*100;
        int numSec = (int)numSecD;
        Scanner s = new Scanner(System.in);
        int numtry = 0;
        boolean win = false;

        for(int i = 0; i <6; i++){
            numtry = s.nextInt();
            if(numtry == numSec){
                win = true;
                i = 5;
            }
            if(numtry < numSec){
                System.out.println("El número es mayor.");
            }
            if(numtry > numSec){
                System.out.println("El número es menor.");
            }
        }
        if(win = false){
            System.out.println("HAS PERDIDO.");
        }
        if(win = true){
            System.out.println("HAS ACERTADO!!!");
        }

    }
}

import java.util.Scanner;
public class Ej7 {
    /* Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte. */
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("La caja fuerte requiere una combinación de 4 cifras. Establézcalas a continuación: ");
        int pass = s.nextInt();
        int trypass = 0;

        System.out.println("Pruebe a abrir la caja fuerte. Introduzca el código de 4 cifras: ");

        for(int i = 0; i < 4; i++){
            trypass = s.nextInt();
            if(trypass == pass){
                i = 4;
            }
            if(trypass != pass){
                System.out.println("Lo siento, esa no es la combinación. " + (3-i) + " intentos restantes");
            }

        }
        if(trypass == pass){
            System.out.println("La caja se ha abierto satisfactoriamente.");
        }
        if(trypass != pass){
            System.out.println("La caja se ha bloqueado por motivos de seguridad.");
        }
    }   
}

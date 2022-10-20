import java.util.Scanner;
public class Ej06 {
    public static void main(String[] args) {
        /* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array. */
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca 15 números separados por enter:");

        int[] num;
        num = new int[15];
        int aux;

        for(int i = 0; i <15; i++){
            num[i] = s.nextInt();
        }
        aux = num[14];

        for(int i = 14; i >0; i--){
            num[i] = num[i-1];
        }
        num[0] = aux;

        System.out.println("\nDespués de rotarlos: ");
        for(int i = 0; i<15; i++){
            System.out.println(num[i]);
        }
    }
}

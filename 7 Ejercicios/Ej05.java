import java.util.Scanner;
public class Ej05 {
    public static void main(String[] args) {
    /* Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente. */
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca 10 números por teclado separados por enter:");

            int[] num;
            num = new int[10];
            int max;
            int min;
            num[0] = s.nextInt();
            max = num[0];
            min = num[0];
        for(int i = 1; i <10; i++){
            num[i]= s.nextInt();
            if(num[i]>max){
                max= num[i];
            }
            if(num[i]<min){
                min= num[i];
            }
        }
        System.out.println("Se mostrarán los números:\n");
        for(int i = 0; i <10; i++){
            System.out.print(num[i]);
            if(num[i] == max){
                System.out.print(" <-- MÁXIMO");
            }
            if(num[i] == min){
                System.out.print(" <-- MÍNIMO");
            }
            System.out.println("");

        }

    }
}

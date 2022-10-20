import java.util.Scanner;
public class Ej07 {
    public static void main(String[] args) {
        /* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces
por teclado dos valores y a continuación cambiará todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los números
que se han cambiado deben aparecer entrecomillados. */
        Scanner s = new Scanner(System.in);

        int[] num;
        num = new int[100];

        System.out.println("\nSe generarán una serie de números: ");
        for(int i = 0; i < 100; i++){
            num[i] = (int)(Math.random()*20);
        }
        for(int i = 0; i < 100; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println("\nIntroduzca el número a cambiar: ");
        int reemplazar = s.nextInt();

        System.out.println("Introduzca el número por el que se cambiará: ");
        int cambio = s.nextInt();

        for(int i = 0; i < 100; i++){
            if(num[i] != reemplazar){
                System.out.print(num[i] + " ");
            }
            if(num[i] == reemplazar){
                System.out.print("'"+ cambio + "' ");
            }
        }


    }
}

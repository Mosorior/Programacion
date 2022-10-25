import java.util.Scanner;
public class Ej12 {
    public static void main(String[] args) {
        /* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que
ambos números están entre 0 y 9. El programa deberá colocar el número de
la posición inicial en la posición final, rotando el resto de números para que no
se pierda ninguno. Al final se debe mostrar el array resultante. */
        Scanner s = new Scanner(System.in);

        int[] num = new int[10];
        int inicial,fin;
        Boolean valid, valido = true;

        System.out.println("Introduzca 10 números separados por enter.");

        for(int i = 0; i < 10; i++){
            num[i] = s.nextInt();
        }
        System.out.println("A continuación se rotará el array.\nIntroduzca la posición inicial (0-9):");
        do{
            do{
                inicial = s.nextInt();
                if(inicial < 0 || inicial > 9){
                    valid = false;
                    System.out.println("Ese número no es válido, vuelva a introducirlo:");
                }
                else{
                    valid = true;
                }
            }while(valid == false);

            valid = false;
            System.out.println("Introduzca la posición final (0-9):");
            do{
                fin = s.nextInt();
                if(fin < 0 || fin > 9){
                    valid = false;
                    System.out.println("Ese número no es válido, vuelva a introducirlo:");
                }
                else{
                    valid = true;
                }
            }while(valid == false);
            if(inicial >= fin){
                valido = false;
                System.out.println("Números inválidos, vuelva a introducirlos.\nIntroduzca la posicioón inicial.");
            }
            else{
                valido = true;
            }
        }while(valido == false);
        


    }
}

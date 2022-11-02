import java.util.Random;
import java.util.Scanner;
public class Ej13 {
    /* Escribe un programa que rellene un array de 100 elementos con números ente-
ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] n = new int[100];
        int max= 0;
        int min = 500;
        int seleccion = 0;
        String cout;
        Boolean valido = false;

        for(int i = 0; i< 100; i++){
            n[i] = (int)(Math.random()*500);
            if(n[i] > max){
                max = n[i];
            }
            if(n[i] < min){
                min = n[i];
            }
            System.out.print(n[i] + " ");
        }
        System.out.println();
        System.out.println("¿Desea destacar el máximo o el mínimo? (max/min)");
        while(!valido){
            cout = s.next();
            switch(cout){
                case "max":
                seleccion = max;
                valido = true;
                break;
                case "min":
                seleccion = min;
                valido = true;
                break;
                default:
                System.out.println(cout + "No es una opción válida, por favor, vuelva a introducirla:");

            }
        }
       
        for(int i = 0; i < 100; i++){
            if(n[i] == seleccion){
                System.out.print("**" + n[i] + "**" + " ");
            }
            else{
                System.out.print(n[i]+ " ");
            }
        }
        




    }
}

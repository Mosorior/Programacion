import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ej20to28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ejer = 0;
        int l;
        int max;
        int min;
        int[] array;
        System.out.println("-----NÚMERO DE EJERCICIO-----");
        System.out.println("   1. GENERA ARRAY");
        System.out.println("   2. MINIMO ARRAY");
        System.out.println("   3. MAXIMO ARRAY");
        System.out.println("   4. MEDIA ARRAY");
        System.out.println("   5. ESTA EN ARRAY");
        System.out.println("   6. POSICION EN ARRAY");
        System.out.println("   7. VOLTEA ARRAY");
        System.out.println("   8. ROTA DERECHA");
        System.out.println("   9. ROTA IZQUIERDA");

        System.out.print("Introduzca el número: ");
        ejer = s.nextInt();

        switch (ejer){
            case 1:
            System.out.println("Se generará un array aleatorio con los valores máximos y mínimos proporcionados y la longitud deseada:");
            System.out.print("Longitud: ");
            l = s.nextInt();
            System.out.print("Máximo: ");
            max = s.nextInt();
            System.out.print("Mínimo: ");
            min = s.nextInt();

            System.out.println("Se sacará el array por salida: ");

            array = new int[l];
            array = generaArrayInt(l, max, min);
            for(int i = 0; i < l; i++){
                System.out.print("["+array[i]+"] ");
            }
            break;

            case 2: 
            System.out.println("Introduzca un array y se extraerá el valor mínimo:");
            System.out.print("Dimensión: ");
            l = s.nextInt();
            System.out.print("Array (separado por ENTER): ");
            array = new int[l];

            for(int i = 0; i < l; i++){
                array[i] = s.nextInt();
            }

            System.out.println("El valor mínimo de este array es " + minimoArrayInt(array));
            break;

            case 3: 
            System.out.println("Introduzca un array y se extraerá el valor máximo:");
            System.out.print("Dimensión: ");
            l = s.nextInt();
            System.out.print("Array (separado por ENTER): ");
            array = new int[l];

            for(int i = 0; i < l; i++){
                array[i] = s.nextInt();
            }

            System.out.println("El valor máximo de este array es " + maximoArrayInt(array));
            break;

            case 4: 
            System.out.println("Introduzca un array y se extraerá la media:");
            System.out.print("Dimensión: ");
            l = s.nextInt();
            System.out.print("Array (separado por ENTER): ");
            array = new int[l];

            for(int i = 0; i < l; i++){
                array[i] = s.nextInt();
            }

            System.out.println("La media de este array es " + mediaArrayInt(array));
            break;
        }

    }

    /*--------------------------------GENERA ARRAY INT ----------------------------------- */
    public static int[] generaArrayInt(int d, int max, int min){
        int[] ArrayInt = new int[d];
        for(int i = 0; i < d; i++){
            ArrayInt[i] = (int)(Math.random()*(max-min+1)+min);
        }

    return ArrayInt;
    }

    /*--------------------------------MINIMO ARRAY INT ---------------------------------- */
    public static int minimoArrayInt(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    /*--------------------------------MAXIMO ARRAY INT ---------------------------------- */
    public static int maximoArrayInt(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    /*--------------------------------MEDIA ARRAY INT ---------------------------------- */
    public static int mediaArrayInt(int[] array){
        int media = 0;
        for(int i = 0; i < array.length; i++){
            media = media+array[i];
        }
        return media/array.length;
    }

    /*--------------------------------ESTA EN ARRAY ---------------------------------- */
    public static boolean estaEnArray(int[] array, int n){

        return false;
    }



}

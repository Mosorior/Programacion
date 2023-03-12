import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {

    public static void main(String[] args) {
        // Pedir 10 números enteros por teclado y almacenarlos en un ArrayList
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número entero: ");
            int num = sc.nextInt();
            nums.add(num);
        }

        // Ordenar la lista de números enteros
        Collections.sort(nums);

        // Imprimir la lista ordenada por pantalla
        System.out.println("Números ordenados:");
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
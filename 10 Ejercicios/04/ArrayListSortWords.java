import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSortWords {

    public static void main(String[] args) {
        // Pedir palabras por teclado y almacenarlas en un ArrayList
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce una palabra: ");
            String word = sc.next();
            words.add(word);
        }

        // Ordenar la lista de palabras
        Collections.sort(words);

        // Imprimir la lista ordenada por pantalla
        System.out.println("Palabras ordenadas:");
        for (String word : words) {
            System.out.println(word);
        }
    }

}

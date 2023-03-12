import java.util.ArrayList;
import java.util.Random;

public class ArrayListStats {

    public static void main(String[] args) {
        // Generar un tamaño aleatorio entre 10 y 20
        Random rand = new Random();
        int size = rand.nextInt(11) + 10;

        // Generar una lista de números aleatorios entre 0 y 100
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            nums.add(rand.nextInt(101));
        }

        // Calcular la suma, la media, el máximo y el mínimo
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        double avg = (double) sum / size;

        // Imprimir los resultados
        System.out.println("Lista: " + nums);
        System.out.println("Suma: " + sum);
        System.out.println("Media: " + avg);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }

}


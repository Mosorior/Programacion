import java.util.Scanner;
public class Práctica_examen {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        int count = 0;
        
        while(count != 10){
            i++;
            if(i%2 != 0 && i%3 != 0){
                count++;
                System.out.println(i);
            }

        }
    }
}
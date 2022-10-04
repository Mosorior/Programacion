import java.util.Scanner;
public class Ej13 {
    /* Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos. */

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca diez números: ");
        int i = 0;
        int x = 0;
        int pos = 0;
        int neg= 0;
        
        do{
            x = s.nextInt();
            if(x < 0){
                neg++;
            }
            if(x > 0){
                pos++;
            }
            
            i++;
        }while(i <= 9);	
        
        System.out.println("Hay " + pos + " números positivos y " + neg + " negativos.");
	}

}
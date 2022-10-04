import java.util.Scanner;
public class Ej8 {
    /* Muestra la tabla de multiplicar de un número introducido por teclado */
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int x = s.nextInt();
        
        for(int i = 0; i <= 10; i++){
            System.out.println(x + " x " + i + " = " + x*i);
        }
			
	
	}


}

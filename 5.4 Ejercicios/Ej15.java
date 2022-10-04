import java.util.Scanner;
public class Ej15 {
    /* Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2¹, 2², 2³, 2⁴ y 2⁵.*/

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca una base: ");
        int b = s.nextInt();
        System.out.println("Introduzca un exponente (entero positivo): ");
        int etotal = s.nextInt();
        int i = 0;
        int res = 0;
        res = b;
        int e = 1;
        do{
            
            i++;
            System.out.println(b + "^" + e + " = " + res);
            res = (res*b);
            e++;
        }while(i <= (etotal-1));	
        
	}

}
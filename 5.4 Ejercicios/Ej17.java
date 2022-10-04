import java.util.Scanner;
public class Ej17 {
    /* Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo). */
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero entero positivo: ");
        int x = s.nextInt();
        int sum = 0;

        if(x < 0){
            System.out.println("Número inválido, introduzca un número positivo.");
        }
        if (x > 0){
            for(int i = x; i < x+100; i++){
            sum += i;
            }
        System.out.println("La suma de los 100 siguientes números es " + sum);
        
        }
    }   
}
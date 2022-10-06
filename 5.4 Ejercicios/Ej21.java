import java.util.Scanner;
public class Ej21 {
    public static void main (String[] args){
    /* Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo. */
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca tantos números como desee, se parará al insertar un número negativo.");

        int neg = 0;
        int i = 0;
        int impar = 0;
        int imparsum= 0;
        int hipar = 0;
        while(neg >=0){
            i++;
            System.out.println("Número "+ i);
            neg = s.nextInt();
            if (neg%2 != 0){
                imparsum+=neg;
                impar++;
            }
            if(neg > hipar){
                hipar = neg;
            }


        }
        System.out.println("Se han introducido "+ (i-1) + " números.");
        System.out.println("La media de los impares es de "+ ((double)(imparsum/impar)));
        System.out.println("El número par más grande fue "+ hipar);
    }
}

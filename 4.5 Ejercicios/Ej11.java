import java.util.Scanner;
public class Ej11 {
    public static void main (String[] args){
        /*Escribe un programa que dada una hora determinada (horas y minutos),
calcule los segundos que faltan para llegar a la medianoche.*/
        Scanner s = new Scanner(System.in); 

        System.out.print("Introduzca las horas: ");
        int h = s.nextInt();
        System.out.print("Introduzca los minutos: ");
        int m = s.nextInt();

        if (h < 0 ||h > 24 || m < 0 || m >= 60){
        System.out.print("La hora es inválida.");
        }
        else{
        System.out.println("Quedan " + ((24*60*60)-((h*60*60)+(m*60))) + "s para media noche.");
        }
    }
}
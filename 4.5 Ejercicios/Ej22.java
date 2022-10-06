import java.util.Scanner;
public class Ej22 {
 /*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h. */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca día de la semana (Lun, Mar, Mie, Jue, Vie): ");
        String dia = s.next();
        int d = 0;
        switch(dia){
            case "Lun":
            d = 1;
            break;

            case "Mar":
            d = 2;
            break;

            case "Mie":
            d = 3;
            break;

            case "Jue":
            d = 4;
            break;

            case "Vie":
            d = 5;
            break;
            
            default:
            System.out.println("Día inválido, se procederá con 'Lunes'.");
            d = 1;
        }

        System.out.println("Introduzca la hora: ");
        int h = s.nextInt();
        System.out.println("Introduzca los minutos: ");
        int m = s.nextInt();
        System.out.println("Faltan " + (((5*24*60)+(15*60))  -  ((d*24*60)+(h*60)+m)) + "min para el fin de semana.");

    }

}

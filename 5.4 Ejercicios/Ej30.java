import java.util.Scanner;
public class Ej30 {

    /*30. Realiza una programa que calcule las horas transcurridas entre
dos horas de dos días de la semana. No se tendrán en cuenta los
minutos ni los segundos. El día de la semana se puede pedir como
un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
Se debe comprobar que el usuario introduce los datos correctamente
y que el segundo día es posterior al primero.
Ejemplo:
Por favor, introduzca la primera hora.
Día: lunes
Hora: 18
Por favor, introduzca la segunda hora.
Día: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int firstDay = 0;
    int secondDay = 0;
    int firstHour = 0;
    int secondHour = 0;
    String firstDayString;
    String secondDayString;
    String nombrefirstDay = "";
    String nombresecondDay = "";
    boolean datosCorrectos = true;
  
  
      do {
        System.out.println("\nPor favor, introduzca la primera hora.");
  
        boolean diaCorrecto;
  
        do {
  
          diaCorrecto = true;
  
          System.out.print("Día: ");
          firstDayString = s.next();
  
          switch (firstDayString) {
            case "lunes":
            case "1":
              firstDay = 1;
              nombrefirstDay = "lunes";
              break;
            case "martes":
            case "2":
              firstDay = 2;
              nombrefirstDay = "martes";
              break;
            case "miércoles":
            case "3":
              firstDay = 3;
              nombrefirstDay = "miercoles";
              break;
            case "jueves":
            case "4":
              firstDay = 4;
              nombrefirstDay = "jueves";
              break;
            case "viernes":
            case "5":
              firstDay = 5;
              nombrefirstDay = "viernes";
              break;
            case "sábado":
            case "6":
              firstDay = 6;
              nombrefirstDay = "sábado";
              break;
            case "domingo":
            case "7":
              firstDay = 7;
              nombrefirstDay = "domingo";
              break;
            default:
              diaCorrecto = false;
          }
  
          if (!diaCorrecto) {
            System.out.println("No se ha introducido correctamente el día de la semana.");
            System.out.print("Los días válidos son: lunes, martes, miércoles, ");
            System.out.println("jueves, viernes, sábado y domingo.");
          }
  
        } while (!diaCorrecto);
  
        boolean horaCorrecta;
  
        do {
          horaCorrecta = true;
          System.out.print("Hora: ");
          firstHour = s.nextInt();
          if ((firstHour < 0) || (firstHour > 23)) {
            System.out.println("No se ha introducido correctamente la hora del día.");
            System.out.println("Las horas válidas están entre 0 y 23.");
            horaCorrecta = false;
          }
        } while (!horaCorrecta);
  
        System.out.println("Por favor, introduzca la segunda hora.");
  
        do {
  
          datosCorrectos = true;
  
          diaCorrecto = true;
  
          System.out.print("Día: ");
          secondDayString = s.next();
  
          switch (secondDayString) {
            case "lunes":
            case "1":
              secondDay = 1;
              nombresecondDay = "lunes";
              break;
            case "martes":
            case "2":
              secondDay = 2;
              nombresecondDay = "martes";
              break;
            case "miércoles":
            case "3":
              secondDay = 3;
              nombresecondDay = "miércoles";
              break;
            case "jueves":
            case "4":
              secondDay = 4;
              nombresecondDay = "jueves";
              break;
            case "viernes":
            case "5":
              secondDay = 5;
              nombresecondDay = "viernes";
              break;
            case "sábado":
            case "6":
              secondDay = 6;
              nombresecondDay = "sábado";
              break;
            case "domingo":
            case "7":
              secondDay = 7;
              nombresecondDay = "domingo";
              break;
            default:
              secondDay = 0;
          }
  
          if (!diaCorrecto) {
            System.out.println("No se ha introducido correctamente el día de la semana.");
            System.out.print("Los días válidos son: lunes, martes, miércoles, ");
            System.out.println("jueves, viernes, sábado y domingo.");
          }
  
        } while (!diaCorrecto);
  
        if (secondDay <= firstDay) {
          System.out.println("El segundo día debe ser posterior al primero.");
          datosCorrectos = false;
        }
  
        if (datosCorrectos) {
          do {
            horaCorrecta = true;
            System.out.print("Hora: ");
            secondHour = s.nextInt();
            if ((secondHour < 0) || (secondHour > 23)) {
              System.out.println("No se ha introducido correctamente la hora del día.");
              System.out.println("Las horas válidas están entre 0 y 23.");
              horaCorrecta = false;
            }
          } while (!horaCorrecta);
  
        }
  
      } while (!datosCorrectos);

  
      System.out.print("Entre las " + firstHour + ":00h del " + nombrefirstDay);
      System.out.print(" y las " + secondHour + ":00h del " + nombresecondDay);
      System.out.println(" hay " + (((secondDay * 24) + secondHour) - ((firstDay * 24) + firstHour)) + " hora/s.");
  
    }
  }

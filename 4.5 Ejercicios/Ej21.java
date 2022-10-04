import java.util.Scanner;
public class Ej21 {
    /*Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación
que se califica como apto o no apto, por tanto se debe preguntar al usuario
¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
mantiene la nota media anterior. */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        System.out.println("Introduzca las notas de los dos primeros controles:");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();

        if((x1+x2)/2 >= 5 && x1 >= 0 && x2 >=0 && x1 <=10 && x2 <=10){
            System.out.println("Tu nota es " + (x1+x2)/2);
        }
        if((x1+x2)/2 < 5 && x1 >= 0 && x2 >=0 && x1 <=10 && x2 <=10){
            System.out.println("Suspenso. Introduzca la nota de la recuperación: ");
            double rec = s.nextDouble();
            if(rec >= 5 && rec > 0 && rec <=10){
                System.out.println("Apto.");
            }
            if(rec < 5 && rec > 0 && rec<=10){
                System.out.println("No apto.");
            }
        }
        
    
    }
}

import java.util.Scanner;
public class Ej12 {
    public static void main (String[] args){
        /*Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario
a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.*/
        Scanner s = new Scanner(System.in); 
        System.out.println("CUESTIONARIO");
        System.out.println("Introduzca la letra de la respuesta (si es la a), se introduce a)");
        int resultado = 0;

        /*Pregunta 1 */
        System.out.println("1) ¿Que función sirve para importar el Scanner en java?");
        System.out.println("a) java import.Scanner;");
        System.out.println("b) import.utils.Scanner;");
        System.out.println("c) import java.util.Scanner;");
        System.out.print("d) import.java.Scanner");
        String res1 = s.next();
        switch (res1){
            case "a":
            System.out.println("Respuesta incorrecta.");
            break;
       
            case "b":
            System.out.println("Respuesta incorrecta.");
            break;

            case "c":
            System.out.println("Correcto.");
            resultado = resultado++;
            break;

            case "d":
            System.out.println("Respuesta incorrecta.");
            break;
        }
        /*Pregunta 2 */
        System.out.println("2) ¿Cuál es la forma correcta de inicializar una variable tipo string?");
        System.out.println("a) int ''cadena'' ");
        System.out.println("b) import.utils.Scanner;");
        System.out.println("c) import java.util.Scanner;");
        System.out.print("d) import.java.Scanner");
        String res2 = s.next();
        switch (res2){
            case "a":
            System.out.println("Respuesta incorrecta.");
            break;
       
            case "b":
            System.out.println("Respuesta incorrecta.");
            break;

            case "c":
            System.out.println("Correcto.");
            resultado = resultado++;
            break;

            case "d":
            System.out.println("Respuesta incorrecta.");
            break;
        }

    }
}

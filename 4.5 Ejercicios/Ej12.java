import java.util.Scanner;
public class Ej12 {
    public static void main (String[] args){
        /*Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario
a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.*/
        Scanner s = new Scanner(System.in); 
        System.out.println("CUESTIONARIO");
        System.out.println("Introduzca la letra de la respuesta (si es la a), se introduce a )\n\n\n\n");
        int resultado = 0;

        /*Pregunta 1 */
        System.out.println("1) ¿Que función sirve para importar el Scanner en java?");
        System.out.println("a) java import.Scanner;");
        System.out.println("b) import.utils.Scanner;");
        System.out.println("c) import java.util.Scanner;");
        System.out.print("d) import.java.Scanner\n");
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
            resultado++;
            break;

            case "d":
            System.out.println("Respuesta incorrecta.");
            break;

            default:
            System.out.println("Opción inválida. Respuesta incorrecta.");
            break;
        }


        /*Pregunta 2 */
        System.out.println("\n\n\n2) ¿Cuál es la forma correcta de inicializar una variable tipo string?");
        System.out.println("a) String c = ''cadena''; ");
        System.out.println("b) String ''cadena'' = ''cadena'';");
        System.out.println("c) import java.util.Scanner;");
        System.out.print("d) int ''cadena'';\n");
        String res2 = s.next();
        switch (res2){
            case "a":
            System.out.println("Correcto.");
            resultado++;
            break;
       
            case "b":
            System.out.println("Respuesta incorrecta.");
            break;

            case "c":
            System.out.println("Respuesta incorrecta.");
            break;

            default:
            System.out.println("Opción inválida. Respuesta incorrecta.");
            break;
        }


        /*Pregunta 3 */
        System.out.println("\n\n\n3) ¿Qué tipo de lenguaje es aquel en el que se le indica a la computadora una serie de pasos?");
        System.out.println("a) Subjuntivo");
        System.out.println("b) Indicativo");
        System.out.println("c) Demandante");
        System.out.print("d) Imperativo\n");
        String res3 = s.next();
        switch (res3){
            case "a":
            System.out.println("Respuesta incorrecta.");
            break;
       
            case "b":
            System.out.println("Respuesta incorrecta.");
            break;

            case "c":
            System.out.println("Respuesta incorrecta.");
            break;

            case "d":
            System.out.println("Correcto.");
            resultado++;
            break;

            default:
            System.out.println("Opción inválida. Respuesta incorrecta.");
            break;
        }

        /*Pregunta 4 */
        System.out.println("\n\n\n4) ¿Qué es el software libre?");
        System.out.println("a) Es el software en el que los usuarios pueden copiar, distribuir, estudiar, modificar y mejorar el software.");
        System.out.println("b) Es el software que los usuarios pueden usar de forma gratuita.");
        System.out.println("c) Es aquel software que da libertad a los usuarios para usar su código y estudiarlo pero no pueden cambiarlo ni distribuirlo libremente.");
        System.out.print("d) Ninguna de las anteriores.\n");
        String res4 = s.next();
        switch (res4){
            case "a":
            System.out.println("Correcto.");
            resultado++;
            break;
       
            case "b":
            System.out.println("Respuesta incorrecta.");
            break;

            case "c":
            System.out.println("Respuesta incorrecta.");
            break;

            case "d":
            System.out.println("Respuesta incorrecta.");
            break;

            default:
            System.out.println("Opción inválida. Respuesta incorrecta.");
            break;
        }

        /*Pregunta 5 */
        System.out.println("\n\n\n5) ¿Qué formato tienen las páginas HTML?");
        System.out.println("a) Son ficheros de texto. Podemos leer su contenido con cualquier procesador de texto.");
        System.out.println("b) Son ficheros de texto especiales. Solo pueden leerlos los navegadores, un editor de texto normal no podría abrirlo.");
        System.out.println("c) Son ficheros binarios compilados. No se pueden leer, solo ejecutar en un navegador.");
        System.out.print("d) Te has pasado, vuelve arriba.\n");
        String res5 = s.next();
        switch (res5){
            case "a":
            System.out.println("Respuesta incorrecta");

            break;
       
            case "b":
            System.out.println("Correcto.");
            resultado++;
            break;

            case "c":
            System.out.println("Respuesta incorrecta.");
            break;

            case "d":
            System.out.println("Respuesta incorrecta... Increíblemente...");
            break;

            default:
            System.out.println("Opción inválida. Respuesta incorrecta.");
            break;
        }


        /*Pregunta 6 */
        System.out.println("\n\n\n6) ¿Es HTML retrocompatible con sus versiones previas?");
        System.out.println("a) No, el navegador saca un error 404");
        System.out.println("b) Si, pero se ve en blanco.");
        System.out.println("c) Si, funciona exactamente igual.");
        System.out.print("d) Si, aunque algunas funciones pueden fallar.\n");
        String res6 = s.next();
        switch (res6){
            case "a":
            System.out.println("Respuesta incorrecta");

            break;
       
            case "b":
            System.out.println("Respuesta incorrecta.");
            break;

            case "c":
            System.out.println("Respuesta incorrecta.");
            break;

            case "d":
            System.out.println("Correcto.");
            resultado++;
            break;

            default:
            System.out.println("Opción inválida. Respuesta incorrecta.");
            break;
        }


        /*Pregunta 7 */
        System.out.println("\n\n\n7) ¿Qué es Markdown?");
        System.out.println("a) Un lenguaje que permite dar formato a páginas web en HTML.");
        System.out.println("b) Una función de HTML6");
        System.out.println("c) Un lenguaje que permite dar formato al texto simple.");
        System.out.print("d) Un visor de PDF.\n");
        String res7 = s.next();
        switch (res7){
            case "a":
            System.out.println("Respuesta incorrecta");

            break;
       
            case "b":
            System.out.println("Respuesta incorrecta.");
            break;

            case "c":
            System.out.println("Correcto.");
            resultado++;
            break;

            case "d":
            System.out.println("Respuesta incorrecta.");
            break;

            default:
            System.out.println("Opción inválida. Respuesta incorrecta.");
            break;
        }

        /*Pregunta 8 */
        System.out.println("\n\n\n8) ¿Qué es una base de datos?");
        System.out.println("a) Es un programa capaz de almacenar una gran cantidad de datos relacionados y estructurados.");
        System.out.println("b) Es un programa que ejecuta una serie de instrucciones paso a paso");
        System.out.println("c) Un tipo de lenguaje.");
        System.out.print("d) Un programa que guarda fórmulas para cada interacción con el ordenador.\n");
        String res8 = s.next();
        switch (res8){
            case "a":
            System.out.println("Correcto.");
            resultado++;
            break;
       
            case "b":
            System.out.println("Respuesta incorrecta.");
            break;

            case "c":
            System.out.println("Incorrecto.");
            break;

            case "d":
            System.out.println("Respuesta incorrecta.");
            break;

            default:
            System.out.println("Opción inválida. Respuesta incorrecta.");
            break;
        }

        /*Pregunta 9 */
        System.out.println("\n\n\n9) ¿Qué es Ubuntu?");
        System.out.println("a) Un lenguaje de programación orientado a machine learning.");
        System.out.println("b) Un sistema operativo propietario.");
        System.out.println("c) Un sistema operativo de software libre basado en Windows.");
        System.out.print("d) Un sistema operativo basado en Debian.\n");
        String res9 = s.next();
        switch (res9){
            case "a":
            System.out.println("Respuesta incorrecta");

            break;
       
            case "b":
            System.out.println("Respuesta incorrecta.");
            break;

            case "c":
            System.out.println("Respuesta Incorrecta");
            break;

            case "d":
            System.out.println("Correcto.");
            resultado++;
            break;

            default:
            System.out.println("Opción inválida. Respuesta incorrecta.");
            break;
        }


        /*Pregunta 10 */
        System.out.println("\n\n\n10) ¿Qué lenguajes se pueden usar en páginas web?");
        System.out.println("a) HTML, CSS y PHP.");
        System.out.println("b) Python y Ruby.");
        System.out.println("c) C#.");
        System.out.print("d) Todos los anteriores.\n");
        String res10 = s.next();
        switch (res10){
            case "a":
            System.out.println("Respuesta incorrecta");

            break;
       
            case "b":
            System.out.println("Respuesta incorrecta.");
            break;

            case "c":
            System.out.println("Respuesta Incorrecta");
            break;

            case "d":
            System.out.println("Correcto.");
            resultado++;
            break;

            default:
            System.out.println("Opción inválida. Respuesta incorrecta.");
            break;
        }

        System.out.print("\n\n\n EL RESULTADO FINAL DE ESTE TEST HA SIDO DE \n \n " + resultado + "/10 \n\n PUNTOS.");

    }
}

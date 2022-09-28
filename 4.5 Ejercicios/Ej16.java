import java.util.Scanner;
public class Ej16 {
    /*Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
nos está siendo infiel. El programa irá haciendo preguntas que el usuario
contestará con verdadero o falso. Cada pregunta contestada como verdadero
sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utiliza el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
del programa. */
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String bres;
    int res = 0;
    System.out.println("\tTEST DE INFIDELIDAD\n\n Contesta con verdadero (V) o falso (F)\n\n");

    /*Pregunta 1 */
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    bres = s.next();
    switch(bres){
        case "V":
        res++;
        res++;
        res++;
        System.out.println("Siguiente pregunta: \n");
        break;
        case "F":
        System.out.println("Siguiente pregunta: \n");
        break;
        default:
        System.out.println("Respuesta inválida.");
    }

    /*Pregunta 2 */
    System.out.println("2. Ha aumentado sus gastos de vestuario.");
    bres = s.next();
    switch(bres){
        case "V":
        res++;
        res++;
        res++;
        System.out.println("Siguiente pregunta: \n");
        break;
        case "F":
        System.out.println("Siguiente pregunta: \n");
        break;
        default:
        System.out.println("Respuesta inválida.");
    }
    
    /*Pregunta 3 */
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
    bres = s.next();
    switch(bres){
        case "V":
        res++;
        res++;
        res++;
        System.out.println("Siguiente pregunta: \n");
        break;
        case "F":
        System.out.println("Siguiente pregunta: \n");
        break;
        default:
        System.out.println("Respuesta inválida.");
    }

    /*Pregunta 4 */
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
    bres = s.next();
    switch(bres){
        case "V":
        res++;
        res++;
        res++;
        System.out.println("Siguiente pregunta: \n");
        break;
        case "F":
        System.out.println("Siguiente pregunta: \n");
        break;
        default:
        System.out.println("Respuesta inválida.");
    }

    /*Pregunta 5 */
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    bres = s.next();
    switch(bres){
        case "V":
        res++;
        res++;
        res++;
        System.out.println("Siguiente pregunta: \n");
        break;
        case "F":
        System.out.println("Siguiente pregunta: \n");
        break;
        default:
        System.out.println("Respuesta inválida.");
    }

    /*Pregunta 6 */
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
    bres = s.next();
    switch(bres){
        case "V":
        res++;
        res++;
        res++;
        System.out.println("Siguiente pregunta: \n");
        break;
        case "F":
        System.out.println("Siguiente pregunta: \n");
        break;
        default:
        System.out.println("Respuesta inválida.");
    }

        /*Pregunta 7 */
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        bres = s.next();
        switch(bres){
            case "V":
            res++;
            res++;
            res++;
            System.out.println("Siguiente pregunta: \n");
            break;
            case "F":
            System.out.println("Siguiente pregunta: \n");
            break;
            default:
            System.out.println("Respuesta inválida.");
        }

        /*Pregunta 8 */
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        bres = s.next();
        switch(bres){
            case "V":
            res++;
            res++;
            res++;
            System.out.println("Siguiente pregunta: \n");
            break;
            case "F":
            System.out.println("Siguiente pregunta: \n");
            break;
            default:
            System.out.println("Respuesta inválida.");
        }
        /*Pregunta 9 */
        System.out.println("9. Has notado que últimamente se perfuma más.");
        bres = s.next();
        switch(bres){
            case "V":
            res++;
            res++;
            res++;
            System.out.println("Siguiente pregunta: \n");
            break;
            case "F":
            System.out.println("Siguiente pregunta: \n");
            break;
            default:
            System.out.println("Respuesta inválida.");
        }

        /*Pregunta 10 */
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        bres = s.next();
        switch(bres){
            case "V":
            res++;
            res++;
            res++;
            System.out.println("Siguiente pregunta: \n");
            break;
            case "F":
            System.out.println("Siguiente pregunta: \n");
            break;
            default:
            System.out.println("Respuesta inválida.");
        }

        System.out.println("\n \n");

        if (res <= 10){
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }
        if (res >= 11 && res <= 22){
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");

        }
        if (res >= 23){
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
 import java.util.Scanner;
public class Ej01to20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        boolean stop = false;
        int ejercicio;
        String x;
        char c;
        int v;
        
        while(stop!=true){

            System.out.println("Escriba el número del ejercicio ('-1' para salir):");
            ejercicio = s.nextInt();
            switch(ejercicio){
                case -1:
                stop = true;
                break;
                case 1:
                System.out.println("Introduzca un string, se contarán los espacios:");
                x = s.next();
                int numeroEspacios = Ej01to10.numeroEspacios(x);
                System.out.println("En total hay " + numeroEspacios + " espacios en el string.");
                    break;
                case 2:
                System.out.println("Introduzca un string, se contarán las vocales:");
                x = s.next();
                int numeroVocales = Ej01to10.numeroVocales(x);
                System.out.println("Hay " + numeroVocales + " vocales");
                    break;
                case 3:
                System.out.println("Introduzca una palabra o frase y dirá si es palíndromo o no: ");
                x = s.next();
                if(Ej01to10.esPalindromo(x)){
                    System.out.println(x + " es palíndromo.");
                }
                else{
                    System.out.println(x + " no es palíndromo.");
                }
                    break;
                case 4:
                System.out.println("Introduzca una frase o palabra y un caracter, se comprobará si el caracter está en la frase.");
                System.out.println("Introduzca la frase:");
                x = s.next();
                System.out.println("Introduzca el caracter");
                c = s.next().charAt(0);

                if(Ej01to10.contiene(x, c)){
                    System.out.println("El caracter " + c + " aparece en " + x);
                }
                else{
                    System.out.println("El caracter " + c + " no aparece en " + x);
                }
                    break;
                case 5:
                System.out.println("Introduzca un caracter:");
                c = s.next().charAt(0);
                System.out.println("Introduzca el número de veces que se repetirá:");
                v = s.nextInt();
                System.out.println(Ej01to10.repiteCaracter(c, v));
                    break;
                case 6:
                    break;
            }

        }


    }
}

 import java.util.Scanner;
public class Ej01to20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        boolean stop = false;
        int ejercicio;
        String x;
        String x2;
        char c;
        char c2;
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
                System.out.println("Introduce una cadena y una cantidad de espacios.");
                System.out.println("Introduce la cadena:");
                x = s.next();
                System.out.println("Introduce la cantidad de espacios");
                v = s.nextInt();
                System.out.println("El resultado es el siguiente: ");
                String pad = Ej01to10.padLeft(x, v);
                pad =Ej01to10.padRight(pad, v);
                System.out.println(pad);
                    break;
                case 7:
                System.out.println("Introduzca una cadena y se quitarán los espacios: ");
                x = s.next();
                System.out.println(Ej01to10.quitaEspacios(x));
                    break;
                case 8:
                System.out.println("Introduzca una cadena y se quitarán los espacios (sin trim()):");
                x = s.next();
                System.out.println(Ej01to10.quitaEspaciosTrim(x));
                    break;
                case 9:
                System.out.println("Introduzca un String y 2 caracteres y se sustiuirá el primero por el segundo:");
                x = s.next();
                System.out.println("Introduzca ahora el primer caracter.");
                c = s.next().charAt(0);
                System.out.println("Introduzca el segundo caracter:");
                c2 = s.next().charAt(0);
                System.out.println("El String sustituyendo " + c + " por " + c2 + " queda así: ");
                System.out.println(Ej01to10.sustituyeCaracter(x, c, c2));
                    break;
                case 10:
                    System.out.println("Introduzca una frase y se contarán las palabras: ");
                    x = s.next();
                    System.out.println("Hay " + Ej01to10.cuentaPalabras(x) + " palabras en " + x);
                    break;
                

                case 11:
                System.out.println("Introduzca un string y se dirá si está formada completamente por números o no.");
                x = s.next();
                if(Ej11to20.esNumero(x)){
                    System.out.println("Está completamente formada por números.");
                }
                else{
                    System.out.println("No está formada solo por números.");
                }
                    break;
                
                case 12:
                System.out.println("Introduzca un string: ");
                x = s.next();
                System.out.println("Introduzca el caracter a eliminar: ");
                c = s.next().charAt(0);
                System.out.println("El string quedaría así: ");
                System.out.println(Ej11to20.quitaCaracter(x, c));
                    break;

                case 13:
                    System.out.println("Introduzca una cadena a la que se le dará la vuelta: ");
                    x = s.next();
                    System.out.println(Ej11to20.invierteCadena(x));
                    break;
                case 14:
                    System.out.println("Introduzca una cadena y un caracter para contar las veces que aparece el caracter.");
                    System.out.println("Introduzca el String: ");
                    x = s.next();
                    System.out.println("Introduzca el caracter a buscar: ");
                    c = s.next().charAt(0);
                    System.out.println(c+ " se ha encontrado " + Ej11to20.vecesCaracter(x, c) + " veces.");
                    break;
                case 15:
                    System.out.println("Introduzca una frase y una palabra para contar las veces que aparece la palabra.");
                    System.out.println("Introduzca la frase: ");
                    x = s.next();
                    System.out.println("Introduzca la palabra a buscar: ");
                    x2 = s.next();
                    System.out.println("La palabra " + x2 + " se repite " + Ej11to20.vecesPalabra(x, x2));

            }

        }


    }
}

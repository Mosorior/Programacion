public class Ej02 {
    
    /* Realiza un programa que muestre al azar el nombre de una carta de la
baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos
usar String.valueOf(n). */

    public static void main (String[] args) {

        System.out.println("Se generará una carta aleatoria.");

        int palorand = (int)((Math.random()*4)+1);
        String palo;

        switch(palorand){
            case 1:
            palo = "picas";
            break;
            case 2:
            palo = "corazones";
            break;
            case 3:
            palo = "tréboles";
            break;
            case 4:
            palo = "diamantes";
            break;
            default:
            palo = "error";
            break;
        }

        int cartarand = (int)((Math.random()*13));
        String carta;

        switch(cartarand){
            case 1:
            carta = "A";
            break;
            case 2:
            carta = "2";
            break;
            case 3:
            carta = "3";
            break;
            case 4:
            carta = "4";
            break;
            case 5:
            carta = "5";
            break;
            case 6:
            carta = "6";
            break;
            case 7:
            carta = "7";
            break;
            case 8:
            carta = "8";
            break;
            case 9:
            carta = "9";
            break;
            case 10:
            carta = "10";
            break;
            case 11:
            carta = "J";
            break;
            case 12:
            carta = "Q";
            break;
            case 13:
            carta = "K";
            break;
            default:
            carta = "error";
            break;
        }

        System.out.println("La carta es el " + carta + " de " + palo);


    }

}

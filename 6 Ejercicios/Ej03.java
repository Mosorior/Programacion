public class Ej03 {
    
    public static void main (String[] args) {
        /* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */

        System.out.println("Se generará una carta aleatoria.");

        int palorand = (int)((Math.random()*4)+1);
        String palo;

        switch(palorand){
            case 1:
            palo = "espadas";
            break;
            case 2:
            palo = "oros";
            break;
            case 3:
            palo = "copas";
            break;
            case 4:
            palo = "bastos";
            break;
            default:
            palo = "error";
            break;
        }

        int cartarand = (int)((Math.random()*10)+1);
        String carta;

        switch(cartarand){
            case 1:
            carta = "as";
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
            carta = "sota";
            break;
            case 9:
            carta = "caballo";
            break;
            case 10:
            carta = "rey";
            break;
            default:
            carta = "error";
            break;
        }

        System.out.println("La carta es el " + carta + " de " + palo);


    }
    
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Carta {
    private String palo;
    private String nombre;
    private double valor;

    public Carta(String palo, String nombre, double valor) {
        this.palo = palo;
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return nombre + " de " + palo;
    }
}


class Baraja {
    private List<Carta> cartas;
    private int cartaActual;

    public Baraja() {
        cartas = new ArrayList<Carta>();
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] nombres = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};
        double[] valores = {1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5};

        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                Carta carta = new Carta(palos[i], nombres[j], valores[j]);
                cartas.add(carta);
            }
        }

        cartaActual = 0;
    }

    public void barajar() {
        Collections.shuffle(cartas);
        cartaActual = 0;
    }

    public Carta tomarCarta() {
        if (cartaActual >= cartas.size()) {
            return null;
        }

        Carta carta = cartas.get(cartaActual);
        cartaActual++;
        return carta;
    }
}


public class Juego {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();

        double puntosJugador = 0;
        double puntosCasa = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego del 7 y medio!");
        System.out.println("Tu primera carta es:");

        Carta carta = baraja.tomarCarta();
        System.out.println(carta);
        puntosJugador += carta.getValor();
        System.out.println("Tienes " + puntosJugador + " puntos");

        while (puntosJugador < 7.5) {
            System.out.println("¿Quieres otra carta? (s/n)");
            String respuesta = scanner.nextLine();

            if (respuesta.equals("s")) {
                carta = baraja.tomarCarta();

                if (carta == null) {
                    System.out.println("No hay más cartas en la baraja");
                    break;
                }

                System.out.println("Tu siguiente carta es: " + carta);

                if (carta.getValor() > 7) {
                    puntosJugador += 0.5;
                } else {
                    puntosJugador += carta.getValor();
                }
    
                System.out.println("Tienes " + puntosJugador + " puntos");
            } else {
                break;
            }
        }
    
        if (puntosJugador > 7.5) {
            System.out.println("Te pasaste de 7 y medio, pierdes");
        } else {
            System.out.println("Turno de la casa:");
    
            while (puntosCasa < 6) {
                carta = baraja.tomarCarta();
    
                if (carta == null) {
                    System.out.println("No hay más cartas en la baraja");
                    break;
                }
    
                System.out.println("La casa toma una carta: " + carta);
    
                if (carta.getValor() > 7) {
                    puntosCasa += 0.5;
                } else {
                    puntosCasa += carta.getValor();
                }
    
                System.out.println("La casa tiene " + puntosCasa + " puntos");
            }
    
            if (puntosCasa > 7.5) {
                System.out.println("La casa se pasó de 7 y medio, ganas");
            } else if (puntosJugador > puntosCasa) {
                System.out.println("Ganaste con " + puntosJugador + " puntos contra los " + puntosCasa + " puntos de la casa");
            } else if (puntosJugador == puntosCasa) {
                System.out.println("Empate con " + puntosJugador + " puntos");
            } else {
                System.out.println("Perdiste con " + puntosJugador + " puntos contra los " + puntosCasa + " puntos de la casa");
            }
        }
    }
}
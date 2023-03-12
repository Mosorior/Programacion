import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos un ArrayList de tipo String
        ArrayList<String> nombres = new ArrayList<String>();

        // Añadimos los nombres de nuestros compañeros de clase
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Elena");

        // Usamos un bucle for-each para recorrer el ArrayList y mostrar los nombres por pantalla
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}


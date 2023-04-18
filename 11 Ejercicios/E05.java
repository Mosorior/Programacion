import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E05 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Uso: quita_comentarios E04 FICHERO.java");
            System.exit(1);
        }

        String archivoEntrada = args[0];
        String archivoSalida = args[1];

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida));

            String linea;
            boolean enComentario = false;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                if (linea.startsWith("/*")) {
                    enComentario = true;
                }

                if (!enComentario && !linea.startsWith("//") && linea.length() > 0) {
                    int indiceComentario = linea.indexOf("//");

                    if (indiceComentario >= 0) {
                        linea = linea.substring(0, indiceComentario);
                    }

                    bw.write(linea);
                    bw.newLine();
                }

                if (linea.endsWith("*/")) {
                    enComentario = false;
                }
            }

            br.close();
            bw.close();

            System.out.println("Comentarios eliminados con éxito.");
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
            System.exit(1);
        }
    }

}
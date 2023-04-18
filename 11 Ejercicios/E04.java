import java.io.*;
import java.util.*;

public class E04 {
  public static void main(String[] args) {
    if(args.length < 1) {
      System.out.println("Debe proporcionar el nombre del archivo como argumento");
      System.exit(1);
    }

    String fileName = args[0];
    ArrayList<String> words = new ArrayList<String>();

    try {
      BufferedReader reader = new BufferedReader(new FileReader(fileName));
      String line = null;

      while((line = reader.readLine()) != null) {
        words.add(line);
      }

      reader.close();

      Collections.sort(words);

      String sortedFileName = fileName.substring(0, fileName.lastIndexOf('.')) + "_sort.txt";
      BufferedWriter writer = new BufferedWriter(new FileWriter(sortedFileName));

      for(String word : words) {
        writer.write(word);
        writer.newLine();
      }

      writer.close();

      System.out.println("El archivo " + fileName + " ha sido ordenado alfabéticamente en " + sortedFileName);
    }
    catch(IOException ex) {
      System.err.println("Error al leer o escribir el archivo: " + ex.getMessage());
      System.exit(1);
    }
  }
}

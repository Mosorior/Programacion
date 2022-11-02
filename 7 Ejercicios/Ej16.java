public class Ej16 {
    /* Escribe un programa que rellene un array de 20 elementos con números ente-
ros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
array escribiendo los números que se quieren resaltar entre corchetes. */
    public static void main(String[] args) {
    
      int[] n = new int[20];
  
      for (int i = 0; i < 20; i++) {
        n[i] = (int)(Math.random() * 381) + 20;
        System.out.print(n[i] + " ");
      }
      
      System.out.print("\n¿Qué números quiere resaltar? ");
      System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
      int opcion = Integer.parseInt(System.console().readLine());
  
      int multiplo = (opcion == 1) ? 5 : 7;
  
      // Muestra el resultado.
      for (int elemento : n) {
        if (elemento % multiplo == 0) {
          System.out.print("[" + elemento + "] ");
        } else {
          System.out.print(elemento + " ");
        }
      }
    }
  }
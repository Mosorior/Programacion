public class Ej13 {
    public static void main(String[] args) {
  /* Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor. */
      int dado1, dado2;
      
      do {
        dado1 = (int)(Math.random() * 6) + 1;
        dado2 = (int)(Math.random() * 6) + 1;
        System.out.println(dado1 + " " + dado2);
      } while (dado1 != dado2);
    }
  }
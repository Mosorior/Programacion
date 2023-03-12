import java.util.HashMap;
import java.util.Scanner;

public class E06 {
  public static void main(String[] args) {

    HashMap<String, String> usuarios = new HashMap<String, String>();

    // Se agregan usuarios y contraseñas permitidos al HashMap
    usuarios.put("admin", "224477");
    usuarios.put("maria", "ztf99");
    usuarios.put("pepe", "zxcvb");

    System.out.println("Por favor, introduzca nombre de usuario y "
          + "contraseña para acceder al área restringida.\nDispone de "
          + "3 intentos.");

    Scanner sc = new Scanner(System.in);
    String usuario;
    String clave;
    boolean entra = false;
    int oportunidades = 3;

    // Se utiliza un ciclo for en lugar de un ciclo do-while para simplificar el código
    for (int i = 0; i < 3 && !entra; i++) {
      System.out.print("Usuario: ");
      usuario = sc.nextLine();
      System.out.print("Contraseña: ");
      clave = sc.nextLine();

      if (usuarios.containsKey(usuario)) { // el usuario existe
        if (usuarios.get(usuario).equals(clave)) { // la contraseña es correcta
          System.out.println("Ha accedido al área restringida");
          entra = true;
        } else {
          System.out.println("Contraseña incorrecta");
        }
      } else { // el usuario no existe
        System.out.println("El usuario introducido no existe");
      }

      oportunidades--;
      if (!entra && oportunidades > 0) {
        System.out.println("Le quedan " + oportunidades + " oportunidades");
      }
    }

    // Se muestra un mensaje final si no se ha conseguido acceder al área restringida
    if (!entra) {
      System.out.print("Lo siento, no tiene acceso al área restringida");
    }
  }
}


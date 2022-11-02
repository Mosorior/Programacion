import java.util.Scanner;
public class Ej15 {
    /*Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto,
si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
personas como máximo e intente de nuevo”. Para el grupo que llega,
se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
grupo es de dos personas, se podrá colocar donde haya una o dos personas.
Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
funcionamiento del programa se ilustra a continuación: */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] mesa = new int[10];

    for (int i = 0; i < 10; i++) {
      mesa[i] = (int)(Math.random() * 5);
    }

    int clientes; 
    
    do {
      System.out.print("Mesa\t\t");
      for (int i = 1; i < 11; i++) {
        System.out.print(i +" ");
      }
      System.out.println("");
      System.out.print("Ocupación\t");
      for (int m : mesa) {
        System.out.print(m + " ");
      }
      System.out.println();
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      clientes = s.nextInt();

      if (clientes > 4 || clientes < 1) {
        if(clientes > 4){
            System.out.print("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo\n");
        }
        if(clientes == 0 || clientes <-1){
            System.out.println("Número inválido, vuelva a intentarlo.\n");
        }
    
      } 
      else {
        int iVacia = 0;
        boolean hayMesaVacia = false;
        for(int i = 9; i >= 0; i--) {
          if (mesa[i] == 0) {
            iVacia = i;
            hayMesaVacia = true;
          }
        }
        
        if (hayMesaVacia) {
          mesa[iVacia] = clientes; 
          System.out.println("Por favor, siéntense en la mesa número " + (iVacia + 1) + ".");
        } else {
          int iHueco = 0;
          boolean hayHueco = false;
          for(int i = 9; i >= 0; i--) {
            if (clientes <= (4 - mesa[i])) {
              iHueco = i;
              hayHueco = true;
            }
          }
          
          if (hayHueco) {
            mesa[iHueco] += clientes; 
            System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (iHueco + 1) + ".");
          } else {
            System.out.println("Lo siento, en estos momentos no queda sitio.");
          }
        }
      }
    } while (clientes != -1);

  }
}
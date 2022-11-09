public class Ej10 {

    static final String JUGADOR = "•";
    static final String ORDENADOR = "X";
    
    public static void main(String[] args) {
   
      String[][] tablero = new String[3][3];
      int i, j, fila, columna;
      int movimientos = 0;
      boolean jugadorGana = false;
      boolean ordenadorGana = false;
      boolean libre = false;
      String nombreFila = "cba";
      String coordenadas;
      
      // inicializa el tablero
      for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
          tablero[i][j] = " ";
        }
      }
        
  
      // juego /////////////////////////////////////////////////
      do {
        
        // pinta el tablero
        System.out.println("  ░░░░░░░░░░░░░░░");
        for(i = 0; i < 3; i++) {
          System.out.print(nombreFila.charAt(i)+ " ░");
          for(j = 0; j < 3; j++) {
            System.out.print("░ " + tablero[i][j] + " ");
            }
          System.out.println("░░");
          System.out.println("  ░░░░░░░░░░░░░░░");
        }
        System.out.println("     1   2   3\n");
        
        // pide las coordenadas
        do{// Un do while para pedir de nuevo el valor si la casilla ya estaba ocupada.
        System.out.print("Introduzca las coordenadas, por ejemplo b2: ");
        coordenadas = System.console().readLine();
        fila = nombreFila.indexOf(coordenadas.charAt(0));
        columna = coordenadas.charAt(1) - 1 - 48;
            if(tablero[fila][columna] == ORDENADOR || tablero[fila][columna] == JUGADOR){
                System.out.println("Esa casilla ya está ocupada.");
            }
            else{
            tablero[fila][columna] = JUGADOR;
            movimientos++;
            libre = true;
            
            }
        }while(!libre);
        libre = false;
        
        // comprueba si gana el jugador
        jugadorGana = (
          (tablero[0][0] == JUGADOR) && (tablero[0][1] == JUGADOR) && (tablero[0][2] == JUGADOR) ||
          (tablero[1][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[1][2] == JUGADOR) ||
          (tablero[2][0] == JUGADOR) && (tablero[2][1] == JUGADOR) && (tablero[2][2] == JUGADOR) ||
          (tablero[0][0] == JUGADOR) && (tablero[1][0] == JUGADOR) && (tablero[2][0] == JUGADOR) ||
          (tablero[0][1] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][1] == JUGADOR) ||
          (tablero[0][2] == JUGADOR) && (tablero[1][2] == JUGADOR) && (tablero[2][2] == JUGADOR) ||
          (tablero[0][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][2] == JUGADOR) ||
          (tablero[0][2] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][0] == JUGADOR)
        );
        
        if (!jugadorGana && (movimientos < 9)) {
          // juega el ordenador
          do {
            fila = (int)(Math.random() * 3);
            columna = (int)(Math.random() * 3);
          } while (!tablero[fila][columna].equals(" "));
          
          tablero[fila][columna] = ORDENADOR;
          movimientos++;
          // comprueba si gana el ordenador
          ordenadorGana = (
            (tablero[0][0] == ORDENADOR) && (tablero[0][1] == ORDENADOR) && (tablero[0][2] == ORDENADOR) ||
            (tablero[1][0] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[1][2] == ORDENADOR) ||
            (tablero[2][0] == ORDENADOR) && (tablero[2][1] == ORDENADOR) && (tablero[2][2] == ORDENADOR) ||
            (tablero[0][0] == ORDENADOR) && (tablero[1][0] == ORDENADOR) && (tablero[2][0] == ORDENADOR) ||
            (tablero[0][1] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][1] == ORDENADOR) ||
            (tablero[0][2] == ORDENADOR) && (tablero[1][2] == ORDENADOR) && (tablero[2][2] == ORDENADOR) ||
            (tablero[0][0] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][2] == ORDENADOR) ||
            (tablero[0][2] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][0] == ORDENADOR)
          );
        }
  
      } while (!jugadorGana && !ordenadorGana && (movimientos < 9));
  
      // pinta el tablero
      System.out.println("  ░░░░░░░░░░░░░░░");
      for(i = 0; i < 3; i++) {
        System.out.print(nombreFila.charAt(i)+ " ░");
        for(j = 0; j < 3; j++) {
          System.out.print("░ " + tablero[i][j] + " ");
          }
        System.out.println("░░");
        System.out.println("  ░░░░░░░░░░░░░░░");
      }
      System.out.println("     1   2   3\n");
  
      if (jugadorGana) {
        System.out.println("¡Enhorabuena! ¡Has ganado!");
      } else if (ordenadorGana) {
        System.out.println("Gana el ordenador.");
      } else {
        System.out.println("Empate. No gana nadie.");
      }
    }
  }
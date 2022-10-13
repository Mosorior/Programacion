public class Ej10 {
    public static void main (String[] args) {
        /* Realiza un programa que pinte por pantalla diez líneas formadas por carac-
teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres. */

        int n = (int)(Math.random()*40-1);
        int cn = (int)(Math.random()*6-1);
        String c = "";

        for(int i = 1; i <= 10; i++) {
      
            n = (int)(Math.random() * 40) + 1;
            cn = (int)(Math.random() * 6);
            
            switch(cn) {
              case 0:
                c = "*";
                break;
              case 1:
                c = "-";
                break;
              case 2:
                c = "=";
                break;
              case 3:
                c = ".";
                break;
              case 4:
                c = "|";
                break;
              case 5:
                c = "@";
                break;
              default:
            }
            
            for(int j = 1; j <= n; j++) {
              System.out.print(c);
            }
            System.out.println();
          }

    }
    
}

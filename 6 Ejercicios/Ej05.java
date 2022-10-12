 public class Ej05 {
    public static void main (String[] args) {
        /* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */

        int ran;
        int max= 0;
        int min = 200;
        int media = 0;
        for(int i = 0; i <20; i++){
            ran = (int)(Math.random()*200-100)+100;
            System.out.print( ran + " ");
            if(max < ran){
                max = ran;
            }
            if(min > ran){
                min = ran;
            }
            media += ran;

        }  

        System.out.println("\nEl número más alto fue " + max + ", el más pequeño fue " + min + " y la media de todos los números es " + media/20);


    }
}

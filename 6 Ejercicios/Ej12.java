public class Ej12 {
    public static void main(String args[]){
/* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter. */
        int rand = 0;
        char randchar;


        rand = (int) Math.random()*126;
        System.out.println(rand);
        randchar = (char)rand;
        System.out.print(randchar + " ");
        

        for(int i = 0; i < 10000; i++){
        
        }
    }
    
}

/* Muestra los números primos que hay entre 1 y 1000.*/

public class Ej15 {
    public static void main(String[] args) {

        for(int i = 1; i< 1001; i++){
            if(Ej01to14.esPrimo(i)){
                System.out.print(i + " ");
            }
            
        }
    }
}

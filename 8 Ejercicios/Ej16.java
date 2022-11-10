/*Muestra los números capicúa que hay entre 1 y 99999.*/
public class Ej16 {
    public static void main(String[] args) {
        for(int i = 1; i < 99999; i++){
            if(Ej01to14.esCapicua(i)){
                System.out.print(i + " ");
            }
        }
    }
}

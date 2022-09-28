import java.util.Scanner;
public class Ej13 {
    /*Escribe un programa que ordene tres números enteros introducidos por teclado. */
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Inserte 3 números enteros: ");
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();

        if (x > y && y > z && x > z){
            System.out.println(x + ">" + y + ">" + z);
        }
        if (x > z && z > y && x > y){
            System.out.println(x + ">" + z + ">" + y);
        }
        if (y > x && x > z && y > z){
            System.out.println(y + ">" + x + ">" + z );
        }
        if (y > x && x < z && y > z){
            System.out.println(y + ">" + z + ">" + x);
        }
        if (z > x && x > y && z > y){
            System.out.println(z + ">" + x + ">" +  y);
        }
        if (z > y && y > x && z > x){
            System.out.println(z + ">" + y + ">" + x);
        }
        if (x == y || y == z || x == z){
            System.out.println("Dos números son iguales, no se puede ordenar.");
        }
    }
}
/*xyz
* xzy
* yxz
* yzx
* zxy
* zyx*/
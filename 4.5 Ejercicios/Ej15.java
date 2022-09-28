import java.util.Scanner;
public class Ej15 {
    /*Reescribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("¿Con qué carácter quieres rellenar la pirámide?");
        String c = s.next();

        System.out.println("¿Hacia dónde apuntará el vértice de la pirámide? \n 1. Arriba\n 2. Abajo\n 3. Izquierda\n 4. Derecha");
        int d = s.nextInt();

        switch (d){
            case 1:
            System.out.println("    "+c);
            System.out.println("   "+c+" "+c);
            System.out.println("  "+c+"   "+c);
            System.out.println(" "+c+"     "+c);
            System.out.println(c+c+c+c+c+c+c+c+c);
            break;

            case 2:
            System.out.println(c+c+c+c+c+c+c+c+c);
            System.out.println(" "+c+"     "+c);
            System.out.println("  "+c+"   "+c);
            System.out.println("   "+c+" "+c);
            System.out.println("    "+c);
            break;

            case 3:
            System.out.println("     "+c);
            System.out.println("    "+c+c);
            System.out.println("   "+c+" "+c);
            System.out.println("  "+c+"  "+c);
            System.out.println(" "+c+"   "+c);
            System.out.println(c+"    "+c);
            System.out.println(" "+c+"   "+c);
            System.out.println("  "+c+"  "+c);
            System.out.println("   "+c+" "+c);
            System.out.println("    "+c+c);
            System.out.println("     "+c);

            break;

            case 4:
            System.out.println(c);
            System.out.println(c+c);
            System.out.println(c+" "+c);
            System.out.println(c+"  "+c);
            System.out.println(c+"   "+c);
            System.out.println(c+"  "+c);
            System.out.println(c+" "+c);
            System.out.println(c+c);
            System.out.println(c);
            break;
            
            default:
            System.out.println("Opción inválida");
        }




    }
}

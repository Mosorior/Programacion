import java.util.Scanner;
public class Ej20 {
 /*Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    boolean capicua = false;
    
    System.out.println("Introduzca un número entero (Máximo 5 cifras): ");
    int x = s.nextInt();
    /* 1 cifra */
    if(x>0 && x<10){
        capicua = true;
    }

    /* 2 cifras */
    if(x>=10 && x <100){
        if(x%10 == x/10){
            capicua = true;
        }
    }

    /* 3 cifras */
    if(x>=100 && x<1000){
        if(x%10 == x/100){
            capicua = true;
        }
    }
    /* 4 cifras */
    if(x>=1000 && x<10000){
        if((x/100)%10 == (x/10)%10 && x%10 == x/1000){
            capicua = true;
        }
    }

    /* 5 cifras */
    if(x>=10000 && x < 100000){
        if((x%10 == x/10000) && ((x/1000)%10 == (x/10)%10)){
            capicua = true;
        }
    }
        
    if(capicua == true){
        System.out.println("\n"+x + " es capicúa.");
    }
    if(capicua == false){
        System.out.println("\n"+x + " no es capicúa.");
    }
    }
}
import java.util.Scanner;
public class Ej8 {
 public static void main (String[] args){
/*Amplía el programa anterior para que diga la nota del boletín (insuficiente,suficiente, bien, notable o sobresaliente).*/

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca las 3 notas: ");
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
    double x3 = s.nextDouble();
    double media = ((x1+x2+x3)/3);
    System.out.println("La media es " + media);

    if (media < 5){
        System.out.println("Es insuficiente.");
    }
    if (media >= 5 && media < 7){
        System.out.println("Es suficiente.");
    }
    if (media >= 7 && media< 9){
        System.out.println("Es notable.");
    }
    if (media >=9 && media < 10){
        System.out.println("Es sobresaliente.");
    }
    if (media < 0 || media > 10){
        System.out.println("Algún número es incorrecto.");
    }

 }   
}

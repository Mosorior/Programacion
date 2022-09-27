import java.util.Scanner;
public class Ej10 {
    public static void main (String[] args){
        /*Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.*/
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca número de mes de nacimiento: ");
        int mes = s.nextInt();
        System.out.print("Introduzca día de nacimiento: ");
        int dia = s.nextInt();

        if (mes == 3 && dia >= 21 && dia < 31){
            System.out.println("Eres Aries.");
        }
        if (mes == 4 && dia <= 20 && dia >=1){
            System.out.println("Eres Aries.");
        }
        if (mes == 4 && dia >= 21 && dia < 30){
            System.out.println("Eres Tauro.");
        }
        if (mes == 5 && dia <= 20 && dia > 0){
            System.out.println("Eres Tauro.");
        }
        if (mes == 5 && dia >= 21 && dia < 31){
            System.out.println("Eres Géminis.");
        }
        if (mes == 6 && dia <= 21 && dia > 0){
            System.out.println("Eres Géminis.");
        }
        if (mes == 6 && dia >=22 && dia < 30){
            System.out.println("Eres Cáncer.");
        }
        if (mes == 7 && dia <= 22 && dia > 0){
            System.out.println("Eres Cáncer.");
        }
        if (mes == 7 && dia >=23 && dia < 31){
            System.out.println("Eres Leo.");
        }
        if (mes == 8 && dia <= 23 && dia > 0){
            System.out.println("Eres Leo.");
        }
        if (mes == 8 && dia >=24 && dia < 31){
            System.out.println("Eres Virgo.");
        }
        if (mes == 9 && dia <= 23 && dia > 0){
            System.out.println("Eres Virgo.");
        }
        if (mes == 9 && dia >=24 && dia < 30){
            System.out.println("Eres Libra.");
        }
        if (mes == 10 && dia <= 23 && dia > 0){
            System.out.println("Eres Libra.");
        }
        if (mes == 10 && dia >=24 && dia < 31){
            System.out.println("Eres Escorpio.");
        }
        if (mes == 11 && dia <= 22 && dia > 0){
            System.out.println("Eres Escorpio.");
        }
        if (mes == 11 && dia >=23 && dia < 30){
            System.out.println("Eres Sagitario.");
        }
        if (mes == 12 && dia <= 21 && dia > 0){
            System.out.println("Eres Sagitario.");
        }
        if (mes == 12 && dia >=22 && dia < 31){
            System.out.println("Eres Capricornio.");
        }
        if (mes == 1 && dia <= 20 && dia > 0){
            System.out.println("Eres Capricornio.");
        }
        if (mes == 1 && dia >=21 && dia < 31){
            System.out.println("Eres Acuario");
        }
        if (mes == 2 && dia <= 18 && dia > 0){
            System.out.println("Eres Acuario");
        }
        if (mes == 2 && dia >=19 && dia < 29){
            System.out.println("Eres Piscis.");
        }
        if (mes == 3 && dia <= 20 && dia > 0){
            System.out.println("Eres Piscis.");
        }
        if (mes <= 0 || mes > 12 || dia < 0){
            System.out.println("Es una fecha inválida.");
        }
        if (mes == 1 && dia > 31|| mes == 3 && dia > 31|| mes == 5 && dia > 31|| mes == 7 && dia > 31|| mes == 8 && dia > 31|| mes == 10 && dia > 31|| mes == 12 && dia > 31){
            System.out.println("Ese día no existe en ese mes.");
        }
        if (mes == 4 && dia > 30|| mes == 6 && dia > 30|| mes == 9 && dia > 30|| mes == 11 && dia > 30){
            System.out.println("Ese día no existe en ese mes.");
        }
        if (mes == 2 && dia > 29){
            System.out.println("Ese día no existe en ese mes.");
        }

    }
}

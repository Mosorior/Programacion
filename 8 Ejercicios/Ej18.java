import java.util.Scanner;
public class Ej18 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int exp = 0, numero, digito=0;
        double binario=0;
        System.out.println("Introduzca un decimal: ");
        numero = s.nextInt();
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Ej01to14.potencia(10, exp);   
                exp++;
                numero = numero/2;
        }
        System.out.println(binario);

    }
    
}

# Funciones



```java
import java.util.Scanner;
public class comprobarPrimo{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Introduzca un número: ");
    	int n = s.nextInt();
    
    	if (esprimo(n)){
        	System.out.println("El número " + n + " es primo.");
    	}
    	else{
        	System.out.println("El número " + n + " no es primo.");
    	}
	}


	public static boolean esprimo(int x){
		for (int i = 2; i < x; i++){
    		if ((x%i) == 0){
        	    return false;
    		}
		}
        return true;
	}
}
```

La función devuelve un boolean, entonces para llamar al uso de la función solo hay que escribir `esprimo(n)`sustituyendo 'n' por la variable que se vaya a usar.

La función `boolean esprimo` va acompañado de un `(int x)`, cuya función es usar el valor que recibía como 'n' y cambiarlo a 'x', que es el que usa la función.

La función hay que entenderla como un programa a parte que toma datos de otros programas estando todos en el mismo archivo.
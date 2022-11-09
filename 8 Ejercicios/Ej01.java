/*
Crea una biblioteca de funciones matemáticas que contenga las siguientes
funciones. Recuerda que puedes usar unas dentro de otras si es necesario.

1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
es primo y falso en caso contrario.
3. siguientePrimo: Devuelve el menor primo que es mayor al número que
se pasa como parámetro.
4. potencia: Dada una base y un exponente devuelve la potencia.
5. digitos: Cuenta el número de dígitos de un número entero.
6. voltea: Le da la vuelta a un número.
7. digitoN: Devuelve el dígito que está en la posición n de un número
entero. Se empieza contando por el 0 y de izquierda a derecha.
8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1.
9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
derecha).
10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
izquierda).
11. pegaPorDetras: Añade un dígito a un número por detrás.
12. pegaPorDelante: Añade un dígito a un número por delante.
13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
dentro de un número y devuelve el trozo correspondiente.
14. juntaNumeros: Pega dos números para formar uno. */


public class Ej01{
     public static void main(String[] args) {

     }

     /*---------------------------------- ES CAPICÚA ----------------------------*/
     public static boolean esCapicua(int x){
        /* 1 cifra */
        if(x>0 && x<10){
            return true;
        }

        /* 2 cifras */
        if(x>=10 && x <100){
            if(x%10 == x/10){
                return true;
            }
        }

        /* 3 cifras */
        if(x>=100 && x<1000){
            if(x%10 == x/100){
                return true;
            }
        }
        /* 4 cifras */
        if(x>=1000 && x<10000){
            if((x/100)%10 == (x/10)%10 && x%10 == x/1000){
                return true;
            }
        }

        /* 5 cifras */
        if(x>=10000 && x < 100000){
            if((x%10 == x/10000) && ((x/1000)%10 == (x/10)%10)){
                return true;
            }
        }
        else{
            return false;
        }
        return false;
    }

/*---------------------------------- ES PRIMO ----------------------------*/
    public static boolean esPrimo(int n){
        for (int i = 2; i < n; i++){
    		if ((n%i) == 0){
        	    return false;
    		}
		}
        return true;
    }

/*---------------------------------- SIGUIENTE PRIMO ----------------------------*/
    public static int siguientePrimo(int x){
        int n = x;
        boolean siguientePrimo = false;
        for (int i = 2; i < n; i++){
    		if ((n%i) == 0){
                return n;
    		}
            else{
                while(!siguientePrimo){
                    n++;
                    if ((n%i) == 0){
                        return n;
                    }
                }
            }
		}
        return 0;
    }

    /*---------------------------------- POTENCIA ----------------------------*/
    public static int potencia(int b, int e){
        for(int i = 0; i < e; i++){
            b*=b;
        }
        return b;
    }

    /*---------------------------------- DÍGITOS----------------------------*/
    
    public static int digitos(int y){
        if ( y < 10 ) {
            return 1;
        }
          
        if (( y >= 10 ) && ( y < 100 )) {
            return 2;
        }
          
        if (( y >= 100 ) && ( y < 1000 )) {
            return 3;
        }
          
        if (( y >= 1000 ) && ( y < 10000 )) {
            return 4;
        }
          
        if ( y >= 10000 ) {
            return 5;
        }
        else{
            return 0;
        }
    }

    /*---------------------------------- VOLTEA ----------------------------*/

    public static int voltea(int x){
        int rev = 0;

        while (x > 0) {
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        return rev;
    }

    /*---------------------------------- DIGITON ----------------------------*/

    public static int digitoN(){
        
    }


}
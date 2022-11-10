


public class Ej01to14{

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
        if(e == 0){
            return 1;
        }
        if(e < 0){
            return 1/potencia(b, -e);
        }
        int n = 1;
        for(int i = 0; i < Math.abs(e); i++){
           n= n*b;
        }
        return n;
    }

    /*---------------------------------- DÍGITOS----------------------------*/
    
    public static int digitos(long y){
        if(y <0){
            y= -y;
        }
        if (y == 0) {
            return 1;
          } else {
            int n = 0;
            while (y > 0) {
              y = y / 10; // se le quita un dígito a x
              n++; // incrementa la cuenta de dígitos
            }
            return n;
          }
    }

    public static int digitos(int y){
        
            return digitos((long)y);
    }

    /*---------------------------------- VOLTEA ----------------------------*/

    public static long voltea(long x){
        if (x < 0) {
            return -voltea(-x);
          }
      
          long volteado = 0;
      
          while(x > 0) {
            volteado = (volteado * 10) + (x % 10);
            x = x / 10;
          }
      
          return volteado;
        }

        public static int voltea(int x) {
            return (int)voltea((long)x);
          }
    

    /*---------------------------------- DIGITON ----------------------------*/

    public static int digitoN(long x, int n){

        x = voltea(x);

        while (n-- > 0) {
          x = x / 10;
        }

        return (int)x % 10;

    }

    public static int digitoN(int x, int n) {
        return digitoN((long)x, n);
      }


/*---------------------------------- POSICION DE DÍGITO ----------------------------*/
    public static int posicionDeDigito(long x, int d) {
        int i;  
        for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};  
        if (i == digitos(x)) {
          return -1;
        } else {
          return i;
        }
    }

    public static int posicionDeDigito(int x, int d) {
        return posicionDeDigito((long)x, d);
    }
/*------------------------------------ QUITA POR DETRÁS ------------------------------- */

    public static long quitaPorDetras(long x, int n) {
        return x / (long)potencia(10, n);
    }


    public static int quitaPorDetras(int x, int n) {

        return (int)quitaPorDetras((long) x, n);
    }

/*------------------------------------- QUITA POR DELANTE ----------------------------- */

public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  public static int quitaPorDelante(int x, int n) {
    return (int)quitaPorDelante((long)x, n);
  }
  
  /*----------------------------------- PEGA POR DETRÁS ------------------------------- */

    public static long pegaPorDetras(long x, int d) {
        return juntaNumeros(x, d);
    }

    public static int pegaPorDetras(int x, int d) {
        return (int)pegaPorDetras((long)x, d);
      }

/*------------------------------------PEGA POR DELANTE --------------------------------- */

    public static long pegaPorDelante(long x, int d) {
        return juntaNumeros(d, x);
    }

    public static int pegaPorDelante(int x, int d) {
        return (int)pegaPorDelante((long)x, d);
      }

/*------------------------------------- TROZO DE NÚMERO ----------------------------------*/

    public static long trozoDeNumero(long x, int inicio, int fin) {
        int longitud = digitos(x);
        x = quitaPorDelante(x, inicio);
        x = quitaPorDetras(x, longitud - fin - 1);
        return x;
    }

    public static int trozoDeNumero(int x, int inicio, int fin) {
        return (int)trozoDeNumero((long)x, inicio, fin);
      }

/*------------------------------------JUNTA NÚMEROS ------------------------------------- */

    public static long juntaNumeros(long x, long y) {
        return (long)(x * potencia(10, digitos(y))) + y;
    }

    public static int juntaNumeros(int x, int y) {
        return (int)(juntaNumeros((long)x, (long)y));
    }
}




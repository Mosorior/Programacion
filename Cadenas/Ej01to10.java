


public class Ej01to10{

    /*---------------------------------- NÚMERO ESPACIOS ----------------------------*/
    public static int numeroEspacios(String x){
        int longi = x.length;
        int espacios = 0;
        for (int i = 0; i < longi; i++){
            if(x.charAt(i)= " "){
                espacios++;
            }
        }
        return espacios;
   }

/*---------------------------------- NÚMERO VOCALES ----------------------------*/
   public static int numeroVocales(String x){
        int longi = x.length;
        int vocales = 0;
        for(int i = 0; i < longi; i++){
            if (x.charAt(i) = "a" || x.charAt(i) = "e" || x.charAt(i) = "i" || x.charAt(i) = "o" || x.charAt(i) = "u"){
                vocales++;
            }
        }
        return vocales;
   }

/*---------------------------------- ES PALÍNDROMO ----------------------------*/
   public static boolean esPalindromo(String x){
    int longi = x.length;
    boolean palindromo = false;
    if(longi == 1){
        return true;
    }
    else{
        for(i = 0; i<longi; i++){
            if(x.charAt(i) == x.charAt(longi-i)){
                palindromo = true;
            }
            else{
                palindromo = false;
            }
        }
    }
    return palindromo;
   }

   /*---------------------------------- CONTIENE ----------------------------*/
   public static boolean contiene(String x, char y){
       int longi= x.length;
       for(int i = 0; i < longi; i++){
        if(x.charAt(i) == y){
            return true;
        }
       }
       return false;
   }

   /*---------------------------------- REPITE CARACTER----------------------------*/
   
   public static String repiteCaracter(char x, int y){
    String cadena;
    cadena[0] = x;  
    for(int i = 0; i<y; i++){
        cadena.concat(cadena[0])
    }
    return cadena;
   }

   /*---------------------------------- PAD LEFT ----------------------------*/

   public static String padLeft(String x, int longi){
        String cadenaEspacios[];
        cadenaEspacios[0]=" ";
        for(int i = 0; i < longi; i++){
            cadenaEspacios[i]= "";
        }
        padLeft = cadenaEspacios + x;
        return padLeft;
    }
   
   /*---------------------------------- PAD RIGHT ----------------------------*/

   public static String padRight(String x, int longi){
        String cadenaEspacios[];
        for(int i = x.length; i < longi; i++){
            cadenaEspacios[i] = " ";
        }
        padRight = x + cadenaEspacios;
        return padRight;
    }


/*---------------------------------- QUITA ESPACIOS ----------------------------*/
   public static String quitaEspacios(String x) {
        x.trim();
        String quitaEspacios[];
        int j = 0;
      for(int i = 0; i< x.length; i++){
        if(x[i] != 0){
            quitaEspacios[j] = x[i];
            j++
        }
      }
      return quitaEspacios;
   }

/*------------------------------------ QUITA ESPACIOS TRIM ------------------------------- */

   public static String quitaEspaciosTrim(String x) {
        int numSI= 0;
        int numSF = 0;
        String espaciosI[];
        String espaciosF[];
        int j = 0;
        String quitaEspaciosTrim[];
        for(int i = 0; i < x.length; i++){
            if(x[i] == " "){
                numSI++;
            }
            if (x[i] != " "){
                break;
            }
        }
        for(int i = x.length; i > numSI; i--){
            if(x[i] == " "){
                numSF++;
            }
            if (x[i] != " "){
                break;
            }
        }
        for(int i = numSI; i < (x.length-numSF); i++){
            if(x[i] != " "){
                espaciosQuitados[j] = x[i];
                j++;
            }
        }

        for(int i = 0; i < numSI; i++){
            espaciosI[i] = " ";
        }
        for(int i = 0; i < numSF; i++){
            espaciosF[i] = " ";
        }

        String espaciosQuitados = espaciosI + espaciosQuitados + espaciosF;
        


   }


/*------------------------------------- SUSTITUYE CARACTER ----------------------------- */

public static String sustituyeCaracter(String x, char a, char b) {
    for(int i = 0; i < x.length; i++){
        if( x[i] == a){
            x[i] = b;
        }
    }
    return x;
 }
 
 /*----------------------------------- CUENTA PALABRAS ------------------------------- */

   public static int cuentaPalabras(String x) {
    boolean stop = false;
    int j = 0;
    int cuentaPalabras = 0;
    while(!stop){
        if(x[j] != " "){
            j++
            stop = true
        }
        else{
            stop = false
        }
    }
    for(int i = j; i < x.length; i++){
        if(x[i] == " "){
            cuentaPalabras++;
        }
    }
       return cuentaPalabras;
   }

}
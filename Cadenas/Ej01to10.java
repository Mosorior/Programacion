public class Ej01to10{

    /*---------------------------------- NÚMERO ESPACIOS ----------------------------*/
    public static int numeroEspacios(String x){
        int longi = x.length();
        char y[] = x.toCharArray();
        int espacios = 0;
        for (int i = 0; i < longi; i++){
            if(y[i]== ' '){
                espacios++;
            }
        }
        return espacios;
   }

/*---------------------------------- NÚMERO VOCALES ----------------------------*/
   public static int numeroVocales(String y){
        int longi = y.length();
        char x[] = y.toCharArray();
        int vocales = 0;
        for(int i = 0; i < longi; i++){
            if (x[i] == 'a' || x[i] == 'e' || x[i] == 'i' || x[i] == 'o' || x[i] == 'u'){
                vocales++;
            }
        }
        return vocales;
   }

/*---------------------------------- ES PALÍNDROMO ----------------------------*/
   public static boolean esPalindromo(String x){
    int longi = x.length();
    boolean palindromo = false;
    if(longi == 1){
        return true;
    }
    else{
        for(int i = 0; i<longi; i++){
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
       int longi= x.length();
       for(int i = 0; i < longi; i++){
        if(x.charAt(i) == y){
            return true;
        }
       }
       return false;
   }

   /*---------------------------------- REPITE CARACTER----------------------------*/
   
   public static String repiteCaracter(char x, int y){
    char cadena[] = new char[y]; 
    for(int i = 0; i<y; i++){
        cadena[i] +=  x;
    }
    String repiteCaracter = cadena.toString();
    return repiteCaracter;
   }

   /*---------------------------------- PAD LEFT ----------------------------*/

   public static String padLeft(String x, int longi){
        String padLeft = "";
        char cadenaEspacios[] = new char[longi];
        cadenaEspacios[0]=' ';
        for(int i = 0; i < longi; i++){
            cadenaEspacios[i]= ' ';
        }
        padLeft = padLeft.valueOf(cadenaEspacios) + x;
        return padLeft;
    }
   
   /*---------------------------------- PAD RIGHT ----------------------------*/

   public static String padRight(String x, int longi){
        String padRight = "";
        char cadenaEspacios[] = new char[longi];
        for(int i = x.length(); i < longi; i++){
            cadenaEspacios[i] = ' ';
        }
        padRight = x + padRight.valueOf(cadenaEspacios);
        return padRight;
    }


/*---------------------------------- QUITA ESPACIOS ----------------------------*/
   public static String quitaEspacios(String x) {
        x.trim();
        char quitaEspacio[] = new char[100];
        quitaEspacio[0] = ' ';
        String quitaEspacios = "";
        char y[] = x.toCharArray();
        int j = 0;
      for(int i = 0; i< x.length(); i++){
        if(y[i] != ' '){
            quitaEspacio[j] = y[i];
            j++;
        }
      }
      quitaEspacios = quitaEspacios.valueOf(quitaEspacio);
      return quitaEspacios;
   }

/*------------------------------------ QUITA ESPACIOS TRIM ------------------------------- */

   public static String quitaEspaciosTrim(String x) {
        int numSI= 0;
        int numSF = 0;
        char y[] = x.toCharArray();
        char espaciosI[];
        char espaciosF[];
        int j = 0;
        char espaciosQuitados[];
        String quitaEspaciosTrim[];
        for(int i = 0; i < x.length(); i++){
            if(y[i] ==' '){
                numSI++;
            }
            if (y[i] != ' '){
                break;
            }
        }
        for(int i = x.length(); i > numSI; i--){
            if(y[i] == ' '){
                numSF++;
            }
            if (y[i] != ' '){
                break;
            }
        }
        for(int i = numSI; i < (x.length()-numSF); i++){
            if(y[i] != ' '){
                espaciosQuitados[j] = y[i];
                j++;
            }
        }

        for(int i = 0; i < numSI; i++){
            espaciosI[i] = ' ';
        }
        for(int i = 0; i < numSF; i++){
            espaciosF[i] = ' ';
        }

        quitaEspaciosTrim = espaciosI.toString() + espaciosQuitados + espaciosF;
        


   }


/*------------------------------------- SUSTITUYE CARACTER ----------------------------- */

public static String sustituyeCaracter(String x, char a, char b) {
    char y[] = x.toCharArray();
    for(int i = 0; i < x.length(); i++){
        if( y[i] == a){
            y[i] = b;
        }
    }
    String sustituyeCaracter = y.toString();
    return sustituyeCaracter;
 }
 
 /*----------------------------------- CUENTA PALABRAS ------------------------------- */

   public static int cuentaPalabras(String x) {
    boolean stop = false;
    int j = 0;
    char y[] = x.toCharArray();
    int cuentaPalabras = 0;
    while(!stop){
        if(y[j] != ' '){
            j++;
            stop = true;
        }
        else{
            stop = false;
        }
    }
    for(int i = j; i < x.length(); i++){
        if(y[i] == ' '){
            cuentaPalabras++;
        }
    }
       return cuentaPalabras;
   }

}
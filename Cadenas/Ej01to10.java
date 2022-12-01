public class Ej01to10{

    /*---------------------------------- NÚMERO ESPACIOS ----------------------------*/
    public static int numeroEspacios(String x){
        int numeroEspacios = 0;
        for (int i = 0; i < x.length(); i++){
            if(x.charAt(i)== ' '){
                numeroEspacios = numeroEspacios+1;
            }
        }
        System.out.println(numeroEspacios);
        return numeroEspacios;
   }

/*---------------------------------- NÚMERO VOCALES ----------------------------*/
   public static int numeroVocales(String y){
        int longi = y.length();
        char x[] = y.toCharArray();
        int vocales = 0;
        for(int i = 0; i < longi; i++){
            if (x[i] == 'a' || x[i] == 'e' || x[i] == 'i' || x[i] == 'o' || x[i] == 'u' || x[i] == 'A' || x[i] == 'E' || x[i] == 'I' || x[i] == 'O' || x[i] == 'U'){
                vocales++;
            }
        }
        return vocales;
   }

/*---------------------------------- ES PALÍNDROMO ----------------------------*/
   public static boolean esPalindromo(String x){
    String y = x.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
    String inversa = new StringBuilder(x).reverse().toString();
    return inversa.equals(x);
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
    
    String repiteCaracter = " ";
    repiteCaracter = repiteCaracter.valueOf(x);
    repiteCaracter = repiteCaracter.repeat(y);
    
    return repiteCaracter;
   }

   /*---------------------------------- PAD LEFT ----------------------------*/

   public static String padLeft(String x, int longi){
        String padLeft = "";
        char cadenaEspacios[] = new char[longi];
        cadenaEspacios[0]=' ';
        for(int i = 0; i < longi/2; i++){
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
        x= x.trim();
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

    String quitaEspaciosTrim = x.replace(" ", "");

    return quitaEspaciosTrim;

        


   }


/*------------------------------------- SUSTITUYE CARACTER ----------------------------- */

public static String sustituyeCaracter(String x, char a, char b) {
    return x.replace(a, b);
 }
 
 /*----------------------------------- CUENTA PALABRAS ------------------------------- */

   public static int cuentaPalabras(String x) {
    int contador = 1, pos;
    x = x.trim();
    if(x.isEmpty()){
        contador = 0;
    }
    else{
        pos = x.indexOf(" ");
        while(pos !=-1){
            contador++;
            pos = x.indexOf(" ", pos + 1);
        }
    }
    return contador;
   }

}
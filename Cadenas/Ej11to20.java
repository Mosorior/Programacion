import java.util.Stack;
import java.util.StringTokenizer;
public class Ej11to20{

    /*---------------------------------- ES NUMERO ----------------------------*/
    public static boolean esNumero(String x){
      int counter = 0;
      for(int i = 0; i < x.length(); i++){
        if(x.charAt(i) == '0' || x.charAt(i) == '1'||x.charAt(i) == '2' || x.charAt(i) == '3' || x.charAt(i) == '4' || x.charAt(i) == '5' || x.charAt(i) == '6' || x.charAt(i) == '7' || x.charAt(i) == '8' || x.charAt(i) == '9' ){
            counter++;
        }
      }
      if(x.length() == counter){
        return true;
      }
      else{
        return false;
      }
    }

    /*--------------------------------- QUITA CARACTER ---------------------- */

    public static String quitaCaracter(String x, char a){
        x= x.replace(String.valueOf(a), "");
        return x;

    }

    /*--------------------------------- QUITA ACENTOS --------------------- */
    public static String quitaAcentos(String x){


        return x.replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace("ñ", "n");
    }


    /*--------------------------------- INVIERTE CADENA --------------------- */
    public static String invierteCadena(String x){
    
        StringBuilder stringBuilder = new StringBuilder(x);

        return stringBuilder.reverse().toString();
    }

    /*---------------------------------- VECES CARACTER ------------------------- */
    public static int vecesCaracter(String x, char a){
        char[] y = x.toCharArray();
        int vecesCaracter = 0;
        for(int i = 0; i < x.length(); i++){
            if(y[i] == a){
                vecesCaracter++;
            }
        }
        return vecesCaracter;
    }
    /* ----------------------------------VECES PALABRA --------------------------- */

    public static int vecesPalabra(String x, String a){
        int vecesPalabra = 0;
        for(int i = 0; i < x.length(); i++){
            if(x.substring(i).startsWith(a)){
                vecesPalabra++;
            }
        }
        
        return vecesPalabra;
        
    }

    /*------------------------------------ MAYÚSCULAS PRIMERA --------------------- */
    public static String mayusculasPrimera(String x){
        char[] c = x.toCharArray();
        c[0] = Character.toUpperCase(c[0]);

        for(int i = 0; i < x.length()-2; i++){
            if(c[i] == ' ' || c[i] == '.' || c[i] == ','){
                c[i +1] = Character.toUpperCase(c[i+1]);
            }
        }
        return new String(c);
        
    }

    /*---------------------------------- SUSTITUYE PALABRA -------------------------- */
    public static String sustituyePalabra(String x, String a, String b){
        return x.replaceAll(a, b);
        
    }
    /*------------------------------------INVIERTE PALABRA */
    public static String inviertePalabras(String x){
        String[] palabras = x.split(" ");
        for(int i = 0; i < palabras.length;i++){
            palabras[i]= invierteCadena(palabras[i]);
        }
        String cadena = String.join(" ", palabras);
        return cadena;
     
    }
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /*--------------------------------- QUITA ESPACIOS SOBRANTES ---------------------- */
    public static String quitaEspaciosSobrantes(String x){
        String quitaEspaciosSobrantes = x.replaceAll(" +", " ").trim();
        return quitaEspaciosSobrantes;
    }



}
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
        char[] y = x.toCharArray();
        char aux;

        if (y[0] != ' '){
            y[0] = Character.toUpperCase(y[0] );
          }
        
        for(int i = 0; i < x.length(); i++){
            if( y[i] == ' ' && y[i+1] >= 97 && y[i+1] <= 122){
                y[i+1] = Character.toUpperCase(y[i+1]);
            }
        }

        String mayusculasPrimera = y.toString();

        return mayusculasPrimera;
    }

    /*---------------------------------- SUSTITUYE PALABRA -------------------------- */
    public static String sustituyePalabra(String x, String a, String b){
        String[] y = x.split(" ");
        String sustituyePalabra = " ";
        for(int i = 0; i < x.length(); i++){
            if(y[i] == a){
                y[i] = b;
            }
            sustituyePalabra = sustituyePalabra +" "+y[i];

        }
    
        return sustituyePalabra;
        
    }
    /*--------------------------------- QUITA ESPACIOS SOBRANTES ---------------------- */
    public static String quitaEspaciosSobrantes(String x){
        String quitaEspaciosSobrantes = x.replaceAll(" +", " ").trim();
        return quitaEspaciosSobrantes;
    }



}
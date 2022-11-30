public class Ej11to20{

    /*---------------------------------- ES NUMERO ----------------------------*/
    public static boolean esNumero(String x){
      char y[] = x.toCharArray();
      int counter = 0;
      for(int i = 0; i < x.length(); i++){
        if(y[i] == '0' || y[i] == '1'|| y[i] == '2' || y[i] == '3' || y[i] == '4' || y[i] == '5' || y[i] == '6' || y[i] == '7' || y[i] == '8' || y[i] == '9' ){
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
        String quitaCaracter;
        char[] y = x.toCharArray();
        char[] aux = new char[x.length()];
        int j = 0;
        for(int i = 0; i < x.length(); i++){
            if(y[i] != a){
                aux[j] = y[i];
                j++;
            }
        }

        quitaCaracter = aux.toString();
        return quitaCaracter;
    }

    /*--------------------------------- QUITA ACENTOS --------------------- */
    public static String quitaAcentos(String x){
        char[] y = new char[x.length()];

        for(int i = 0; i < x.length(); i++){
            if(y[i] == 'á' || y[i] == 'à'){
                y[i] = 'a';
            }
            if(y[i] == 'è' || y[i] == 'é'){
                y[i] = 'e';
            }
            if(y[i] == 'ì' || y[i] == 'í'){
                y[i] = 'i';
            }
            if(y[i] == 'ò' || y[i] == 'ó' ){
                y[i] = 'o';
            }

            if(y[i] == 'ù' || y[i] == 'ú'){
                y[i] = 'u';
            }

        }
        String quitaAcentos = y.toString();

        return quitaAcentos;
    }


    /*--------------------------------- INVIERTE CADENA --------------------- */
    public static String invierteCadena(String x){
        char[] y = x.toCharArray();
        char[] aux = new char[x.length()];
        int j = x.length();
        for(int i = 0; i < x.length(); i++){
            aux[i] = y[j];
            j--;
        }

        String invierteCadena = aux.toString();

        return invierteCadena;

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
        String[] y = x.split(" ");
        int vecesPalabra = 0;
        for(int i = 0; i < x.length(); i++){
            if(y[i] == a){
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
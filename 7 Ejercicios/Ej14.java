import java.util.Scanner;
public interface Ej14 {
    
    /*Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] intro = new String[8];
        String[] colores = new String[8];
        String[] otros = new String[8];
        String[] resultado = new String[8];
        int j = 0,counterColores = 0, counterOtros = 0, counter = 0;
        String[] reconocibles = {
            "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
          };


        System.out.println("Introduzca 8 colores: ");
        for(int i = 0; i <8; i++){
            intro[i] = s.next();
            for (String c : reconocibles) {
                if (intro[i].equals(c)) {
                  resultado[j++] = c;
                }
            }
        }
        for (int i = 0; i <8; i++){
            boolean esColor = false;
            for (String c : reconocibles){
                if(intro[i].equals(c)){
                    esColor = true;
                }
            }
            if (!esColor){
                resultado[j++] = intro[i];
            }
        }

        System.out.println("El array introducido es: ");
        for(int i = 0; i < 8; i++){
            System.out.print(intro[i] + " ");
        }

        System.out.println("\nOrdenado, el array quedaría así:");
        for(int i = 0; i<8; i++){
            if(resultado[i] != "" ){
                System.out.print(resultado[i]+ " ");

            }
        }

    }
}

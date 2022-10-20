public class Ej04 {
    public static void main(String[] args) {
        /* Define tres arrays de 20 números enteros cada una, con nombres numero ,
cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
array cuadrado se deben almacenar los cuadrados de los valores que hay en el
array numero. En el array cubo se deben almacenar los cubos de los valores que
hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
en tres columnas. */

        int[] numero;
        int[] cuadrado;
        int[] cubo;
        numero = new int[20];
        cuadrado = new int[20];
        cubo = new int[20];

        for(int i = 0; i < 20; i++){
            numero[i] = (int)(Math.random()*100);
        }

        for(int i = 0; i < 20; i++){
            cuadrado[i]= numero[i]*numero[i];
            cubo[i]= numero[i]*cuadrado[i];
        }
        System.out.println("\nNúmero\t\tCuadrado\tCubo\n");
        for(int i = 0; i <20; i++){
            System.out.print(numero[i] + "\t\t" + cuadrado[i]+ "\t\t" + cubo[i] + "\n");
        }

    }
}

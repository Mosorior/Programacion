public class Ej10 {
    public static void main(String[] args) {
    /* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario. */
    
        int[] n = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int i;
        int pares = 0;
        int impares = 0;
        
        for (i = 0; i < 20; i++) {
        n[i] = (int)(Math.random() * 101);
        if (n[i] % 2 == 0) {
            par[pares++] = n[i];
        } else {
            impar[impares++] = n[i];
        }
        }
        
        System.out.println("Array original:");
        for (i = 0; i < 20; i++) {
        System.out.print(n[i] + " ");
        }
        System.out.println();
        
        for (i = 0; i < pares; i++) {
        n[i] = par[i];
        }
        
        for (i = pares; i < 20; i++) {
        n[i] = impar[i - pares];
        }
        
        System.out.println("Array con los pares al principio:");
        for (i = 0; i < 20; i++) {
        System.out.print(n[i] + " ");
        }    
    }
}

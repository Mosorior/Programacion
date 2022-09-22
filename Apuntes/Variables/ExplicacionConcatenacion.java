public class ExplicacionConcatenacion {
	
	public static void main (String[] args) {
		char l1 = 's';
		char l2 = 'a';
		char l3 = 'l';
		char l4 = 'u';
		char l5 = 'd';
		/*l1 + l2 + l3 + l4 + l5 Suma los valores de caracteres ASCII en
		 *  la string, lo que provoca un error.*/
		String palabra = "" + l1 + l2 + l3 + l4 + l5;
		/* Al añadir "" al principio, se da a entender al ordenador que
		 * es una concatenación y tiene que poner los valores uno detrás
		 *  de otro en vez de sumarlos.*/
		System.out.println(palabra);
	}
}


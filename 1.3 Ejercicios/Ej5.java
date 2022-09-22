public class Ej5 {
	
	public static void main (String[] args) {
		/*Modifica el programa anterior añadiendo colores. Puedes mostrar cada asig-natura de un color diferente. */
		System.out.println("\tLun\tMar\tMié\tJue\tVie");
		System.out.println("\u001B[0m8:00\t\033[31mBDA\t\033[32mPRG\t\033[32mPRG\t\033[35mEDS\t\033[31mBDA");
		System.out.println("\u001B[0m9:00\t\033[31mBDA\t\033[32mPRG\t\033[32mPRG\t\033[32mPRG\t\033[31mBDA");
		System.out.println("\u001B[0m10:00\t\033[34mING\t\033[35mEDS\t\033[32mPRG\t\033[32mPRG\t\033[36mSIN");
		System.out.println("\u001B[0m11:30\t\033[33mFOL\t\033[35mEDS\t\033[34mING\t\033[32mPRG\t\033[36mSIN");
		System.out.println("\u001B[0m12:30\t\033[33mFOL\t\u001B[0mtLMS\t\033[36mSIN\t\033[36mSIN\t\u001B[0mLMS");
		System.out.println("\u001B[0m13:30\t\033[33mFOL\t\u001B[0mLMS\t\033[36mSIN\t\033[36mSIN\t\u001B[0mLMS");
	}
}


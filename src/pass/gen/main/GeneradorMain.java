package pass.gen.main;

import java.util.Scanner;

import pass.gen.pojo.Password;

public class GeneradorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n * * * * * GENERADOR DE CONTRASE�AS V1.0 * * * * *");
		System.out.println("\n # # # SELECCIONE UNA OPCION # # #");
		System.out.println("   1. Contrase�a fija con par�metro");
		System.out.println("   2. Contrase�a aleatoria");
		
		System.out.println(" INTRODUZCA N�MERO: ");
		int key = sc.nextInt();
		
		switch (key) {
		case 1:
			passFija(sc);
			break;
		
		case 2:
			passRandom(sc);
			break;
		}
		
		sc.close();

	}

	private static void passRandom(Scanner sc) {
		System.out.println("- - Introduzca la longitud (NUM)");
		int longitud = sc.nextInt();
		Password p = new Password();
		p.setLongitud(longitud);
		
		passGenerada(p.passAleatoriaGen(), p.getLongitud());
		
	}

	private static void passGenerada(String pass, int longitud) {
		
		double espacio = (55-longitud)/2;
		String contraSyso = "";
		for (int i = 0; i < espacio; i++) {
			contraSyso += " ";
		}
		System.out.println("\n\n\n\n* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("* * * * * * * * * CONTRASE�A GENERADA * * * * * * * * *");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(contraSyso + pass);
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
	}

	private static void passFija(Scanner sc) {
		System.out.println("- - Introduzca el valor clave (NUM)");
		int codigo = sc.nextInt();
		
		System.out.println("\n- - Introduzca la longitud (NUM)");
		int longitud = sc.nextInt();
		
		Password p = new Password();
		p.setCodigo(codigo);
		p.setLongitud(longitud);
		
		passGenerada(p.passFijaGen(), p.getLongitud());
	}

}

package conjunto;

import java.util.Scanner;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String args[]) {
		Boolean bandera;
		Byte opcion;
		do {
			System.out.println("Que desea hacer?");
			System.out.println("1. Menu residentes");
			System.out.println("2. Menu casas");
			opcion = entrada.nextByte();
			switch (opcion) {
				case 1:
					Residentes.residentesMain(); // Ya que el metodo es estatico, no es necesario instanciar, se puede
													// acceder al metodo desde el nombre de la clase
					break;
				case 2:
					Casas.casasMain();
					break;
				default:
					break;
			}
			System.out.println("Hacer algo mas?");
			bandera = entrada.nextBoolean();

		} while (bandera);
	}
}

package conjunto;

import java.util.Scanner;

import entidades.Residente;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static boolean bandera;
	static Residente residente;
	static List<Residente> listaResidentes = new ArrayList<>();
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// REPETIR EL PROYECTO
		do {
			System.out.println("| ------------------------------------ |");
			System.out.println("| Conjunto residencial chupamEstePenco |");
			System.out.println("| ------------------------------------ |");
			System.out.println("| 1. Agregar un residente              |");
			System.out.println("| 2. Listar residentes                 |");
			System.out.println("| 3. Modificar un residente            |");
			System.out.println("| 4. Eliminar un residente             |");
			System.out.println("| ------------------------------------ |");
			System.out.print("| Que accion desea realizar? ");
			byte opcion = entrada.nextByte();
			
			switch (opcion) {
			case 1: // CREATE
				System.out.println("| Agregar residentes: |");
				// Metodo para agregar residentes
				agregarResidente();
				// 
				break;
			case 2: // READ
				System.out.println("| Listar residentes: |");
				// Metodo para listar residentes
				break;
			case 3: // UPDATE
				System.out.println("| Actualizar residentes: |");
				// Metodo para actualziar residentes
				break;
			case 4: // DELETE
				System.out.println("| Eliminar residentes: |");
				// Metodo para eliminar resiedentes
				break;
			default:
				System.out.println("| Gracias por utilizar el sistema |");
			}

			System.out.println("| Desea continuar? |");
			bandera = entrada.nextBoolean();
		} while (bandera);
	}
	
	private static void agregarResidente(){
		residente = new Residente();
	}
	
}

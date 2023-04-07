package conjunto;

import java.util.Scanner;

import entidades.Residente;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	static boolean bandera;
	static Residente residente;
	static int contador;
	static List<Residente> listaResidentes = new ArrayList<>();

	public static void main(String[] args) {
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
				System.out.println("|-----------------|");
				System.out.println("| Agregar residentes: |");
				// Metodo para agregar residentes
				agregarResidente();
				//
				break;
			case 2: // READ
				System.out.println("|-----------------|");
				System.out.println("| Listar residentes: |");
				// Metodo para listar residentes
				listarResidentes(listaResidentes);
				break;
			case 3: // UPDATE
				System.out.println("|-----------------|");
				System.out.println("| Actualizar residentes: |");
				// Metodo para actualziar residentes
				break;
			case 4: // DELETE
				System.out.println("|-----------------|");
				System.out.println("| Eliminar residentes: |");
				// Metodo para eliminar resiedentes
				break;
			default:
				System.out.println("|-----------------|");
				System.out.println("| Gracias por utilizar el sistema |");
			}

			System.out.println("| Desea continuar con el sistema? |");
			bandera = entrada.nextBoolean();
		} while (bandera);
	}

	// Metodo para agregar residentes a la lista
	private static List<Residente> agregarResidente() {
		boolean bandera;
		residente = new Residente();
		// ---------------
		do {
			System.out.print("Nombre: ");
			String nombre = entrada.next();
			residente.setNombre(nombre);

			System.out.print("Telefono: ");
			String telefono = entrada.next();
			residente.setTelefono(telefono);

			System.out.print("Edad: ");
			byte edad = entrada.nextByte();
			residente.setEdad(edad);

			System.out.print("Cedula: ");
			int cedula = entrada.nextInt();
			residente.setCedula(cedula);

			System.out.print("Genero: ");
			String genero = entrada.next();
			residente.setGenero(genero);

			System.out.println("---------------");
			// System.out.println(residente.getNombre()+"-"+residente.getTelefono()+"-"+residente.getEdad()+"-"+residente.getCedula()+"-"+residente.getGenero());

			listaResidentes.add(residente);

			System.out.println("Desea agregar otro residente?");
			bandera = entrada.nextBoolean();
		} while (bandera);

		return listaResidentes;
	}

	// Metodo para listar los residentes agregados
	private static void listarResidentes(List<Residente> listaResidentes) {
		contador = 1;
		listaResidentes.forEach(j -> {
			System.out.println("|-----------------|");
			System.out.println("| Residente #" + contador + " |");
			System.out.println("|-----------------|");
			System.out.println("| Nombre: " + j.getNombre());

			System.out.println("| Cedula: " + j.getCedula());

			System.out.println("| Edad: " + j.getEdad());

			System.out.println("| Telefono: " + j.getTelefono());

			System.out.println("| Genero: " + j.getGenero());

			System.out.println("|-----------------|");

			contador++;
		});
	}
}

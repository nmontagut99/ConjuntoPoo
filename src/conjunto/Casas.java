package conjunto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import entidades.Casa;
import entidades.Residente;

public class Casas {
    static List<Casa> casasDisponibles = new ArrayList<>(Arrays.asList(new Casa(false, 2, 1, "1", true))); // SIMULAR DATOS DE BBDD
    static Residente residentes = new Residente();
    static String arrendatario;
    static Scanner entrada = new Scanner(System.in);
    static Casa casa;
    static int contador;
    static Casa r;

    public static void casasMain() {
        
        Boolean bandera;
        do {
            System.out.println("| ------------------------------------ |");
            System.out.println("| Conjunto residencial chupamEstePenco |");
            System.out.println("| ------------------------------------ |");
            System.out.println("| 1. Agregar una casa              |");
            System.out.println("| 2. Listar casas                 |");
            System.out.println("| 3. Modificar una casa            |");
            System.out.println("| 4. Eliminar una casa             |");
            System.out.println("| ------------------------------------ |");
            System.out.print("| Que accion desea realizar? ");
            byte opcion = entrada.nextByte();
            switch (opcion) {
                case 1:
                    agregarCasa();
                    break;
                case 2:
                    listarCasas(casasDisponibles);
                    break;
                case 3:
                    actualizarCasa(casasDisponibles);
                    break;
                case 4:
                    eliminarCasa(casasDisponibles);
                    break;
            }
            System.out.println("Desea agregar otra casa:");
            bandera = entrada.nextBoolean();
        } while (bandera);
    }

    // Metodo para agregar casas a la lista
    private static List<Casa> agregarCasa() {
        boolean bandera;
        // ---------------
        do {
            casa = new Casa();

            System.out.print("Arrendada: ");
            casa.setArrendada(entrada.nextBoolean());

            System.out.print("Habitaciones: ");
            casa.setHabitaciones(entrada.nextInt());

            System.out.print("Banios: ");
            casa.setBanios(entrada.nextInt());

            int ban =0;
            
            do {
                System.out.print("Numero casa: ");
                String numCasa = entrada.next();
               
                Casa c = casasDisponibles.stream().filter(cas -> cas.getNumeroCasa().equals(numCasa)).findAny().orElse(null);
                
                if (c != null) {
                	System.out.println("La casa ya existe");
                }else {
                    casa.setNumeroCasa(numCasa);
                    ban = 1;
                }
                
            }while(ban != 1);

            System.out.print("Parqueadero: ");
            casa.setParqueadero(entrada.nextBoolean());

            System.out.println("---------------");
            casasDisponibles.add(casa);

            System.out.println("Desea agregar otra casa?");
            bandera = entrada.nextBoolean();
        } while (bandera);

        return casasDisponibles;
    }

    // Metodo para listar los casas agregados
    protected static void listarCasas(List<Casa> listaCasas) {
        contador = 1;
        listaCasas.forEach(j -> {
            System.out.println("|-----------------|");
            System.out.println("| Casa #" + contador + " |");
            System.out.println("|-----------------|");
            System.out.println("| Arrendada: " + j.getArrendada());
            
            if(j.getArrendada()) {
            	Residentes.listaResidentes.forEach(k->{
            		if (j.getNumeroCasa().equals(k.getCasa().getNumeroCasa())) {
            			System.out.println("| Arrendatario: " + k.getNombre());
            		}
            		
            	});
            	//Residentes residente = new Residentes();
            }

            System.out.println("| Habitaciones: " + j.getHabitaciones());

            System.out.println("| Banios: " + j.getBanios());

            System.out.println("| Numero casa: " + j.getNumeroCasa());

            System.out.println("| Parqueadero: " + j.getParqueadero());
            
            System.out.println("|-----------------|");

            contador++;
        });
    }

    public static void actualizarCasa(List<Casa> listaCasas) {
        System.out.println("Casas actualmente en el conjunto");
        listarCasas(listaCasas);
        System.out.println("| --------------------- |");
        System.out.println("Ingrese el numero de la casa que desea modificar de la lista: ");
        String cedula = entrada.next();

        listaCasas.forEach(k -> {

            if (k.getNumeroCasa().equals(cedula)) {
                Boolean bandera;
                do {
                    System.out.println("| -------------------------------- |");
                    System.out.println("|- Valores que se puede modificar -|");
                    System.out.println("| -------------------------------- |");
                    System.out.println("Arrendada: " + k.getArrendada());
                    System.out.println("Habitaciones: " + k.getHabitaciones());
                    System.out.println("Banios: " + k.getBanios());
                    System.out.println("| ------------------- |");
                    // ---------------
                    System.out.println("Que dato desea modificar a la casa " + k.getNumeroCasa() + "?");
                    System.out.println("| 1. Arrendada |");
                    System.out.println("| 2. Habitaciones |");
                    System.out.println("| 3. Banios |");
                    System.out.println("| 4. exit |");

                    byte opcion = entrada.nextByte();

                    switch (opcion) {
                        case 1:
                            System.out.println("| 1. Arrendada |");
                            System.out.println("| Estado actual: " + k.getArrendada());
                            System.out.println("| Cual es el nuevo estado: |");
                            k.setArrendada(entrada.nextBoolean());
                            System.out.println("| Modificacion exitosa: Nuevo estado: " + k.getArrendada() + " |");
                            break;
                        case 2:
                            System.out.println("| 2. Habitaciones |");
                            System.out.println("| Habitaciones actuales: " + k.getHabitaciones());
                            System.out.println("| Cual es la nueva cantidad de habitaciones: |");
                            k.setHabitaciones(entrada.nextInt());
                            System.out.println("| Modificacion exitosa: Nueva cantidad de habitaciones: "
                                    + k.getHabitaciones() + " |");

                            break;
                        case 3:
                            System.out.println("| 3. Banios |");
                            System.out.println("| Banios actuales: " + k.getBanios());
                            System.out.println("| Cual es la nueva cantidad de banios: |");
                            k.setBanios(entrada.nextInt());
                            System.out.println(
                                    "| Modificacion exitosa: Nueva cantidad de banios: " + k.getBanios() + " |");

                            break;
                        default:
                            System.out.println("| 4. exit |");
                            break;
                    }

                    System.out.println("Desea modificar otro dato de la casa" + k.getNumeroCasa() + "?");
                    bandera = entrada.nextBoolean();
                } while (bandera);
            }
        });

    }

    public static void eliminarCasa(List<Casa> listaCasas) {
        System.out.println("Casas actualmente en el conjunto");
        listarCasas(listaCasas);
        System.out.println("| --------------------- |");
        System.out.println("Ingrese el numero de la casa que desea eliminar de la lista: ");
        String cedula = entrada.next();

        listaCasas.forEach(k -> {

            if (k.getNumeroCasa().equals(cedula)) {
                System.out.println("Casa: " + k.getNumeroCasa() + " fue eliminada");
                casa = k;
            }
        });
        listaCasas.remove(casa);
    }
}

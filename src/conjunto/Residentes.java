package conjunto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Residente;

public class Residentes {
    static Scanner entrada = new Scanner(System.in);
    static boolean bandera;
    static Residente residente;
    static int contador;
    static List<Residente> listaResidentes = new ArrayList<>();
    static Residente r;

    public static void residentesMain() {
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
                    // Metodo para agregar residentes a la lista
                    agregarResidente();
                    // listarResidentes(listaResidentes); // lo quito porque es muy molesto XD
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
                    actualizarResidente(listaResidentes);
                    break;
                case 4: // DELETE
                    System.out.println("|-----------------|");
                    System.out.println("| Eliminar residentes: |");
                    // Metodo para eliminar resiedentes
                    eliminarResidente(listaResidentes);
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
        // ---------------
        do {
            residente = new Residente();

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
            String cedula = entrada.next();
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

    public static void actualizarResidente(List<Residente> listaResidentes) {
        System.out.println("Residentes actualmente en el conjunto");
        listarResidentes(listaResidentes);
        System.out.println("| --------------------- |");
        System.out.println("Ingrese al cedula del residente que desea modificar de la lista: ");
        String cedula = entrada.next();

        listaResidentes.forEach(k -> {

            if (k.getCedula().equals(cedula)) {
                do {
                    System.out.println("| -------------------------------- |");
                    System.out.println("|- Valores que se puede modificar -|");
                    System.out.println("| -------------------------------- |");
                    System.out.println("Nombre: " + k.getNombre());
                    // System.out.println("Cedula: "+k.getCedula());
                    System.out.println("Telefono: " + k.getTelefono());
                    System.out.println("Edad: " + k.getEdad());
                    System.out.println("Genero: " + k.getGenero());
                    System.out.println("| ------------------- |");
                    // ---------------
                    System.out.println("Que dato desea modificar al residente " + k.getNombre() + "?");
                    System.out.println("| 1. Telefono |");
                    System.out.println("| 2. Edad |");
                    System.out.println("| 3. Genero |");
                    System.out.println("| 4. exit |");

                    byte opcion = entrada.nextByte();

                    switch (opcion) {
                        case 1:
                            System.out.println("| 1. Telefono |");
                            System.out.println("| Telefono actual: " + k.getTelefono());
                            System.out.println("| Cual es el nuevo telefono: |");
                            String telefono = entrada.next();
                            k.setTelefono(telefono);
                            System.out.println("| Modificacion exitosa: Nuevo telefono: " + k.getTelefono() + " |");
                            break;
                        case 2:
                            System.out.println("| 1. Edad |");
                            System.out.println("| Edad actual: " + k.getEdad());
                            System.out.println("| Cual es la nueva edad: |");
                            byte edad = entrada.nextByte();
                            k.setEdad(edad);
                            System.out.println("| Modificacion exitosa: Nueva edad: " + k.getEdad() + " |");

                            break;
                        case 3:
                            System.out.println("| 3. Genero |");
                            System.out.println("| Genero actual: " + k.getGenero());
                            System.out.println("| Cual es el nuevo genero: |");
                            String genero = entrada.next();
                            k.setGenero(genero);
                            System.out.println("| Modificacion exitosa: Nuevo genero: " + k.getGenero() + " |");

                            break;
                        default:
                            System.out.println("| 4. exit |");
                            break;
                    }

                    System.out.println("Desea modificar otro dato del residente" + k.getNombre() + "?");
                    bandera = entrada.nextBoolean();
                } while (bandera);
            }
        });

    }

    public static void eliminarResidente(List<Residente> listaResidentes) {
        System.out.println("Residentes actualmente en el conjunto");
        listarResidentes(listaResidentes);
        System.out.println("| --------------------- |");
        System.out.println("Ingrese al cedula del residente que desea eliminar de la lista: ");
        String cedula = entrada.next();

        listaResidentes.forEach(k -> {

            if (k.getCedula().equals(cedula)) {
                System.out.println("Residente: " + k.getNombre() + " con cedula: " + k.getCedula() + " fue eliminado");
                residente = k;
            }
        });
        listaResidentes.remove(residente);
        // listarResidentes(listaResidentes);
    }
}

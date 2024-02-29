package ej_biblioteca.nacho;

import ej_biblioteca.nacho.clases.Biblioteca;

import java.util.Scanner;

public class GestionBiblioteca {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Biblioteca library = new Biblioteca();

        boolean salir = Boolean.FALSE;

        do {
            System.out.println("------------------------------------------\n" +
                    "Bienvenido a la Biblioteca Azteca\n" +
                    "\n¿Que desea hacer?\n" +
                    "1. Dar de alta un nuevo usuario.\n" +
                    "2. Registrar un libro nuevo.\n" +
                    "3. Prestamo de un libro.\n" +
                    "4. Devolver un libro.\n" +
                    "5. Salir.\n" +
                    "------------------------------------------");

            int eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    darAltaUsuario(library);
                    break;

                case 2:
                    registrarLibro(library);
                    break;

                case 3:
                    prestarLibro(library);
                    break;

                case 4:
                    devolverLibro(library);
                    break;

                case 5:
                    salir = Boolean.TRUE;
                    break;

                default:
                    System.out.println("La opción introducida no es válida.");
                    break;
            }
        } while (!salir);

    }

    public static void darAltaUsuario(Biblioteca library) {
        System.out.print("Por favor Introduzca el id del nuevo usuario: ");
        int id = sc.nextInt();

        System.out.print("Introduzca el nombre del nuevo usuario: ");
        String nombre = sc.next();

        library.crearUsuario(id, nombre);
    }

    public static void registrarLibro(Biblioteca library) {
        System.out.print("Por favor introduzca el número de serie del libro: ");
        int numSerie = sc.nextInt();

        System.out.print("Introduce el titulo del libro: ");
        String titulo = sc.next();

        sc.nextLine();

        System.out.print("Introduce el autor del libro: ");
        String autor = sc.next();

        library.crearLibro(numSerie, titulo, autor);
    }

    public static void prestarLibro(Biblioteca library) {
        System.out.println("Introduzca el número de serie del libro que desea prestar: ");
        int numSerie = sc.nextInt();

        System.out.println("Introduzca el id del usuario al que se le prestará el libro: ");
        int id = sc.nextInt();

        library.prestarLibro(numSerie, id);
    }

    public static void devolverLibro(Biblioteca library) {
        System.out.println("Introduzca el número de serie del libro que se va a devolver: ");
        int numSerie = sc.nextInt();

        library.devolverLibro(numSerie);
    }
}

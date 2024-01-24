package clases;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Usuario> users;

    private ArrayList<Libro> books;

    public Biblioteca() {
        users = new ArrayList<>();

        books = new ArrayList<>();

        users.add(new Usuario(01, "Negrito"));
        users.add(new Usuario(02, "Nacho"));

        books.add(new Libro(001, "El Lazarillo de Tórmes", "Anonimo"));
        books.add(new Libro(002, "El libro de la vida", "No sé"));
    }

    public void crearUsuario(int id, String nombre) {
        users.add(new Usuario(id, nombre));
    }

    public void crearLibro(int numSerie, String titulo, String autor) {
        books.add(new Libro(numSerie, titulo, autor));
    }

    public void prestarLibro(int numSerie, int id) {

        Libro libroEncontrado = null;

        for (Libro localizaLibro : books) {
            if (localizaLibro.getNumSerie() == numSerie) {
                libroEncontrado = localizaLibro;
            }
        }

        Usuario usuarioEncontrado = null;

        for (Usuario localizaUsuario : users) {
            if (localizaUsuario.getId() == id) {
                usuarioEncontrado = localizaUsuario;
            }
        }

        if (!libroEncontrado.isPrestado()) {
            System.out.println("El libro " + libroEncontrado.getTitulo() +
                    " ha sido prestado correctamente al ususario " + usuarioEncontrado.getNombre() + ".");
            libroEncontrado.setPrestado(Boolean.TRUE);
        } else {
            System.out.println("El libro ya esta prestado.");
        }
    }

    public void devolverLibro(int numSerie) {

        Libro libroEncontrado = null;

        for (Libro localizaLibro : books) {
            if (localizaLibro.getNumSerie() == numSerie) {
                libroEncontrado = localizaLibro;
            }
        }

        if (!libroEncontrado.isPrestado()) {
            System.out.println("Aviso! Este libro no ha sido prestado.");
        } else {
            System.out.println("Libro devuelto correctamente.");
            libroEncontrado.setPrestado(Boolean.FALSE);
        }
    }
}

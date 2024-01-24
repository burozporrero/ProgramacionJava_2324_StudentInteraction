package clases;

public class Libro {

    private int numSerie;
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(int numSerie, String titulo, String autor) {
        this.numSerie = numSerie;
        this.titulo = titulo;
        this.autor = autor;
        prestado = Boolean.FALSE;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

}

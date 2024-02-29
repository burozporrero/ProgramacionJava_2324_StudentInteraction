package revision_examen.herencia.Clases;

public abstract class Producto {

    private String nombre;
    private String fechaCaducidad;
    private int numeroLote;
    private boolean isAlmacenado;
    private int cantidad;

    public Producto(String nombre, String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        isAlmacenado = Boolean.TRUE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String fechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public boolean isAlmacenado() {
        return isAlmacenado;
    }

    public void setAlmacenado(boolean almacenado) {
        isAlmacenado = almacenado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

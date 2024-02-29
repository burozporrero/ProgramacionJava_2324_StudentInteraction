package revision_examen.herencia.Clases;

public class ProductoFresco extends Producto {
    String nombre;
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String nombre, String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(nombre,fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }


}

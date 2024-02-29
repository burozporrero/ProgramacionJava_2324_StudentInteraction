package revision_examen.herencia.Clases;

public class ProductoRefigerado extends Producto {
    String nombre;
    private String codigoOSA;

    public ProductoRefigerado(String nombre, String fechaCaducidad, int numeroLote, String codigoOSA) {
        super(nombre, fechaCaducidad, numeroLote);
        this.codigoOSA = codigoOSA;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public String getCodigoOSA() {
        return codigoOSA;
    }

    public void setCodigoOSA(String codigoOSA) {
        this.codigoOSA = codigoOSA;
    }
}

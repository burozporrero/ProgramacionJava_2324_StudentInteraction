package revision_examen.herencia.Clases;

public class ProductoCongelado extends Producto {
    String nombre;

    private double temperaturaCongelacionRec;

    public ProductoCongelado(String nombre, String fechaCaducidad, int numeroLote, double temperaturaCongelacionRec) {
        super(nombre, fechaCaducidad, numeroLote);
        this.temperaturaCongelacionRec = temperaturaCongelacionRec;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public double getTemperaturaCongelacionRec() {
        return temperaturaCongelacionRec;
    }

    public void setTemperaturaCongelacionRec(double temperaturaCongelacionRec) {
        this.temperaturaCongelacionRec = temperaturaCongelacionRec;
    }
}

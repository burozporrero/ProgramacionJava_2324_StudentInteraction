package revision_examen.mejorar_if;

import java.time.LocalDate;
import java.util.Objects;

public class ProductoCongelado extends Producto {
    private LocalDate fechaCaducidad;
    private int numeroLote;
    private double temperaturaRecomendada;

    public ProductoCongelado() {

    }

    public ProductoCongelado(LocalDate fechaCaducidad, int numeroLote, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.temperaturaRecomendada=temperaturaRecomendada;
    }

    @Override
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public int getNumeroLote() {
        return numeroLote;
    }

    @Override
    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoCongelado that)) return false;
        if (!super.equals(o)) return false;
        return numeroLote == that.numeroLote && Double.compare(temperaturaRecomendada, that.temperaturaRecomendada) == 0 && Objects.equals(fechaCaducidad, that.fechaCaducidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaCaducidad, numeroLote, temperaturaRecomendada);
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" +
                "fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                ", temperaturaRecomendada=" + temperaturaRecomendada +
                '}';
    }
}

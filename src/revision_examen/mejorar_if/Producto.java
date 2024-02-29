package revision_examen.mejorar_if;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {
    private LocalDate fechaCaducidad;
    private int numeroLote;

    public Producto() {
        super();
    }

    public Producto(LocalDate fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto productos)) return false;
        return numeroLote == productos.numeroLote && Objects.equals(fechaCaducidad, productos.fechaCaducidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaCaducidad, numeroLote);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                '}';
    }
}

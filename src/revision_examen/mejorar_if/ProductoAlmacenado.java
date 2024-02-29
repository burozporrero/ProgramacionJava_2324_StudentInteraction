package revision_examen.mejorar_if;

import java.time.LocalDate;
import java.util.Objects;

public class ProductoAlmacenado extends Producto {
    private LocalDate fechaCaducidad;
    private int numeroLote;
    private int cantidadStock;
    private double precio;

    public ProductoAlmacenado() {
        super();
    }

    public ProductoAlmacenado(LocalDate fechaCaducidad, int numeroLote, int cantidadStock, double precio) {
        super(fechaCaducidad, numeroLote);
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.cantidadStock = cantidadStock;
        this.precio = precio;
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

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoAlmacenado that)) return false;
        if (!super.equals(o)) return false;
        return numeroLote == that.numeroLote && cantidadStock == that.cantidadStock && Double.compare(precio, that.precio) == 0 && Objects.equals(fechaCaducidad, that.fechaCaducidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaCaducidad, numeroLote, cantidadStock, precio);
    }

    @Override
    public String toString() {
        return "ProductoAlmacenado{" +
                "fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                ", cantidadStock=" + cantidadStock +
                ", precio=" + precio +"€ "+
                '}';
    }
}

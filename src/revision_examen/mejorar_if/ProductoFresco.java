package revision_examen.mejorar_if;

import java.time.LocalDate;
import java.util.Objects;

public class ProductoFresco extends Producto {
    private LocalDate fechaCaducidad;
    private LocalDate fechaEnvasado;
    private String paisOrigen;
    private int numeroLote;



    public ProductoFresco(){
        super();
    }

    public ProductoFresco(LocalDate fechaCaducidad, LocalDate fechaEnvasado, String paisOrigen, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaCaducidad = fechaCaducidad;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.numeroLote = numeroLote;
    }


    @Override
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public int getNumeroLote() {
        return numeroLote;
    }

    @Override
    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoFresco that)) return false;
        if (!super.equals(o)) return false;
        return numeroLote == that.numeroLote && Objects.equals(fechaCaducidad, that.fechaCaducidad) && Objects.equals(fechaEnvasado, that.fechaEnvasado) && Objects.equals(paisOrigen, that.paisOrigen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaCaducidad, fechaEnvasado, paisOrigen, numeroLote);
    }

    @Override
    public String toString() {
        return "ProductoFresco{" +
                "fechaCaducidad=" + fechaCaducidad +
                ", fechaEnvasado=" + fechaEnvasado +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", numeroLote=" + numeroLote +
                '}';
    }
}

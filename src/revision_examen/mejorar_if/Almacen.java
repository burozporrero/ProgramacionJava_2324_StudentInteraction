package revision_examen.mejorar_if;

import java.util.ArrayList;

public class Almacen {
    private static ArrayList<ProductoAlmacenado> productosAlmacenados = new ArrayList<>(1000);

    public static void almacenarProductos(Producto producto, int stock, double precio) {
        if (productosAlmacenados.size() == 1000) {
            borrarStockVacios();
        } else {
            if (stock == 0 || precio == 0) {
                if (stock == 0) {
                    System.out.println("Como se introdujo el valor del stock por debajo de cero se pondrá 1 por defecto");
                    stock = 1;
                } else {
                    System.out.println("Como se introdujo el valor del precio por debajo de cero se pondrá 1.00 por defecto");
                    precio = 1.00;
                }
            }
            productosAlmacenados.add(new ProductoAlmacenado(producto.getFechaCaducidad(), producto.getNumeroLote(), stock, precio));

        }

    }

    public int consultarStockAlmacen(Producto producto) {
        if (productosAlmacenados.contains(producto)) {
            return productosAlmacenados.get(productosAlmacenados.indexOf(producto)).getCantidadStock();
        }
        return 0;
    }

    public int sacarCantidadStock(Producto producto, int cantidad) {
        int stockAlmacenado = consultarStockAlmacen(producto);

        if (stockAlmacenado == 0) {
            System.out.println("Stock vacio, no se puede sacar nada");
            return 0;
        } else {
            if (stockAlmacenado < cantidad) {
                System.out.println("Se ha podido extraer: " + stockAlmacenado);
                return stockAlmacenado;
            } else {
                System.out.println("Se ha podido extraer: " + cantidad);
                return cantidad;
            }
        }
    }

    public static void borrarStockVacios() {
        for (ProductoAlmacenado producto : productosAlmacenados) {
            if (producto.getCantidadStock()==0){
                productosAlmacenados.remove(producto);
            }
        }
    }

    public void ordenarArray(){
        for (ProductoAlmacenado producto:productosAlmacenados) {
            int indice = productosAlmacenados.indexOf(producto);
            if (producto.getFechaCaducidad().isBefore(productosAlmacenados.get(indice).getFechaCaducidad())){

            }

        }
    }
}

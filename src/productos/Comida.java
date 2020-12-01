package productos;

import productos.Producto;

public class Comida  extends Producto {
    private String unidadVenta;

    public Comida(String nombre, int precio , String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre:" +" " + this.getNombre() + " " + "///" +
                " " + "Precio:" +" " + "$" + this.getPrecio()+ " " + "///" +
                " " + "Unidad de venta:" + " " + this.getUnidadVenta();
    }
}

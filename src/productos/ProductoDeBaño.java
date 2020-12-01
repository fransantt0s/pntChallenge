package productos;

import productos.Producto;

public class ProductoDeBaño extends Producto {
    private String contenido;

    public ProductoDeBaño(String nombre, String contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String toString() {
        return "Nombre:" +" " + this.getNombre() + " " + "///" +
                  " " +"Contenido:" + " " + this.getContenido()+ " " + "///" +
                " " + "Precio:" + " " + "$" + this.getPrecio();
    }
}

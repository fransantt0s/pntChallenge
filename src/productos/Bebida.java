package productos;

import productos.Producto;

public class Bebida extends Producto {
    private double litros;
    public Bebida(String nombre, double litros, int precio ) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public String toString() {
        return "Nombre:" +" " + this.getNombre() + " " + "///" +
                " " + "Litros:" + " " + this.getLitros()+ " " + "///" +
                " " + "Precio:" + " "  +"$" + this.getPrecio();
    }

    @Override
    public int compareTo(Producto o) {
        return 0;
    }
}

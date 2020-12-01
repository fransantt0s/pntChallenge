package tienda;

import productos.Producto;

import java.util.ArrayList;

public class Tienda {
    private ArrayList <Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<Producto>();
    }

    public void imprimirProductos(){
        for(int i=0; i<productos.size(); i++){
            System.out.println(productos.get(i).toString());
        }
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto( Producto producto){
        this.productos.add(producto);

    }

    public void eliminarProducto(Producto producto){
        this.productos.remove(producto);
    }
}

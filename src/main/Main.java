package main;

import productos.Bebida;
import productos.Comida;
import productos.ProductoDeBaño;
import tienda.Tienda;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Bebida cocaColaZero = new Bebida("Coca-Cola Zero",1.5,20);
        Bebida cocaCola = new Bebida("Coca-Cola",1.5,18);
        ProductoDeBaño shampoo = new ProductoDeBaño("Shampoo Sedal","500ml",19);
        Comida frutillas = new Comida("Frutillas",64,"kilo");
        tienda.agregarProducto(cocaColaZero);
        tienda.agregarProducto(cocaCola);
        tienda.agregarProducto(shampoo);
        tienda.agregarProducto(frutillas);
        tienda.imprimirProductos();
        System.out.println("=======================================");
        Collections.sort(tienda.getProductos());
        System.out.println("productos.Producto más caro:" + " " + tienda.getProductos().get(tienda.getProductos().size()-1).getNombre());
        System.out.println("productos.Producto más barato:" + " " + tienda.getProductos().get(0).getNombre());

    }


}

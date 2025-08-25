/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;

public class ProductoService {
    private ArrayList<Producto> productos;

    public ProductoService() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, String tipo) {
        Producto nuevo = new Producto(nombre, tipo);
        productos.add(nuevo);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
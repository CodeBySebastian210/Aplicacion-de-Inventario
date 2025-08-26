/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

public class ProductoService {
    private final List<Producto> productos;
    private int contadorId = 1;

    public ProductoService() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, String tipo) {
        productos.add(new Producto(contadorId++, nombre, tipo));
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public boolean actualizarProducto(int id, String nuevoNombre, String nuevoTipo) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setTipo(nuevoTipo);
                return true;
            }
        }
        return false; 
    }

    public boolean eliminarProducto(int id) {
        return productos.removeIf(p -> p.getId() == id);
    }
}

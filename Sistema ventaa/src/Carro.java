
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Benjamin
 */
public class Carro {
    
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public Carro() {
    }
    
    public void agregarProducto(Producto producto) {
        if (listaProductos.add(producto)) {
            System.out.println("Se ha annadido el producto");
        } else {
            System.out.println("No se pudo añadir el producto");
        }
    }
    
    public void listarProductos(){
        System.out.println("------Lista de productos------");
        for (Producto producto : listaProductos) {
            System.out.println(producto.descripcionDetallada());
            System.out.println("------------------------------");
        }
    }
    
}

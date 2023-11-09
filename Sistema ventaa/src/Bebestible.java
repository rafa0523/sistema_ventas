/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Benjamin
 */
public class Bebestible extends Producto{
    
    private String nombre,pesoMl;

    public Bebestible() {
    }

    public Bebestible(String nombre, String pesoMl, String tipo, int precio, int codigo) {
        super(tipo, precio, codigo);
        this.nombre = nombre;
        this.pesoMl = pesoMl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPesoMl() {
        return pesoMl;
    }

    public void setPesoMl(String pesoMl) {
        this.pesoMl = pesoMl;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "nombre=" + nombre + ", pesoMl=" + pesoMl + '}';
    }

    @Override
    public String descripcionDetallada() {
        String descripcion = "Bebestible: " + nombre + "\nPrecio: " + precio + "\nPeso: " + pesoMl;
        return descripcion;
    }
    
   
    
    
}

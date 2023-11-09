/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Benjamin
 */
public class Galletas extends Producto{
    
    private String nombre,pesoGr;

    public Galletas() {
    }

    public Galletas(String nombre, String pesoGr, String tipo, int precio, int codigo) {
        super(tipo, precio, codigo);
        this.nombre = nombre;
        this.pesoGr = pesoGr;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPesoGr() {
        return pesoGr;
    }

    public void setPesoGr(String pesoGr) {
        this.pesoGr = pesoGr;
    }

    @Override
    public String toString() {
        return "Galletas{" + "nombre=" + nombre + ", pesoGr=" + pesoGr + '}';
    }

    @Override
    public String descripcionDetallada() {
        String descripcion = "Galleta: " + nombre + "\nPrecio: " + super.getPrecio() + "\nPeso: " + pesoGr;
        return descripcion;
    }
    
    
    
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Benjamin
 */
abstract class Producto {
    
    protected String tipo;
    protected int precio,codigo;

    public Producto() {
    }

    public Producto(String tipo, int precio, int codigo) {
        this.tipo = tipo;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    @Override
    public String toString() {
        return "Principal{" + "nombre=" + tipo + ", precio=" + precio + ", codigo=" + codigo + '}';
    }
    
    public abstract String descripcionDetallada();
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Benjamin
 */
public class Main {
    public static void main(String[] args) {
        
    Galletas galleta = new Galletas("Triton", "126 Gr", "Galleta", 700, 12345);
    Bebestible bebestible = new Bebestible("Pepsi", "1,5 Lt", "Bebestible", 2000, 12346);
    
    Carro carro = new Carro();
    
    carro.agregarProducto(galleta);
    carro.agregarProducto(bebestible);
    
    
    carro.listarProductos();
    
    
        
        
          
    }
    
}

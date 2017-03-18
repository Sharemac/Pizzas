
package pizzeria;

import java.util.Scanner;


public class Ingredientes {
    private String nombre;
    private double precio;
    private int l;
    private Ingredientes[] ingrediente;
    
    Scanner entrada = new Scanner(System.in);
    
    public Ingredientes(int l){
        this.l = l;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
   
    
   

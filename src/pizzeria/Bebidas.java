
package pizzeria;

import java.util.Scanner;


public class Bebidas {
    private String Tipo;
    private String Tamano;
    private double Precio;
    Scanner entrada = new Scanner(System.in);
    
public Bebidas (int b){
    if (b == 1){
        Tamano = "Grande";
        Precio = 1000;
    }else {
        Tamano = "Pequeño";
        Precio = 500;
    }
}
public void Escoger_Tipo(){
    System.out.println("Tenemos dos tipos de bebida para ti:\n"
            +"1: Gaseosa\n"
            +"2: Limonada");
    int t = entrada.nextInt();
    if(t == 1){
        this.Tipo = "Gaseosa";
        this.Precio = 3200 + Precio;
    }else if(t==2){
        this.Tipo = "Limonada";
        this.Precio = 3500 + Precio;
    }
}

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String Tamano) {
        this.Tamano = Tamano;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }


}

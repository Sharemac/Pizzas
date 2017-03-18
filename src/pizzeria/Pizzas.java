
package pizzeria;

import java.util.Scanner;

public class Pizzas {
     private Ingredientes ingrediente;
     private int x;
     private double Precio;
     private double val;
     private String Nombrepre;
     private String NombreHum;
     private int tamano;
     Scanner entrada = new Scanner(System.in);
     Ingredientes p1= new Ingredientes(0);
public Pizzas(int tamano){
        this.tamano = tamano;
     if(tamano == 6){
        this.val = 1000;
     }else if (tamano == 9){
         this.val = 2000;
     }else if (tamano == 12){
         this.val = 3000;
     }
    }

    public void Pizza_Hum(){
    Ingredientes p1= new Ingredientes(0);
    int n, s;
    double total=0;
    System.out.println("Esta es nuestra lista de ingredientes:\n"
            + "1: Pollo\n"
            + "2: Carne\n"
            + "3: Jamon\n"
            + "4: Queso\n"
            + "5: Tomate\n"
            + "6: Pina\n"
            + "7: Pimenton\n");
    System.out.println("Cuantos ingredientes desea anadir: ");
    n = entrada.nextInt();
    
    for(int i = 0; i < n; i++){
        System.out.println("Ingrese el NUMERO del ingrediente "+ (i+1)+ ": ");
        s = entrada.nextInt();
        Ingredientes[] ingredientes;
        ingredientes = new Ingredientes[n];
        ingredientes[i] = new Ingredientes(0);
    if (s == 1){
        this.Precio = 2000;
    } if (s == 2){
        this.Precio = 2000; 
    }else if (s == 3){
        this.Precio = 2000;  
    }else if (s == 4){
        this.Precio = 1500;  
     }else if (s == 5){
        this.Precio = 500;  
     }else if (s == 6){
        this.Precio = 1000;  
     }else if (s == 7){
        this.Precio = 800;  
       }
    this.Precio += Precio+ val;
    }
    }
    public void Pizza_Pre(){
        System.out.println("Esta es la coleccion de pizzas que tenemos para ti. Escoge el NUMERO:\n"
                + "1: Mexicana\n"
                + "2: Pollo con champinones\n"
                + "3: Carnes\n"
                + "4: Hawaiana\n"
                + "5: Vegetales\n");
        x = entrada.nextInt();
        if(x == 1){
            this.Nombrepre = "Mexicana";
            this.Precio = 7500;
        }else if(x == 2){
            this.Nombrepre ="Pollo con champinones";
            this.Precio= 7500+ val;
        }else if(x == 3){
            this.Nombrepre ="Carnes";
            this.Precio= 7500+ val;
        }else if(x == 4){
            this.Nombrepre ="Hawaiana";
            this.Precio= 7500 + val;
        }else if(x == 5){
            this.Nombrepre ="Vegetales";
            this.Precio= 7500+ val;
        }
    }
    
    public double getPrecio(){
        return Precio;
    }
    

    
}

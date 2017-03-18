
package pizzeria;

import java.util.Scanner;


public class Orden {
      private double precio=0;
      private Bebidas b;
      private Pizzas pizza1, pizza2;
      private boolean beb = false, h= false, p = false;
      Scanner entrada = new Scanner(System.in);

public void Elegir_Pizza(int c){
    int tamano;
     switch(c){
        case 1:
             h= true;
             System.out.println("Tenemos tres tamanos de pizza para ti: 6, 9 o 12 pulgadas ¿Cual deseas?");
             tamano= entrada.nextInt();
             pizza1 = new Pizzas(tamano);
             pizza1.Pizza_Hum();
        this.precio += pizza1.getPrecio(); 
        break;
        
        case 2:
            p = true;
            System.out.println("Tenemos tres tamanos de pizza para ti: 6, 9 o 12 pulgadas ¿Cual deseas?");
            tamano= entrada.nextInt();
            pizza2 = new Pizzas(tamano);
            pizza2.Pizza_Pre();
        this.precio += pizza2.getPrecio();
        break;
}       
}
    
    public void Elegir_Bebida(){
      int a;
      beb = true;
        System.out.println("De que tamaño deseas tu bebida:\n"
                + "1: Grande\n"
                + "2: Pequeña");
        a= entrada.nextInt();
        b= new Bebidas(a);
        b.Escoger_Tipo();
        this.precio += b.getPrecio();
    }
    public void Mostrar_Resumen(){
        System.out.println("\nEstamos preparando su orden\n"
                + "Cuando finalice puede acercarse a una de nuestras cajas a cancelar");
        System.out.println("El total a pagar es: "+ this.precio
                + "\nGracias por preferir PizzaBase\n"
                        + "Vuelva pronto =)");
        
        
        
    }
}

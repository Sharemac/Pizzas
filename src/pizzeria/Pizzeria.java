
package pizzeria;

import java.util.Scanner;


public class Pizzeria {

    
    public static void main(String[] args) {
        boolean a = true;
        Scanner entrada = new Scanner(System.in);
        Orden orden1 = new Orden();
       
    while(a){
        System.out.println("Bienvenido al menu digital de PizzaBase\n"
                + "Navegue por el menu para seleccionar su orden y cuando finalice oprima 4.\n"
                + "1. Pizza_Hum: Escoga usted mismo los ingredientes.\n"
                + "2. Pizza_Pre: Seleccione entre la coleccion que creamos para usted.\n"
                + "3. Acompane su pizza con una bebida, seleccionela aqui.\n");
        int b;
        b = entrada.nextInt();
        switch(b){
                case 1:
                    orden1.Elegir_Pizza(1);
                    break;
                case 2:
                    orden1.Elegir_Pizza(2);
                    break;
                case 3:
                    orden1.Elegir_Bebida();
                    break;
                case 4:
                    a= false;
                    orden1.Mostrar_Resumen();
                    break;
        }
    }
        
            
    }
    
}

import java.util.Scanner;

public class Descuento {
    private double precio_tarifa;
    private double precio_pagado;
    private double porcentaje;
    
    Scanner obx = new Scanner(System.in); 
    
    public void Descuento(){
       System.out.println("Introduzca el precio regular: ");
       precio_tarifa = obx.nextDouble();
       System.out.println("Introduzca el precio pagado: ");
       precio_pagado = obx.nextDouble();
       
       porcentaje = (precio_tarifa + precio_pagado)*100;
       System.out.println("El porcentaje: " + porcentaje);
       
    }
}
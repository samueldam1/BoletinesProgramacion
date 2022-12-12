package boletin8;

import java.util.Scanner;

public class ventas {
    public void numVentas(){
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del producto: ");
        String articulo = scaner.next();
        
        System.out.println("Introduce las ventas: ");
        double ventas = scaner.nextDouble();
        
        System.out.println(articulo);
        if(ventas<=100)
            System.out.println("Bajo");
        else if(ventas<=500)
                System.out.println("Medio");
            else if(ventas<=1000)
                    System.out.println("Alto");
                else{
                    System.out.println("Primera necesidad");
            }
    }
}
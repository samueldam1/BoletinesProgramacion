package boletin8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        // Ejercicio 6
        
        ventas obx1 = new ventas();
        obx1.numVentas();
        
        // Ejercicio 7
        
        System.out.println("1. Para calcular área de cuadradro.");
        System.out.println("2. Para calcular área de triángulo.");
        System.out.println("3. Para carcula área de círculo.");
        int num = scaner.nextInt();
        Areas obx = new Areas();
        switch(num){
            case 1:
                obx.areaCuadrado();
                break;
            case 2:
                obx.areaTriangulo();
                break;
            case 3:                
                obx.areaCirculo();
                break;
            default:
                System.out.println("Número del 1 al 3.");
                break;
        }
    }
}
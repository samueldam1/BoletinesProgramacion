package boletin8;

import java.util.Scanner;

public class Areas {
    Scanner scaner = new Scanner(System.in);
    public static final double PI = 3.14;
    public void areaCuadrado(){
        System.out.println("Introduzca tamaño del lado: ");
        float lado = scaner.nextFloat();
        
        double resultado = Math.pow(lado, 2);
        System.out.println("El área del cuadrado será: "+resultado);
    }
    public void areaTriangulo(){
        System.out.println("Introduzca tamaño de base: ");
        float base = scaner.nextFloat();
        
        System.out.println("Introduzca tamaño de la altura: ");
        float altura = scaner.nextFloat();
        
        float resultado = (base * altura)/2;
        System.out.println("El área del triangulo será: "+resultado);
    }    
    public void areaCirculo(){
        System.out.println("Introduzca tamaño del radio: ");
        float radio = scaner.nextFloat();
                
        double resultado = PI * Math.pow(radio, 2);
        System.out.println("El área del círculo será: "+resultado);
    }
}
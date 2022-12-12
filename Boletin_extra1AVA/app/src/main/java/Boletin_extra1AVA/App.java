package Boletin_extra1AVA;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        float base, porcentaje, total;
        int iva;
        Scanner obxScanner = new Scanner (System.in);
        System.out.print("Escribe el precio: ");
        base = obxScanner.nextFloat();
        
        System.out.print("Escribe el IVA (valor entero): ");
        iva = obxScanner.nextInt();
        
        porcentaje = base*((float)iva/100);
        total = base + porcentaje;
        
        System.out.print("Pagas: "+total+"€"+" de los cuales "+porcentaje+"€ son de IVA.");
    }
}
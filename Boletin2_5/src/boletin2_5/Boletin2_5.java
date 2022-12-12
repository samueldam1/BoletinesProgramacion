package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {
    public static final int MILLAS=1852;
    public static void main(String[] args) {
        float metros, resultado;
        
        Scanner obxScaner = new Scanner(System.in);
        
        System.out.print("Escriba la distancia en metros: ");
        metros = obxScaner.nextFloat();
        
        resultado=metros*MILLAS;        
        System.out.print(metros+"m son "+resultado+" millas.");        
    }    
}
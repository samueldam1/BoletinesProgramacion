package Boletin3_1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        float precio_pagado, precio_original, descuento;
        Scanner obxScaner = new Scanner(System.in); // Instanciamos un objeto de tipo escaner con "new" para poder recibir inputs por teclado
                
        System.out.print("Escriba el precio que pago: ");
        precio_pagado = obxScaner.nextFloat();
        
        System.out.print("Escriba el precio original: ");
        precio_original = obxScaner.nextFloat();
       
        descuento = 100-(precio_pagado*100)/precio_original;
        
        System.out.print("El descuento es del "+descuento+"%");        
    }
}

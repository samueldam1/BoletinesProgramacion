package Boletin_extra1_2AVA;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        float a, b, c, x, y;
        double resultado_1, resultado_2;
        Scanner Scnr = new Scanner(System.in); 
         System.out.print("Escribe a: ");
         a = Scnr.nextFloat();
         System.out.print("Escribe b: ");
         b = Scnr.nextFloat();
         System.out.print("Escribe c: ");
         c = Scnr.nextFloat();
         System.out.print("Escribe x: ");
         x = Scnr.nextFloat();
        
        resultado_1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        resultado_2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.print("y = "+resultado_1+"\ny = "+resultado_2+"\n(NaN = Not A Number)");
    }      
}
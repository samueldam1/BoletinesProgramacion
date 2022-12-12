package Boletin3_5;
import java.util.Scanner;
public class App {
     public static void main(String[] args) {
        double bruto, liquido;
        float fijo, ventas, km;        
        int dias;
        Scanner obxScaner = new Scanner(System.in); 
        System.out.print("Sueldo fijo: ");
        fijo = obxScaner.nextFloat();
        System.out.print("Comision: ");
        ventas = obxScaner.nextFloat();
        System.out.print("Kilometros: ");
        km = obxScaner.nextFloat();
        System.out.print("Dias: ");
        dias = obxScaner.nextInt();   
        
        bruto = fijo+km*2+30*dias+ventas*0.05;  
        liquido = (bruto-(bruto*0.18)- 36);        
        System.out.print("Bruto: "+bruto+
                "\nLiquido: "+liquido); 
    }
}
package Boletin3_3;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int billetes_100, billetes_20, billetes_5, monedas_1, resultado;
        Scanner obxScaner = new Scanner(System.in);                
        System.out.print("Escriba cuantos billetes de 100: ");
        billetes_100 = obxScaner.nextInt();        
        System.out.print("Escriba cuantos billetes de 20: ");
        billetes_20 = obxScaner.nextInt();       
        System.out.print("Escriba cuantos billetes de 5: ");
        billetes_5 = obxScaner.nextInt();
        System.out.print("Escriba cuantas monedas de 1: ");
        monedas_1 = obxScaner.nextInt();
        resultado = 100*billetes_100+20*billetes_20+5*billetes_5+monedas_1;        
        System.out.print("Todo esto suma "+resultado+"€");        
    }
}
package Boletin3_4;
import java.util.Scanner;
public class App {
     public static void main(String[] args) {
         int billetes_100, billetes_20, billetes_5, monedas_1, cantidad;
        Scanner obxScaner = new Scanner(System.in);                
        System.out.print("Escriba la cantidad: ");
        cantidad = obxScaner.nextInt();        
        billetes_100 = cantidad/100;
        cantidad = cantidad - billetes_100*100;
        // cantidad = cantidad%100
        billetes_20 = cantidad/20;
        cantidad = cantidad - billetes_20*20;
        billetes_5 = cantidad/5;
        cantidad = cantidad - billetes_5*5;
        monedas_1 = cantidad;                       
        System.out.print(billetes_100+" billetes de 100\n"+
                billetes_20+" billetes de 20\n"+
                billetes_5+" billetes de 5\n"+
                monedas_1+" monedas de 1 "); 
    }
}
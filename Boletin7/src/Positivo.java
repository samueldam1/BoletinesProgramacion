
import java.util.Scanner;

public class Positivo {    
    public void Positivo(){    
    // Ejercicio 1
    Scanner scaner = new Scanner(System.in);   
    System.out.print("Escribe un número: ");
        double numero = scaner.nextDouble();
        
    if(numero>0)
            System.out.println(numero+ " es positivo.");
    }        
}
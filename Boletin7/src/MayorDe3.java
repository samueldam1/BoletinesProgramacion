
import java.util.Scanner;

public class MayorDe3 {
    public void MayorDe3(){
        // Ejercicio 5
        Scanner scaner = new Scanner(System.in); 
        System.out.println("Escribe 3 números: ");
        float num1 = scaner.nextFloat();
        float num2 = scaner.nextFloat();
        float num3 = scaner.nextFloat();
        
        if(num1>num2){
            if(num1>num3)
                System.out.println("El más grande es "+num1);
            else
                System.out.println("El más grande es el "+num3);
            }
        else {
            if(num2>num3)
                System.out.println("El más grande es el "+num2);
            else
                System.out.println("El más grande es el "+num3);
            }         
        }
}
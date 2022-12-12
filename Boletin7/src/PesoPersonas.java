
import java.util.Scanner;

public class PesoPersonas {
    public void PesoPersonas(){
        // Ejercicio 4
        Scanner scaner = new Scanner(System.in); 
        System.out.println("Escribe el nombre de una persona y su peso.");
        String pers1 = scaner.next();
        float peso1 = scaner.nextFloat();
        
        System.out.println("Otra.");
        String pers2 = scaner.next();
        float peso2 = scaner.nextFloat();
        
        if (peso1>peso2){
            System.out.println(pers1+" pesa más que "+pers2);
            float diff = peso1 - peso2;
            System.out.println("La diferencia es de "+diff+"kg");
        }
        else{
            System.out.println(pers2+" pesa más que "+pers1);
            float diff = peso2 - peso1;
            System.out.println("La diferencia es de "+diff+"kg");
        }
    }
}
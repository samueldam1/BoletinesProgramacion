
import java.util.Scanner;

public class MayorMenor {
    // Ejercicio 2
    private short resta;
    private short suma;
    
    public void sumaResta(){
        Scanner scaner = new Scanner(System.in);
        System.out.print("Escribe 2 números para operar:\n1º: ");        
            short num1 = scaner.nextShort();
        System.out.print("2º: ");
            short num2 = scaner.nextShort();
            
        if(num1>=num2){
            resta = (short) (num1-num2);
            System.out.println(num1+" - "+num2+"= "+resta);   
        }
        else
            suma = (short) (num1+num2);        
            System.out.println(num1+" + "+num2+"= "+suma);
        
    }
}
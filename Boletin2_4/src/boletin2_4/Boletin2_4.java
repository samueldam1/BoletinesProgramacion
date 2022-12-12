package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {
    public static void main(String[] args) {        
        float num1, num2, suma, resta, producto, cociente;        
        Scanner obxScaner = new Scanner(System.in); // Instanciamos un objeto de tipo escaner con "new" para poder recibir inputs por teclado
                
        System.out.print("Escribe el primer número: ");
        num1 = obxScaner.nextFloat();
        System.out.print("Escribe el segundo número: ");
        num2 = obxScaner.nextFloat();
            suma = num1 + num2;
            resta = num1 - num2;
            producto = num1 * num2;
            cociente = num1 / num2;
        System.out.print("\n"+num1+" + "+num2+" = "+suma+"\n"+num1+" - "+num2+" = "+resta+"\n"+num1+" * "+num2+" = "+producto+"\n"+num1+" / "+num2+" = "+cociente+"\n\n");
    }    
}
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {        
        float euro, valor_dolar, cambio;        
        //Solo una vez
        Scanner obxScaner = new Scanner(System.in); // Instanciamos un objeto de tipo escaner con "new" para poder recibir inputs por teclado
                
        System.out.print("Escriba los euros a cambiar: ");
        euro = obxScaner.nextFloat();
        
        System.out.print("Escriba a cuanto está el valor del dólar (EJ: 0,98): ");
        valor_dolar = obxScaner.nextFloat();
       
        cambio = euro*valor_dolar;
        System.out.print(euro+"€ son "+cambio+"$");
    }    
}
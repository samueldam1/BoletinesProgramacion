package Boletin3_2;

import java.util.Scanner;

public class App {
     public static final double F=32, K=273.15;
    public static void main(String[] args) {
        double temp_f, temp_k;
        Scanner obxScaner = new Scanner(System.in);
                
        System.out.print("Escriba la temperatura: ");
        float temp = obxScaner.nextFloat();
        temp_f = temp * 1.8 + F;
        temp_k = temp + K;
        System.out.print(temp+"º C\n"+temp_f+"º Fahrenheit\n"+temp_k+"º Kelvin");
    }
}
import java.util.Scanner;

public class Grados {
    private double celsius;
    private double fahrenheit;
    private double kelvin;
    Scanner obx = new Scanner(System.in);
    
    public void Grados(){
        System.out.println("Introduzca el precio regular: ");
        celsius = obx.nextDouble();
        
        fahrenheit = (celsius * 1.8)+32;
        kelvin =  kelvin + 273.15;
        
        System.out.println("En Fahrenheit son: "+fahrenheit+
                "\nEn Kelvin son: "+kelvin);
        
    }
}
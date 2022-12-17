
import java.util.Scanner;

public class Dinero {
    private int cant;
    private int cant_100;
    private int cant_20;
    private int cant_5;
    
    Scanner obx = new Scanner(System.in);    
    
    public void Dinero(){
        System.out.println("Introduzca cantidad de billetes de 100:");
        cant_100 = 100*obx.nextInt();
        System.out.println("Introduzca cantidad de billetes de 20:");
        cant_20 = 20*obx.nextInt();
        System.out.println("Introduzca cantidad de billetes de 5:");
        cant_5 = 5*obx.nextInt();
        System.out.println("Introduzca cantidad de monedas:");
        cant = obx.nextInt();
        cant = cant_100 + cant_20 + cant_5 + cant;
        System.out.println(cant);
    
    }
    
}

import java.util.Scanner;

public class Cambio {
    
    private int cant;
    private int cant_100;
    private int cant_20;
    private int cant_5;
    
    Scanner obx = new Scanner(System.in);
    
    public void Cambio(){
        System.out.println("Escribe una candidad de dinero:");
        cant= obx.nextInt();
        
        cant_100 = cant/100;
        cant = cant - cant_100*100;
        
        cant_20 = cant/20;
        cant = cant - cant_20*20;
        
        cant_5 = cant/5;
        cant = cant - cant_5*5;
        
        System.out.println(cant_100+" billetes de 100\n"
                + cant_20 +" billetes de 20\n"
                + cant_5 +" billetes de 5\n"
                + cant+ " monedas de 1");
        
    }   
}
 
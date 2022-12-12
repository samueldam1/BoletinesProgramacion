
import java.util.Scanner;

public class SignoMasMenos {
    public void SignoMasMenos(){
        // Ejercicio 3
        Scanner scaner = new Scanner(System.in); 
        System.out.print("Escribe un número para determinar si es mayor, menor o 0: ");
        short num = scaner.nextShort();
        
        if(num>=0){
            if (num==0)
                System.out.println("0");
            else
                System.out.println("+");
        }
        else 
            System.out.println("-");
    }
}
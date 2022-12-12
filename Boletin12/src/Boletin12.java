
import java.util.Scanner;

public class Boletin12 {
    public void juegoNum(){
        int i, j, num, intento, cont;
        while(0<1){    
            System.out.println("Fija el número a adivinar");
            num = pedirInt();
            System.out.println("Fija el número de intentos: ");
            j = pedirInt();
            for(i=0;i<j;i++){
                intento = pedirInt();
                if(intento<num)
                    System.out.println("El numero es mayor. ");
                else if(intento>num)
                    System.out.println("El número es menor.");
                else{
                    System.out.println("Lo adivinaste!");
                    break;
                }
            }
            
            if(i!=j)
                System.out.println("Enhorabuena! Te tomó: "+i+"intentos"+"\nContinuar? Si:1 No:0");
            else
                System.out.println("Se acabaron los intentos.\nContinuar? Si:1 No:0");
            
            cont = pedirInt();
            if (cont==0)
                break;
        }
    }
    public void juegoNum2(){
        int i, intento, dist;
        int num = randomInt(0,100);
        System.out.println("Adivina un número en 0 y 100. Tienes 10 intentos.");            
            for(i=0;i<10;i++){
                intento = pedirInt();
                
                if(num>intento)
                    dist = num - intento;
                else
                    dist = intento - num;
                //System.out.println(intento+" - "+num +" = "+dist);
                if(dist>20)
                    System.out.println("Muy lejos.");                                    
                else if(dist<=20 && dist>=10)
                        System.out.println("Lejos.");
                    else if(dist<10 && dist>5)
                            System.out.println("Cerca.");
                        else if(dist<=5 && dist>0)
                                System.out.println("Muy cerca");
                            else{
                                System.out.println("Lo adivinaste!");
                                break;
                            }
            }
            if(i==10)
                System.out.println("GAME OVER");
            
            System.out.println("El numero era: "+num);
    }
    public int pedirInt(){
        Scanner sc = new Scanner(System.in);
            return sc.nextInt();
    }
    private static int randomInt(int min, int max) {	
		int random = (int)(Math.random()*max+min); 
		return random;	
	}
}
import java.util.Scanner;

public class Boletin11 {
    public void cantPosNeg(){
        int neg, pos, cero, num;
        neg = pos = cero = num = 0;
        for(int i=0;i<10;i++){
            System.out.println("Introduzca un numero: ");
            num = pedirInt();
            if(num<0)
                neg++;
            else if(num>0)
                    pos++;
                else
                    cero++;                
        }
        System.out.println("Positivos: "+pos+
                ". Negativos: "+neg+". Ceros: "+cero);
    }
    public void sumaProducto(){
        double producto = 1;
        int suma = 0;
        int i;
        for(i=10;i<=90;i++){
            suma = suma + i;
            producto = producto * i;
        }
        System.out.println("El resultado de la suma es: "+suma+
                "\nEl resultado del producto es: "+producto);
    }
    public void areaRectangulo(){
        int base, altura;
        do{
            System.out.println("Introduzca la base(valores positivos): ");
            base = pedirInt();
            System.out.println("Introduzca la altura(valores positivos): ");
            altura = pedirInt();
        }while(base<=0||altura<=0);
        int area = base * altura;
        System.out.println("El área es: "+area);        
    }
    public void tablaNum(){
        int i, resultado;
        System.out.println("Introduzca un número: ");
        int num = pedirInt();
        for(i=0;i<=10;i++){
            if(num!=0){
            resultado =  num * i;
            System.out.println(num+" x "+i+" = "+resultado);
            }
            else{
                System.out.println("Número distinto de 0.");
                break;
            }
        }
    }
    public void sueldo(){
        int i, sueldo, cant, min, total, porcentaje;
        cant = min = total = porcentaje = 0;
        while(0<1){
            do{
                System.out.println("Introduzca el sueldo: ");
                sueldo = pedirInt();
            }while(sueldo<0);
            
            if(sueldo==0){
                porcentaje = (min/total)*100;
                System.out.println(min+" "+total);
                break;
            }   
            
            if(sueldo>=1000&sueldo<=1750)
                cant++;
            else{
                if(sueldo<1000){
                    min++;                    
                }      
            }            
            total++;            
        }
        System.out.println("Sueldos entre 1000 y 1750: "+cant+"\nMenos de 1000: "+porcentaje+"%"+
                "\nTotal: "+total);
    }
    public static int pedirInt(){
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
    }
}
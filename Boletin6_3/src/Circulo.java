// Boletin 6_3
public class Circulo {
    // atributos
    private double radio;
    public static final double Pi = 3.14;
    
    // metodos
    public Circulo(){        
    }   
    
    public Circulo (double r){
        radio = r;
    }
    
    public double calcularArea(){
        return (Pi*Math.pow(radio, 2));
    }
    
    public double calcularLonxitude(){
        return (radio*2*Pi);
    }
}
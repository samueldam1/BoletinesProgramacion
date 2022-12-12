// Boletin 6_1
public class Coche {
    private int velocidade;

    public Coche(){
        velocidade = 0;
        // Java por defecto pone los valores numericos a 0 de todas formas
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void acelerar(int valor){
        velocidade = velocidade + valor;
    }
    public void frenar(int menos){
        velocidade = velocidade - menos;
    }    
}
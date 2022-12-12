// Boletin 6_2
public class Satelite{
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public Satelite(){
        meridiano = paralelo = distanciaTerra = 0;
    }

    public Satelite (double m, double p, double d){
        meridiano = m ;
        paralelo = p;
        distanciaTerra = d;
    }
    public String verPosicion( ){
        return("O satelite atopase no paralelo " + paralelo + "meridiano " + 
        meridiano + " e a unha distancia da terra de " + distanciaTerra);
    }
}
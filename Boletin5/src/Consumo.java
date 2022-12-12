public class Consumo {
    private int km; // Total km recorridos
    private int litros; // Total litros consumidos
    private float vMed; // Velocidad media
    private float pGas; // Precio de la gasolina
    
    // Constructor sin parámetros
    public Consumo(){
    }   
    // Constructor con parámetros
    public Consumo (int km, int litros, float vMed, float pGas){
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;        
    }    
    public float getTempo(){
        return (vMed*km);
    }
    public float consumoMedio(){
        return (litros * 100)/km;
    }
    public float consumoEuros(){
        return ((litros * 100 ) /km)*pGas;
    }
    public void setKms(int km){
        this.km = km;
    }
    public void setLitros(int litros){
        this.litros = litros;
    }
    public void setvMed(int vMed){
        this.vMed = vMed;
    }
    public void setPGas(float pGas){
        this.pGas=pGas;
    }
    public float getVMed(){
        return vMed;
    }
}
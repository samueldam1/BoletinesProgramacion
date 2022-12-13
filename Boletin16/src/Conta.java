import com.samu.packages.*;

public class Conta {
    private long numeroConta;
    private double saldo;
    private Persoa cliente;

    public Conta(long numeroConta, double saldo, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Conta() {
    }
    
    public void Ingresar(double cantidad){
        saldo=saldo+cantidad;
                
    }
    public void Retirar(double cantidad){
       if (saldo>0)
           saldo=saldo-cantidad;
       else
            System.out.println("No hay saldo disponible.");
    }
    
    public void ActualizarSaldo(){
        System.out.println(saldo);
    }
    
    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Persoa getCliente() {
        return cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
}
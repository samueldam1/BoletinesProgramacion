import com.samu.packages.*;
import javax.swing.JOptionPane;

public class Conta {
    private long numeroConta;
    private double saldo;
    private Persoa cliente;
    
    private double cantidad;
    
    public Conta(long numeroConta, double saldo, Persoa cliente){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Conta(){
    }
    
    public void Ingresar(){
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad a ingresar."));
        saldo=saldo+cantidad;
                
    }
    public void Retirar(){
       if (saldo>0){
           cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad a retirar."));
           saldo=saldo-cantidad;}
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
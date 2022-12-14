
import com.samu.packages.*;
import javax.swing.JOptionPane;



public class CuentaAforro extends Conta {
    private double interesVariable;
    private double saldoMinimo;
    
    public CuentaAforro(double interesVariable, double saldoMinimo, long numeroConta, double saldo, Persoa cliente){
        super(numeroConta, saldo, cliente);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }
    
    public double cambiarInteres(String mensaje){
        interesVariable = Double.parseDouble(JOptionPane.showInputDialog("Cambiar interes."));
        return interesVariable;            
    }
}

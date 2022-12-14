
import com.samu.packages.*;


public class CuentaCorriente extends Conta {

    private static final double INTERES_FIJO = 0.985;

    public CuentaCorriente(long numeroConta, double saldo, Persoa cliente) {
        super(numeroConta, saldo, cliente);
        super.setSaldo(saldo * INTERES_FIJO);
    }

}

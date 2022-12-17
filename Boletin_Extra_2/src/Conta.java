import java.util.Scanner;

public class Conta {
    private String nombreCliente;
    private String numConta;
    private double interes;
    private double saldo;
    
    private String cuentaDestino;
    private double importe;
    
    Scanner scnr = new Scanner(System.in);
    
    public void Conta(){
    }

    public void Conta(String nombreCliente, String numConta, double interes, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numConta = numConta;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    public void Ingreso(){
        int ingreso;
        do{
            System.out.println("Introduzca cantidad a ingresar:");    
            ingreso = scnr.nextInt();
        }while(ingreso < 0);
        saldo = saldo + ingreso;        
    } 
    
    public void Reintegro(){
        int reintegro;
        do{
            System.out.println("Introducir cantidad a retirar:");   
            reintegro = scnr.nextInt();
        }while(reintegro < 0);
        saldo = saldo + reintegro;  
    }
    
    public void Transferencia (String cuentaDestino, double importe){
        saldo = saldo - importe;
    } 
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}

package com.samu.partes;

import java.util.Scanner;

public class Teclado {
    private String marca;
    
    Scanner scnr = new Scanner(System.in);
    
    // construcor default
    public Teclado(){        
    }
    // constructor
    public Teclado(String marca){        
        this.marca = marca;
    }        
    // setter
    public void setMarca(String pulgadas){
        this.marca = scnr.next();
    }
    // getter
    public String getMarca(){
        return marca;
    }
    // toString
    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + '}';
    }    
}
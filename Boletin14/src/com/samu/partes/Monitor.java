package com.samu.partes;

import java.util.Scanner;

public class Monitor {
    private float pulgadas;
    
    Scanner scnr = new Scanner(System.in);
    
    // construcor default
    public Monitor(){        
    }
    // constructor
    public Monitor(float pulgadas){        
        this.pulgadas = pulgadas;
    }        
    // setter
    public void setPulgadas(String pulgadas){
        this.pulgadas = scnr.nextFloat();
    }
    // getter
    public float getPulgadas(){
        return pulgadas;
    }
    // toString
    @Override
    public String toString() {
        return "Monitor{" + "pulgadas=" + pulgadas + '}';
    }    
}
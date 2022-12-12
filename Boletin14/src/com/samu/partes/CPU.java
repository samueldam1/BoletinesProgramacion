package com.samu.partes;

import java.util.Scanner;

public class CPU {
    private int velocidad;
    
    Scanner scnr = new Scanner(System.in);
    
    // construcor default
    public CPU(){        
    }
    // constructor
    public CPU(int velocidad){        
        this.velocidad = velocidad;
    }        
    // setter
    public void setVelocidad(String pulgadas){
        this.velocidad = scnr.nextInt();
    }
    // getter
    public float getVelocidad(){
        return velocidad;
    }
    // toString
    @Override
    public String toString() {
        return "CPU(" + "velocidad=" + velocidad + ')';
    }    
}
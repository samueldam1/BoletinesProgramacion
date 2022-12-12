package Boletin14;

import com.samu.partes.*;

public class Ordenador {
        private Monitor mo;
        private Teclado te;
        private CPU pro;
        private float precio;

    
    public Ordenador(){
    }

    public Ordenador(Monitor mo, Teclado te, CPU pro, float precio) {
        this.mo = mo;
        this.te = te;
        this.pro = pro;
        this.precio = precio;
    }
    
    /*public Ordenador(String pulgadas, String marca, String velocidad, float precio) {
        mo.setPulgadas(pulgadas);
        te.setMarca(marca);
        pro.setVelocidad(velocidad);
        this.precio = precio;
    }*/
    // setters y getters
    public Monitor getMo() {
        return mo;
    }

    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    public Teclado getTe() {
        return te;
    }

    public void setTe(Teclado te) {
        this.te = te;
    }

    public CPU getPro() {
        return pro;
    }

    public void setPro(CPU pro) {
        this.pro = pro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    // toString
    @Override
    public String toString() {
        return "Ordenador{" + "mo=" + mo + ", te=" + te + ", pro=" + pro + ", precio=" + precio + '}';
    }         
}
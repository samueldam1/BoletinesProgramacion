package Boletin14;

import com.samu.partes.*;

public class Main {

    public static void main(String[] args) {
        Monitor mo = new Monitor((float)27.6);
        Teclado te = new Teclado("Logitech");
        CPU pro = new CPU(6);
        
        Ordenador obx = new Ordenador(mo, te, pro, 1);
        System.out.println(obx.toString());
        
        /*
        Ordenador obx1 = new Ordenador();
        obx1.setPrecio(2);
        
        Ordenador obx2 = new Ordenador();        
        obx2.getTe().getMarca();
        
        Ordenador obx3 = new Ordenador();
        obx3.getPro();*/
    }   
}
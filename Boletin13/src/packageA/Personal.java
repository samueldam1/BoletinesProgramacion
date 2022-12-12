package packageA;

import java.util.Scanner;


public class Personal {
    public String telefono;
    public String correo;
    
    public Personal(String telefono, String correo){
    }
    
    public void setDatos(){
        Scanner scnr = new Scanner(System.in);
        telefono = scnr.next();
        correo = scnr.next();
    }
    public void verDatos(){
        System.out.println(telefono + correo);
    }
}
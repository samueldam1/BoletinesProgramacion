import packageA.Personal;
import java.util.Scanner;

public class Academica {
    static int numReferencia = 2018;
    private String nombre;
    private float nota;
    private Personal alum;
    
    Scanner scnr = new Scanner(System.in);
    
    public void numReferencia(){
        numReferencia++;
    }
    
    public Academica(String Nombre, float Nota, Personal alum){
        Academica.numReferencia++;
        this.nombre = Nombre;
        this.nota = Nota;
        this.alum = alum;
    }
    // retorna una frase
    public String toString(){
        return "Nombre: "+ nombre + ", nota: " + nota + alum;
    }
    // setters
    public void setNumReferencia(){
        this.numReferencia = scnr.nextInt();
    }
    public void setNombre(){
        this.nombre = scnr.next();
    }
    public void setNota(){
        this.nota = scnr.nextInt();
    }
    // getters      
    public static int getNumReferencia(){
        return numReferencia;
    }    
    public String getNombre(){
        return nombre;
    }
    public float getNota(){
        return nota;
    }
    public Personal getAlum(){
        return alum;
    }
    // validar nota
    public float alidarNota(){
        do {
            System.out.println("Introducir nota del 0 al 10");
            nota = scnr.nextInt();
        }while(nota>=0&&nota<=10);
        return nota;
    }
}
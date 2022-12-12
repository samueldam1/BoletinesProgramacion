
import packageA.Personal;

public class Main {

    public static void main(String[] args) {
        Personal per = new Personal("1","a");
        Academica acd = new Academica("aa",1,per);
        System.out.println(acd.toString());
        
        
        
    }    
}
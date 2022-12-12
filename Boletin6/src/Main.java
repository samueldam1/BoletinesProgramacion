// Boletin 6_1
public class Main {
    public static void main(String[] args) {
        Coche coc1 = new Coche();
        System.out.println(coc1.getVelocidade());
        coc1.acelerar(5);
        System.out.println(coc1.getVelocidade());
        coc1.frenar(4);
        System.out.println(coc1.getVelocidade());
    }   
}
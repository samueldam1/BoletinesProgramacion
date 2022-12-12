public class Main {
    public static void main(String[] args) {
        // 1
        Consumo con1 = new Consumo ();
        // 2
        con1.setLitros(50);
        con1.setPGas((float)1.57);
        // 3
        Consumo con2 = new Consumo (1, 20, 5, (float)2.05);
        // 4
        System.out.println(con2.consumoMedio());
        // 5
        con2.setLitros(30);
        // 6
        System.out.println(con2.getVMed()+"km/h");
    }
}
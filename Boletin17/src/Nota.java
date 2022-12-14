
import javax.swing.JOptionPane;


public class Nota {
    private float nota_escrita_1;
    private float nota_escrita_2;
    private float nota_practica;
    private int num_boletin;
    private final static int BOLETINES = 17;
  
    private int nota_boletines;
    private String x;
    
    public Nota(){
    }
    
    public Nota(float nota_escrita_1, float nota_escrita_2, float nota_practica, int num_boletin) {
        this.nota_escrita_1 = nota_escrita_1;
        this.nota_escrita_2 = nota_escrita_2;
        this.nota_practica = nota_practica;
        this.num_boletin = num_boletin;
    }
    
    public void Calculo(){
        //x.equals("no")
        //x.equalsIgnoreCase("no")
        while (!"no".equalsIgnoreCase(x)){
        
            nota_escrita_1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del primer examen teórico."));
            nota_escrita_2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del segundo examen teórico"));
            nota_practica = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del examen práctico."));
            num_boletin = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de boletines hechos."));

            float escrita = ((nota_escrita_1 + nota_escrita_2)/2) * (float)0.4;
            float practica = nota_practica * (float)0.4;

            float porcentaje = (float)num_boletin/BOLETINES;
            if (porcentaje > 0.9)
                nota_boletines = 2;
            else if(porcentaje >= 0.7 && porcentaje <= 0.9)
                nota_boletines = 1;
            else if (porcentaje < 0.7)
                nota_boletines = 0;

            float total = escrita + practica + nota_boletines;
            JOptionPane.showMessageDialog(null,"PROBAS TEORICAS....."+escrita
                    +"\nPROBAS PRÁCTICAS....."+practica
                    +"\nBOLETÍNS....."+nota_boletines
                    +"\nNOTA TOTAL....."+total);
            x = JOptionPane.showInputDialog("Deseas calcular otra nota?");        
        }
    }
    
}
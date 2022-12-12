public class Main {    
    public static void main (String args[]){        
        Libro lib1 = new Libro ("a","a",12,(short)1);
        System.out.println(lib1.amosar());
        Libro lib2 = new Libro();
        lib2.setAutor("Hey");
        lib2.setTitulo("Titulo");
        lib2.setAno(2);
        lib2.setPaginas((short)2);
         System.out.println(lib2.amosar());
    }
}
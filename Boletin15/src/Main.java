public class Main {

    public static void main(String[] args) {
        Pelicula  pel = new Pelicula("ActorPrincipal","ActrizPrincipal","Titulo","Autor","Formato","Duración");
        Disco dis= new Disco("Género","Titulo","Autor","Formato","Duración");
        
        System.out.println(pel.toString());
        System.out.println(dis.toString());
    }
}
public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula() {
    }   

    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, String formato, String duración) {
        super(titulo, autor, formato, duración);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + '}';
    }
    
    
}
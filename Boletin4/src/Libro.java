public class Libro {
    
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;         
    private float valoracion;
    
    //constructor sin valores
    public Libro(){    
    }
    // constructor que permite dar valores
    public Libro(String titulo, String autor, int ano, short numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }    
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }    
    public void setPaginas(short numPaginas){
        this.numPaginas = numPaginas;
    }    
    public short getPaginas(){
        return numPaginas;
    }
    public void setValoracion(float valoracion){
        this.valoracion = valoracion;
    }
    public String amosar(){        
        return "Titulo: "+titulo+
                "\nAutor: "+autor+
                "\nAño: "+ano+
                "\nNúmero de páginas: "+numPaginas+
                "\nValorancion: "+valoracion;
    }
}
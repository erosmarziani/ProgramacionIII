public class Novela extends Libro{
    private String genero;

    public Novela(){
        super();
        this.genero = "";

    }

    public Novela(String titulo, String autor,double precio, String genero) {
        super(titulo,autor,precio);
        this.genero = genero;
    }

    public Novela getGenero(String genero){
        this.genero = genero;
        return this;
    }

    public String setGenero(){
        return genero;
    }

    @Override
    public String toString(){
          return super.toString() + ", Genero: " +genero;
    }
}

class Libro{
    private String titulo;
    private String autor;
    private double precio;


    public Libro(String titulo, String autor,double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.precio = 1;
    }
    public void mostrarDatos(){
        System.out.println("El titulo es " + titulo + " del autor " + autor + " y tiene un precio de " + precio);
    }

    public Libro setTitulo(String titulo){
        this.titulo = titulo;
        return this;
    }

    public String titulo(){
        return titulo;
    }

    public Libro setAutor(String autor){
        this.autor = autor;
        return this;
    }

    public String getAutor(){
        return autor;
    }

    public Libro setPrecio(double precio){
        this.precio = precio;
        return this;
    }

    public double getPrecio(){
        return precio;

    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + "Autor: " + autor + "Precio: $" + precio;
    }

}
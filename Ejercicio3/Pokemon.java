import java.sql.Struct;

class Pokemon{
    private String nombre;
    private String color;
    private int potenciaAtaque;
    private int nivelVida;

    public Pokemon(){
        this.nombre = "";
        this.color = "";
        this.potenciaAtaque = 50;
        this.nivelVida = 50;
    }

    public Pokemon(String nombre,String color, int potenciaAtaque, int nivelVida){
        this.nombre = nombre;
        this.color = color;
        this.potenciaAtaque = potenciaAtaque;
        this.nivelVida = nivelVida;
    }


    public Pokemon setNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public String getNombre(){
        return nombre;
    }

    public Pokemon setColor(String color){
        this.color = color;
        return this;
    }

    public String getColor(){
        return color;
    }

    public Pokemon setPotencia(int potenciaAtaque){
        this.potenciaAtaque = potenciaAtaque;
        return this;
    }

    public int getPotencia(){
        return potenciaAtaque;
    }

    public Pokemon setVida(int vida){
        this.nivelVida = vida;
        return this;
    }

    public void saludar(){
        System.out.println("Hola soy " + nombre);
    }

    public void sanar(){
        this.nivelVida = 100;
        System.out.println("Mi nivel de vida ha vuelto a ser de 100");

    }

    public void evolucionar(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
        this.potenciaAtaque = (int) (potenciaAtaque * 1.2);
        
        

    }


}
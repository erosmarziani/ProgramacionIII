class Persona{

    private String name;
    private int altura;


    //Declaro un constructor
    public  Persona(String name, int altura){

        this.name = name;
        this.altura = altura;

    }

    public Persona setName(String name){
        this.name = name;
        return this;
    }

    public String getNombre(){
        return name;
    }

    public Persona setAltura(int altura){
        this.altura = altura;
        return this;
    }

    public int getAltura(){
        return altura;
    }
}

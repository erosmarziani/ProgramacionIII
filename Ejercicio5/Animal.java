public abstract class Animal{
    private String nombre;
    private int edad;
    private String raza;

    public Animal(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;

    }

    public Animal(){
        this.nombre = "";
        this.edad = 0;
        this.raza = "";
    }

    public Animal setNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public String getNombre(){
        return nombre;
    }

    public Animal setEdad(int edad){
        this.edad = edad;
        return this;
    }

    public int getEdad(){
        return edad;

    }

    public Animal setRaza(String raza){
        this.raza = raza;
        return this;
    }

    public String getRaza(){
        return raza;
    }
    
    public abstract void alimentarse();
}
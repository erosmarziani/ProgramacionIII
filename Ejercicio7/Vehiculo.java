 public abstract class Vehiculo{

    private String marca;
    private int modelo;
    private String patente;
    private double precio;

    public Vehiculo(String marca,int modelo, String patente, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.precio = precio;
    }

    public Vehiculo setMarca(String marca){
        this.marca = marca;
        return this;
    }

    public String getMarca(){
        return marca;
    }

    public Vehiculo setModelo(int modelo){
        this.modelo = modelo;
        return this;

    }

    public int getModelo(){
        return modelo;
    }

    public Vehiculo setPatente(String patente){
        this.patente = patente;
        return this;
    }

    public String getPatente(){
        return patente;
    }

    public Vehiculo setPrecio(double precio){
        this.precio = precio;
        return this;
    }

    public double getPrecio(){
        return precio;  
    }

    public  void encender(){
        System.out.println("El vehiculo se ha encendido...");
    }
    public void acelerar(){
        System.out.println("El vehiculo esta acelerando...");
    }

    public void frenar(){
        System.out.println("El vehiculo esta frenando...");
    }
}
public class Motor {
    private String marca;
    private int modelo;
    private int numeroMotor;
    private int km;

    public Motor(String marca, int modelo, int cilindrada, int numeroMotor, int km){
        this.marca = marca;
        this.modelo = modelo;
        this.numeroMotor = numeroMotor;
        this.km = km;

    }
    //Getters y setters
    
    public Motor setMarca(String marca){
        this.marca = marca;
        return this;
    }

    public Motor setModelo(int modelo){
        this.modelo = modelo;
        return this;
    }

    public Motor setNumeroMotor(int numeroMotor){
        this.numeroMotor = numeroMotor;
        return this;
    }

    public Motor setKM(int km){
        this.km = km;
        return this;
    }

    public String getMarca(){
        return marca;
    }

    public int getmodelo(){
        return modelo;
    }

    public int getNumeroMotor(){
        return numeroMotor;
    }

    public int getKM(){
        return km;
    }
}

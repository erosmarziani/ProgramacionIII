public class Moto extends Vehiculo{
    private int cilindrada;


    public Moto(String marca, int modelo,String patente, double precio,int cilindrada){
        super(marca, modelo, marca, precio);
        this.cilindrada = cilindrada;
    }

    public Moto setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
        return this;
    }

    public int getCilindrada(){
        return cilindrada;
    }


    public boolean esGamaAlta(){
        if (cilindrada >= 500){
            return true;
        }else{
            return false;
        }
    }
    
}

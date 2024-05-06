public class InmuebleVivienda extends Inmueble{
    private int numHabitaciones;
    private int numBaños;

    public InmuebleVivienda(String idInmobiliario, String direccion, int m2, int numHabitaciones, int numBaños ){
        super(idInmobiliario, direccion, m2);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }

    public InmuebleVivienda setNumHabitaciones(int numHabitaciones){
        this.numHabitaciones = numHabitaciones;
        return this;
    }

    public InmuebleVivienda setNumBaños(int numBaños){
        this.numBaños = numBaños;
        return this;
    }
    

    public int getNumHabitaciones(){
        return numHabitaciones;
    }

    public int getNumBaños(){
        return numBaños;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de habitaciones: " + numHabitaciones);
        System.out.println("Numero de baños: " + numBaños);
    }
    


    
}

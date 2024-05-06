public class Apartamentos extends InmuebleVivienda{
    private int valorAdministracion;
    private boolean esMonoambiente;

    public Apartamentos(String idInmueble, String direccion, int m2, int numHabitaciones, int numBaños, int valorAdministracion, boolean esMonoambiente){
        super(idInmueble, direccion, m2, numHabitaciones, numBaños);
        this.valorAdministracion = valorAdministracion;
        this.esMonoambiente = esMonoambiente;

    }
    //Getters y setteres
    public Apartamentos setValorAdministracion(int valorAdministracion){
        this.valorAdministracion = valorAdministracion;
        return this;
    }

    public Apartamentos esMonoambiente(boolean esMonoambiente){
        this.esMonoambiente = esMonoambiente;
        return this;
    }

    public int getValorAdministracion(){
        return valorAdministracion;
    }

    public boolean getMonoambiente(){
        return esMonoambiente;
    }

    public int calcularPrecioVenta(){
        return getM2() * ((getMonoambiente() ? 1000000 : 1800000));
        
    }   
    
    // Metodo para imprimir

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo: Departamento " + (esMonoambiente ? "Monoambiente" : "Departamento Familiar"));
        System.out.println("Valor de la admistracion: " + valorAdministracion);
        System.out.println("Valor de venta: $: " + calcularPrecioVenta());
    }
}


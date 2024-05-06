class Casas extends InmuebleVivienda{
    private boolean esConjuntoCerrado;
    private int valorAdministracion;
    private boolean incluyeAreaComun;

    public Casas(String idInmueble,  String direccion ,int m2, int numHabitaciones, int numBaños, boolean esConjuntoCerrado, int valorAdministracion, boolean incluyeAreaComun){
        super(idInmueble,  direccion, m2, numHabitaciones, numBaños);
        this.esConjuntoCerrado = esConjuntoCerrado;
        this.valorAdministracion = valorAdministracion;
        this.incluyeAreaComun = incluyeAreaComun;
        
    }

    public Casas setEsConjuntoCerrado(boolean esConjuntoCerrado){
        this.esConjuntoCerrado = esConjuntoCerrado;
        return this;

    }

    public Casas setValorAdministracion(int valorAdministracion){
        this.valorAdministracion = valorAdministracion;
        return this;
    }

    public Casas setIncluyeAreaComun(boolean incluyeAreaComun){
        this.incluyeAreaComun = incluyeAreaComun;
        return this;
    }

    public boolean getEsConjuntoCerrado(){
        return esConjuntoCerrado;
    }

    public int getValorAdministracion(){
        return valorAdministracion;
    }

    public boolean getIncluyeAreaComun(){
        return incluyeAreaComun;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo: Casa " + (esConjuntoCerrado ? "Conjunto Cerrado" : "Independiente"));
        System.out.println("Valor de la adminstracion: " + valorAdministracion);
        System.out.println("Incluye area comun: " + (incluyeAreaComun ? "Si" : "No"));
        System.out.println("Valor de venta:  $" + calcularPrecioVenta());
    }

    public int calcularPrecioVenta(){
        return getM2() * ((getEsConjuntoCerrado() ? 2500000 : 2000000));

    }
}

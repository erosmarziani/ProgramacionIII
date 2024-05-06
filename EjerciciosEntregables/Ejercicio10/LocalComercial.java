public class LocalComercial extends InmuebleComercial {
    private  boolean localizacion;
    private String centroComercial;

    public LocalComercial(String idInmobiliario, String direccion, int m2, boolean localizacion, String centroComercial){
        super(idInmobiliario, direccion, m2);
        this.localizacion = localizacion;
        this.centroComercial = centroComercial;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo: Local Comercial");
        System.out.println("Localizacion " + (localizacion ? "Interno" : "A la calle"));
        System.out.println("Centro Comercial " + centroComercial);
        System.out.println("Valor de la propiedad: $" + calcularPrecioVenta());
    }

    public LocalComercial setLocalizacion(boolean localizacion){
        this.localizacion = localizacion;
        return this;
    }
    public boolean getLocalizacion(){
        return localizacion;
    }

    public LocalComercial setCentroComercial(String centroComercial){
        this.centroComercial = centroComercial;
        return this;
    }
    public String getCentroComercial(){
        return centroComercial;
    }
    public int calcularPrecioVenta(){
        return getM2() *  3000000;
    }
}


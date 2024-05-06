public class Oficina extends InmuebleComercial {
    public Oficina(String idInmueble, String direccion, int m2){
        super(idInmueble, direccion, m2);

    
    }

    public int calcularPrecioVenta(){
        return getM2() * 2400000;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo: Oficina");
        System.out.println("Precio de venta: $" + calcularPrecioVenta() );
    }
}
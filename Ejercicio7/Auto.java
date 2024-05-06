public class Auto  extends Vehiculo{
    private boolean AireAcondicionadoEstaPrendido;
    
    public Auto(String marca, int modelo, String patente, double precio){
        super(marca,modelo,patente,precio);
    }

    public void encenderAire(){
        if (AireAcondicionadoEstaPrendido) {
            System.out.println("El aire acondicionado se encuentra encendido actualmente ");
        }else{
        AireAcondicionadoEstaPrendido = true;
            System.out.println("Aire acondicionado encendido");
        }

    }

    public void apagarAire(){
        if (!AireAcondicionadoEstaPrendido) {
            System.out.println("El aire acondicionado se encuentra apagado actualmente");
        }else{
            AireAcondicionadoEstaPrendido = false;
            System.out.println("Aire acondicionado apagado");
        }
    }

}

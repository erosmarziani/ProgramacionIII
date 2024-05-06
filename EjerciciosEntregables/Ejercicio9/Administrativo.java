import java.time.LocalDate;

class Administrativo extends Empleado{
    private boolean JornadaCompleta;
    private double sueldoTotal; 

    public Administrativo(String nombre, String dni, String domicilio,LocalDate fechaIngreso, boolean jornadaCompleta){
        super(nombre, dni, domicilio, fechaIngreso, "Administrativo");
        this.JornadaCompleta = jornadaCompleta;
    }

    public double CalcularSueldoTotal(){
        if (JornadaCompleta) {
            this.sueldoTotal = sueldoBasico;
            return sueldoBasico;
        }else{
            this.sueldoTotal = (sueldoBasico/2);
            return sueldoTotal;
        }
    }
    @Override
    public void ImprimirTicket(){
        super.ImprimirTicket();
        System.out.println("Sueldo Total:     " + CalcularSueldoTotal());
        System.out.println("==================================");

    }
}
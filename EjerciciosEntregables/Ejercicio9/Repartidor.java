import java.time.LocalDate;

public class Repartidor extends Empleado{

    private int repartos;
    private double sueldoTotal; 

    public Repartidor(String nombre, String dni, String domicilio,LocalDate fechaIngreso, int cantidadRepartos){
        super(nombre, dni, domicilio, fechaIngreso, "Repartidor");
        this.repartos = cantidadRepartos;
    }

    public int getCantidadRepartos(){
        return repartos;
    }

    public double CalcularSueldoTotal(){
        this.sueldoTotal = sueldoBasico + (repartos * 500);
        return sueldoTotal;
    }
    @Override
    public void ImprimirTicket(){
        super.ImprimirTicket();
        System.out.println("Cantidad de Repartos:     " + repartos);
        System.out.println("Sueldo Total:     " + sueldoTotal);


    }

}
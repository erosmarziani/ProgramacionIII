
import java.time.LocalDate;

public class Empleado {
    private String nombre;
    private String dni;
    private String domicilio;
    private LocalDate fechaIngreso;
    private String categoria;
    protected final double sueldoBasico = 650000;


    public Empleado(String nombre, String dni,String domicilio, LocalDate fechaIngreso, String categoria){
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.fechaIngreso = fechaIngreso;
        this.categoria = categoria; 

    }
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }
   public void ImprimirTicket(){
    System.out.println("==================================");
    System.out.println("         R E C I B O  D E        ");
    System.out.println("            S U E L D O            ");
    System.out.println("==================================");
    System.out.println("Nombre:          " + nombre);
    System.out.println("DNI:             " + dni);
    System.out.println("Domicilio:       " + domicilio);
    System.out.println("Fecha de Ingreso:" + fechaIngreso);
    System.out.println("Categoría:       " + categoria);
    System.out.println("----------------------------------");

    }
    
}


  class Vendedor extends Empleado{
    private int ventasMensuales;
    private double sueldoTotal;

    public Vendedor(String nombre, String dni, String domicilio,LocalDate fechaIngreso,  int ventasMensuales){
        super(nombre, dni, domicilio, fechaIngreso, "Vendedor");
        this.ventasMensuales = ventasMensuales;
    }

    public int getVentasMensuales(){
        return ventasMensuales;
    }

    public double CalcularSueldoTotal(){
        double sueldoTotal = (ventasMensuales * 0.005) + sueldoBasico;
        this.sueldoTotal = sueldoTotal;
        return sueldoTotal;
    }

    @Override
    public void ImprimirTicket(){
        super.ImprimirTicket();
        System.out.println("Ventas Mensuales: " + ventasMensuales);
        System.out.println("Sueldo Total:     " + CalcularSueldoTotal());
        System.out.println("==================================");

    }

 

 }
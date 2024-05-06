public class Titular {
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    // Constructor
    public Titular(String DNI, String nombre, String apellido, String telefono, String email) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
    
     public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
}

 class TarjetaDeCredito {
    private String nombreEntidad;
    private String nombreBanco;
    private String numeroTarjeta;
    private double saldoDisponible;
    private Titular datosTitular;

    // Constructor
    public TarjetaDeCredito(String nombreEntidad, String nombreBanco, String numeroTarjeta, double saldoDisponible, Titular datosTitular) {
        this.nombreEntidad = nombreEntidad;
        this.nombreBanco = nombreBanco;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.datosTitular = datosTitular;
    }

     // Getters
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public Titular getDatosTitular() {
        return datosTitular;
    }

    // Setters
    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void setDatosTitular(Titular datosTitular) {
        this.datosTitular = datosTitular;
    }
}


 class Posnet {
    private TarjetaDeCredito tarjeta;
    private double monto;
    private int cuotas;

    // Constructor
    public Posnet(TarjetaDeCredito tarjeta, double monto, int cuotas) {
        this.tarjeta = tarjeta;
        this.monto = monto;
        this.cuotas = cuotas;
    }

    // Método para efectuar el pago
    public String efectuarPago() {
        double totalAPagar = monto * (1 + calcularRecargo());
        if (totalAPagar <= tarjeta.getSaldoDisponible()) {
            tarjeta.setSaldoDisponible(tarjeta.getSaldoDisponible() - totalAPagar);
            return generarTicket();
        } else {
            return null;
        }
    }

    // Método para calcular el recargo por cuotas
    private double calcularRecargo() {
        if (cuotas > 1) {
            return 0.03 * (cuotas - 1);
        } else {
            return 0;
        }
    }

    // Método para generar el ticket de pago
    private String generarTicket() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("Nombre: ").append(tarjeta.getDatosTitular().getNombre()).append(" ").append(tarjeta.getDatosTitular().getApellido()).append("\n");
        ticket.append("Monto total a pagar: ").append(monto * (1 + calcularRecargo())).append("\n");
        ticket.append("Monto de cada cuota: ").append((monto * (1 + calcularRecargo())) / cuotas).append("\n");
        return ticket.toString();
    }
}


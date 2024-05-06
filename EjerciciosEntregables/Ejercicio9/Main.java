import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Vendedor vendedor = new Vendedor("María", "87654321", "Avenida 456", LocalDate.of(2022, 3, 15),  879);
        vendedor.ImprimirTicket();

        Administrativo administrador = new Administrativo("Lorenzo", "44051174","Martin Rodriguez 657 ", LocalDate.of(2019, 12, 1), false);
        administrador.ImprimirTicket();

        Repartidor repartidor = new Repartidor("Lucas", "39875412", "Chile 942", LocalDate.of(2024, 01, 23), 89);
        repartidor.ImprimirTicket();
    }
}
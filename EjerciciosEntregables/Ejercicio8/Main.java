public class Main {
    public static void main(String[] args) {
        // Crear instancia de Titular
        Titular titular = new Titular("93845768", "Juan", "Perez", "29154875663", "juan@yahoo.com");

        // Crear instancia de TarjetaDeCredito
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("Visa", "Banco Credicoop", "1234-5678-9012-3456", 15000, titular);

        // Crear instancia de Posnet y efectuar el pago
        Posnet posnet = new Posnet(tarjeta, 10000, 5);
        String resultadoPago = posnet.efectuarPago();

        // Mostrar el resultado del pago
        if (resultadoPago != null) {
            System.out.println("Pago realizado con éxito:\n" + resultadoPago);
        } else {
            System.out.println("El pago no pudo ser realizado.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Apartamentos apartamento1 = new Apartamentos("12345", "Rodriguez 87", 20,1,1,12000,false);
        apartamento1.imprimir();
        System.out.println();
        Casas casa1 = new Casas("45876","Las Acacias 34",80,3,2,true,109000,true);
        casa1.imprimir();
    }
}

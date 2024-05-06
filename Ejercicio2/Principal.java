public class Principal {
    public static void main(String[] args){

        Superheroe superheroe = new Superheroe("Clark Ken", 195, "Batman", "Super Fuerza");

        System.out.println("Su nombre real es" + superheroe.getNombre());
        System.out.println("Su nombre ficticio es" + superheroe.getNombreFicticio());
        System.out.println("Su altura es " + superheroe.getAltura());
        System.out.println("El tipo de poder es " + superheroe.getTipoPoder());
        
    }
}

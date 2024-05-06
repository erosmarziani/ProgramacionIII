public class Principal {
    public static void main(String[] args) {
        Animal gato =  new Gato("Duko",2,"Callejero") ;
        Animal perro = new Perro("Luna",14,"Siamesa");
        Animal pajaro = new Pajaro("Loco",85,"Carpintero");

        gato.alimentarse();
        perro.alimentarse();
        pajaro.alimentarse();
    }
    
}

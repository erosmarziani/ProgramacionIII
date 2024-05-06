public  class Gato extends Animal{
    private String alimento;
    
    public Gato(String nombre, int edad, String raza){
        super(nombre,edad,raza);
        this.alimento = "Cat Chow";
    }


    @Override
    public void alimentarse(){
        System.out.println("El gato  se alimenta de " + alimento);
    } 
}

public  class Pajaro extends Animal{
    private String alimento;
    
    public Pajaro(String nombre, int edad, String raza){
        super(nombre,edad,raza);
        this.alimento = "Pienzo";
    }


    @Override
    public void alimentarse(){
        System.out.println("El pajaro se alimenta de " + alimento);
    } 
}

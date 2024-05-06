public  class Perro extends Animal{
    private String alimento;

    public Perro(String nombre, int edad, String raza){
        super(nombre,edad,raza);
        this.alimento = "Sabrositos";
    }


    @Override
    public void alimentarse(){
        System.out.println("El perro se alimenta de " + alimento);
    } 
}

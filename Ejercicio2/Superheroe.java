public class Superheroe extends Persona{
    private String nomFicticio;
    private String tipoPoder;

    public  Superheroe(String name, int altura, String nomFicticio, String tipoPoder){
        super(name,altura);
        this.nomFicticio = nomFicticio;
        this.tipoPoder = tipoPoder;

    }

    public Superheroe setNomFicticio(String nombFicticio){
        this.nomFicticio = nombFicticio;
        return this;
    }

    public String getNombreFicticio(){
        return nomFicticio;
    }

    public Superheroe setTipoPoder(String tipoPoder){
        this.tipoPoder = tipoPoder;
        return this;
    }

    public String getTipoPoder(){
        return tipoPoder;
    }

    
}



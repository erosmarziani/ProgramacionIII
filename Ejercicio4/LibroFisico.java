public class LibroFisico extends Libro {

    private boolean tipoTapa;

    public LibroFisico(String titulo, String autor, double precio, boolean tipoTapa){
    super(titulo,autor,precio);
    this.tipoTapa = tipoTapa;

    }

    public LibroFisico getTipoTapa(boolean tipoTapa){
        this.tipoTapa = tipoTapa;
        return this;
    }

    public boolean getTipoTapa(){
        return tipoTapa;
    }

    @Override
    public String toString(){
        String tipo_Tapa = tipoTapa ? "Tapa Dura" : "Tapa Blanda";
        return super.toString() + ", Tipo de Tapa: " + tipo_Tapa;
    }

    
}

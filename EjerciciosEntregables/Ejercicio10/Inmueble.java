public class Inmueble{
    private String idInmobiliario;
    private String direccion;
    private int m2;


     public Inmueble(String idInmobiliario, String direccion, int m2){
        this.idInmobiliario = idInmobiliario;
        this.direccion = direccion;
        this.m2 = m2;
    }

    public Inmueble setidInmobiliario(String idInmobiliario){
        this.idInmobiliario = idInmobiliario;
        return this;
    }

    public Inmueble setDireccion(String direccion){
        this.direccion = direccion;
        return this;
    }

    public Inmueble setM2(int m2){
        this.m2 = m2;
        return this;
    }

    public String getidInmobiliario(){
        return idInmobiliario;
    }


    public String getDireccion(){
        return direccion;
    }

    public int getM2(){
        return m2;
    }

    public void imprimir(){
        System.out.println( "======================");
        System.out.println( "==JAVA PROPIEDADES==");
       System.out.println( "======================");
       System.out.println("id Inmobiliario:" + idInmobiliario);
       System.out.println("Direccion:" + direccion);
       System.out.println("Metros cuadrados:" + m2);
    }

}


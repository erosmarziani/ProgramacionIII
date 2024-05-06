public class Persona {

  public String nombre;

  public String apellido;

  public int dni;

  public String fechaNacimiento;

  public String direccion;

  public int telefono;

  public String email;


  //Contructor vacio
  public Persona(){

  } 

  //Setter para el atributo nombre
  public Persona setNombre(String nombre) {
    this.nombre = nombre;
    return this;
  }
  //Getter para el atributo nombre
  public String getNombre(){
    return nombre;
  }

  //Setter para el atributo apellido
  public Persona setApellido(String apellido){
    this.apellido = apellido;
    return this;
  }
  //Getter para el atributo apellido
  public String getApellido(){
    return apellido;
  }

  //Setter para el atributo dni
  public Persona setDni(int Dni){
    this.dni = Dni;
    return this;
  } 
  //Getter para el atributo dni
  public int getDni(){
    return dni;
  }

  //Setter para el atributo Fecha de Nacimiento
  public Persona setFechaDeNacimiento(String fecha){
    this.fechaNacimiento = fecha;
    return this;
  }
  //Getter para el atributo Fecha De Nacimiento
  public String getFecha(){
    return fechaNacimiento;
  }

  //Setter para el atributo direccion
  public Persona setDireccion(String direccion){
    this.direccion = direccion;
    return this;
  }
  //Getter para el atributo direccion
  public String getDireccion(){
    return direccion;
  }
  //Setter para el atributo telefono
  public Persona setTelefono(int telefono){
    this.telefono = telefono;
    return this;
  }
  //Getter para el atributo telefono
  public int getTelefono(){
    return telefono;
  }

  //Setter para el atributo email
  public Persona setEmail(String email){
    this.email = email;
    return this;
  }
  //Getter para el atributo email
  public String getEmail(){
    return email;
  }

}
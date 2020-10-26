package POO;

public abstract class Mascota {
  // Atributos
  protected String nombre;
  protected String raza;
  protected int edad;

  public Mascota(String nombre, String raza, int edad)
  {
    this.nombre = nombre;
    this.raza = raza;
    this.edad = edad;
  }

  // Metodos
  void comer() // void no va a retornar ningun valor
  {
    System.out.println(this.nombre + " Está comiendo...");
  }

  void dormir()
  {
    System.out.println(this.nombre + " Está durmiendo...");
  }

  void setNombre(String nombre)
  {
    this.nombre = nombre;
  }

  void setRaza(String raza)
  {
    this.raza = raza;
  }

  void setEdad(int edad)
  {
    this.edad = edad;
  }
}

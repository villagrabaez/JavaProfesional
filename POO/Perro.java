package POO;

public class Perro extends Mascota {
  public Perro(String nombre, String raza, int edad)
  {
    super(nombre, raza, edad);
  }

  void ladrar()
  {
    System.out.println(this.nombre + " Está ladrando...");
  }

  @Override
  void dormir()
  {
    super.dormir(); // Super = Clase Padre
    System.out.println("El perro " + this.nombre + " Está durmiendo...");
  }
}

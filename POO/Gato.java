package POO;

public class Gato extends Mascota {
  public Gato(String nombre, String raza, int edad)
  {
    // Sobreescritura de un costructor
    super(nombre, raza, edad);
  }

  void maullar()
  {
    System.out.println(this.nombre + " Está maullando...");
  }

  @Override
  void dormir()
  {
    System.out.println("El gato " + this.nombre + " Está durmiendo...");
  }
}

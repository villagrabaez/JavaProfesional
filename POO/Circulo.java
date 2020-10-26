package POO;

public class Circulo {
  // Static: para acceder al metodo de una clase sin intanciarla a un nuevo objeto.
  public static final float pi = 3.1415926535f; // A la clase
  public float radio = 0f; // Al objeto

  public Circulo(float radio)
  {
    this.radio = radio;
  }

  public static float area(float radio)
  {
    return Circulo.pi * (radio * radio);
  }
}

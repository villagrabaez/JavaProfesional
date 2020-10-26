package POO;

public class Calculadora {
  // Sobre carga de metodos
  public int suma(int valor1, int valor2)
  {
    return valor1 + valor2;
  }


  public int suma(int valor1, int valor2, int valor3)
  {
    return valor1 + valor2 + valor3;
  }

  public float suma(float valor1, float valor2)
  {
    return valor1 + valor2;
  }

  public double suma(double valor1, double valor2)
  {
    return valor1 + valor2;
  }

  // multiples parametros
  public int suma(int... numeros) // int Arreglo
  {
    int suma = 0;
    for ( int numero : numeros ) {
      suma += numero;
    }
    return suma;
  }
}

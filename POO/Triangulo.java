package POO;

public class Triangulo {
  float base, altura;

  float area() // en el metodo se indica el tipo de dato a retornar
  {
    float areaTriangulo = calculoAreaTriangulo(this.base, this.altura);
    return areaTriangulo;
  }

  float calculoAreaTriangulo(float base, float altura)
  {
    return  (base * altura) / 2;
  }
}

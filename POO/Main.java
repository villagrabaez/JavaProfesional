package POO;

public class Main {
  public static void main(String[] args) {

    // Instancia de una clase (Objeto)
    Perro lassie = new Perro("Lassie", "Pastor Aleman", 3);
    lassie.dormir();

    // Imprimir valores de los atributos de la clase
    System.out.println("El nombre es: " + lassie.nombre);
    System.out.println("La raza es: " + lassie.raza);
    System.out.println("La edad es: " + lassie.edad);

    Gato coddy = new Gato("Coddy", "Gatote", 5);
    coddy.maullar();

    System.out.println("El nombre es: " + coddy.nombre);
    System.out.println("La raza es: " + coddy.raza);
    System.out.println("La edad es: " + coddy.edad);

    // Triangulo

    Triangulo triangulo = new Triangulo();
    triangulo.base = 10;
    triangulo.altura = 20;

    float resultado = triangulo.area();
    System.out.println("El area del triangulo es: " + resultado);

    // Usuario
    Usuario usuario = new Usuario("villagrabaez", "admin12345");
    Usuario usuario2 = new Usuario("villagrabaez");
    Usuario usuario3 = new Usuario();
    usuario.saluda();
    usuario2.saluda();
    usuario3.saluda();
    usuario.establecerRol();

    // Calculadora
    Calculadora calculadora = new Calculadora();
    int resultadoSuma = calculadora.suma(5, 5, -10, 2, 5, 8, 10, 200, 300, 455, 466);
    System.out.println("El resultado de la suma: " + resultadoSuma);

    // Circulo
    System.out.println(Circulo.pi);

    // La instancia de una clase tambien puede acceder a los metodos estaticos
    Circulo c = new Circulo(1f);
    System.out.println(c.pi);

    System.out.println(Circulo.area(123f));

    // Principio de sustitucion

  }
}

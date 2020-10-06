package CicloWhile;

public class Main {
  public static void main(String[] args){
    // Ciclo while
    int numero = 0;
    while(numero <= 10) {
      System.out.println("El número es: " + numero);
      numero++;
    }

    int contador = 0;
    int digitos = 123;
    // 100 / 10 = 10
    // 250 / 10 = 25
    while (digitos > 0) {
      digitos = digitos / 10;
      contador++;
    }

    System.out.println("El numero posee: " + contador + " digitos");
  }
}

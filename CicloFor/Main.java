package CicloFor;

public class Main {
  public static void main(String[] args) {
    // Ciclo For
    for(int i = 0; i < 10; i++) {
      System.out.println("El valor de es: " + i);
    }

    // Tabla de multiplicar
    for(int numero = 12, x = 1; x < 11; x++) {
      int resultado = numero * x;
      String mensaje = numero + " x " + x + " = " + resultado;
      System.out.println(mensaje);
    }

    // Imprimir los numeros pares y contar la cantidad de numeros pares que contiene tal numero.
    int cantidadPar = 0;
    for(int numero = 100; numero > 1; numero--) {
      if (numero % 2 == 0) {
        String mensaje = numero + " Es par";
        System.out.println(mensaje);
        cantidadPar++;
      }
    }
    System.out.println("Total de numeros pares: " + cantidadPar);
  }
}

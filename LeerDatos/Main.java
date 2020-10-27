package LeerDatos;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese su nombre: ");
    String nombre = sc.nextLine();

    System.out.println("Hola " + nombre);

    System.out.println("Ingrese su edad: ");
//    int edad = Integer.parseInt(sc.nextLine());
    int edad = sc.nextInt();

    System.out.println("Edad " + edad);

    sc.nextLine();

    System.out.println("¿El curso es de tu agrado? (si/no)");
    boolean gusto = sc.nextLine().equals("si");

    System.out.println("Altura " + gusto);

    //    System.out.println("Ingrese su altura: ");
    //    float altura = sc.nextFloat();
    //
    //    System.out.println("Altura " + altura);

    sc.close();
  }
}

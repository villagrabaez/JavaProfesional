package Interfaces;

public interface InterfaceA {
  public void MostrarMensaje();

  public default void saludo()
  {
    System.out.println("Hola mundo desde una interface");
  }
}

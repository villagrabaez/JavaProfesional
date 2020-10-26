package POO;

public class Usuario {
  /**
   * Modificadores de acceso
   *
   * - default: disponible dentro del paquete
   * - public: disponible para todas las clases del sistema
   * - private:
   * - protected:
   */

  public String username;
  private String password;

  // Constructor
  public Usuario(String username, String password)
  {
    this.username = username;
    this.password = password;
  }

  // Sobrecarga de constructores
  public Usuario()
  {
    this.username = "";
    this.password = "";
  }

  public Usuario(String username)
  {
    this.username = username;
    this.password = "";
  }

  public void saluda()
  {
    System.out.println("Hola, mi username es: "+ this.username + " y mi password es: " + this.getPassword());
  }

  // Setter
  public void setPassword(String password)
  {
    this.password = password;
  }

  // Getter
  public String getPassword()
  {
    return this.password;
  }

  public void establecerRol()
  {
    Administrador admin = new Administrador();
    admin.trabajar();
  }

  // Clases anidadas
  class Administrador {
    public void trabajar()
    {
      System.out.println("El administrador " + username +  " se encuentra tabajando!");
    }
  }
}

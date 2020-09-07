package Operadores;

public class Operadores {
  public static void main(String[] args){

    /**
     *  OPERADORES ARITMETICOS
     *  +
     *  -
     *  /
     *  *
     *  %
     */

    int x = 4, y = 2;

    // Suma

    int suma = x + y;
    System.out.println("La suma es: " + suma);

    // Resta

    int resta = x - y;
    System.out.println("La resta es: " + resta);

    // Multiplicación

    int multiplicacion = x * y;
    System.out.println("La multiplicacion es: " + multiplicacion);

    // División

    int division = 2 / 2;
    System.out.println("La división es: " + division);

    // Modulo

    int modulo = 2 % 2;
    System.out.println("El resto es: " + modulo);

    /**
     * CASTING
     */

    float z = 5.8f;
    int resultadoInt = x + (int)z; // casting: cambiar el tipo de dato de la variable
    System.out.println("Suma con casting: " + resultadoInt);

    float f = 10.2f;
    float resultadoFloat = (float)x + f;
    System.out.println("Suma con casting: " + resultadoFloat);

    /**
     * OPERADORES RELACIONALES
     *  >
     *  <
     *  >=
     *  <=
     *  ==
     *  !=
     */

    int var1 = 2, var2 = 5;
    boolean resultadoBoolean;

    resultadoBoolean = var1 > var2;
    System.out.println(resultadoBoolean);

    resultadoBoolean = var1 < var2;
    System.out.println(resultadoBoolean);

    resultadoBoolean = var1 >= var2;
    System.out.println(resultadoBoolean);

    resultadoBoolean = var1 <= var2;
    System.out.println(resultadoBoolean);

    resultadoBoolean = var1 == var2;
    System.out.println(resultadoBoolean);

    resultadoBoolean = var1 != var2;
    System.out.println(resultadoBoolean);

    /**
     * OPERADORES LOGICOS
     *
     * AND &&
     * OR ||
     * NOT !
     */

    boolean resultadoLogico;

    resultadoLogico = x >= y && true;
    System.out.println(resultadoLogico);

    resultadoLogico = x >= y || true;
    System.out.println(resultadoLogico);

    resultadoLogico = x >= y && !true;
    System.out.println(resultadoLogico);

    /**
     * OPERADOR TERNARIO
     *
     * IFTTT
     * expresion1 ? expresion2 : expresion3
     */

    int valor1 = 2, valor2 = 4;
    String mensaje;

    mensaje = valor1 > valor2 ? "Valor1 es mayor a valor2" : "Valor2 en mayor al Valor1";
    System.out.println(mensaje);

  }
}

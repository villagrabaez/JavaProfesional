package Arreglos;

public class Main {
    /*
     en Java los arreglos son inmutables, significa que una vez se haya
     definido una longitud, este no puede ser modificado.

     en Java los arreglos inician con el indice 0

     en Java los arreglos pueden ser de muchas dimensiones
    */

    public static void main(String[] args) {
        // Arreglos

        String nombres[];

        nombres = new String[3];

        nombres[0] = "Juan Medina";
        nombres[1] = "Pepe Aguilar";
        nombres[2] = "Pedro Morales";

        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);

        // Otra forma de definir un arreglo en Java

        String ciudades[] = new String[10];

        ciudades[0] = "San Estanislao";
        ciudades[1] = "Guajayvi";
        ciudades[2] = "Concepcion";
        ciudades[3] = "Villarrica";
        ciudades[4] = "Asuncion";
        ciudades[5] = "CDE";
        // reescribir un indice
        ciudades[5] = "Ciudad Del Este";

        System.out.println(ciudades[5]);

        // otra forma diferente de definir arreglos en Java

        String codis[] = { "codi 1", "codi 2", "codi 3" };

        System.out.println(codis[0]);
        System.out.println(codis[1]);
        System.out.println(codis[2]);

        // recorrer un arreglo mediante en ciclo for

        int calificaciones[] = {2, 4, 6, 5, 2, 3, 4, 5, 2, 2, 2, 3, 3, 3, 4, 5, 5};
        float promedio = 0;
        int sumaCalificaciones = 0;
        int contador = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print(calificaciones[i] + " ");
            sumaCalificaciones += calificaciones[i];
            contador++;
        }

        promedio = sumaCalificaciones / contador;
        System.out.println();
        System.out.println("El promedio es: " + promedio);
        System.out.println();
        System.out.println("Cantidad de elementos: " + contador);

        // recorrer arreglos con el ciclo foreach

        int goles[] = {1, 2, 0, 1, 1, 1, 3, 2, 1, 1, 0};
        System.out.println("Goles de un jugador en una temporada");

        // foreach en Java
        for ( int gol : goles ) {
            System.out.println(gol);
        }

        // insertar datos en un arreglo

        int valores[] = new int[10];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = i;
        }

        System.out.println("Valores");

        // foreach
        for ( int valor : valores ) {
            System.out.print(valor);
        }
    }
}

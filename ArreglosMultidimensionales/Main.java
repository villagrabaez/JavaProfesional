package ArreglosMultidimensionales;

public class Main {
    public static void main(String[] args) {
        // Arreglos bidimensionales

        int matriz[][] = new int[4][3]; // filas - columnas

        matriz[0][0] = 1;
        matriz[0][1] = 245;
        matriz[0][2] = 1080;

        matriz[1][0] = 688;
        matriz[1][1] = 19789;
        matriz[1][2] = 2020;

        matriz[2][0] = 200;
        matriz[2][1] = 234;
        matriz[2][2] = 345;

        matriz[3][0] = 123;
        matriz[3][1] = 322;
        matriz[3][2] = 123;

        System.out.println(matriz[1][0]);

        // insertar datos a una matriz

        for (int posX = 0; posX < matriz.length; posX++) {
            for (int posY = 0; posY < matriz[posX].length; posY++) {
                matriz[posX][posY] = posY + 1;
            }
        }

        // recorrer una matriz de dos dimensiones

        for (int posX = 0; posX < matriz.length; posX++) {
            for (int posY = 0; posY < matriz[posX].length; posY++) {
                System.out.println(posX + " - " + posY + ": " + matriz[posX][posY]);
            }
        }

        // recorrer una matriz con mediante foreach

        for ( int[] fila : matriz ) {
            for ( int celda : fila ) {
                System.out.print(celda);
            }
        }

        // arreglos dinamicos

        int calificaciones[][] = new int[5][];

        calificaciones[0] = new int[1];
        calificaciones[1] = new int[2];
        calificaciones[2] = new int[3];
        calificaciones[3] = new int[4];
        calificaciones[4] = new int[5];

        calificaciones[0][0] = 8;

        calificaciones[1][0] = 9;
        calificaciones[1][1] = 10;

        System.out.println();
        System.out.println("Calificaciones por alumno");

        for (int calificacionesPorAlumno[] : calificaciones) {
            for ( int calificacion : calificacionesPorAlumno ) {
                System.out.print(calificacion + " ");
            }

            System.out.println();
        }
    }
}

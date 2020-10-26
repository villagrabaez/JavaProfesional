package com.navegapy.main;

// Imports

import com.navegapy.cursos.Curso;
import com.navegapy.tutores.Tutor;

public class Main {
  public static void main(String[] args) {
    Tutor tutor = new Tutor("Pedro Perez");
    Curso curso = new Curso("Bases de Datos I", 5);

    System.out.println("El curso de " + curso.getNombre() + " tendrá una duración de " + curso.getDuracion() + " meses, y el tutor será " + tutor.getNombre());
  }
}

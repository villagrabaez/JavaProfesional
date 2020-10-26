package com.navegapy.cursos;

public class Curso {
  String nombre;
  int duracion;

  public Curso(String nombre, int duracion)
  {
    this.nombre = nombre;
    this.duracion = duracion;
  }

  public String getNombre()
  {
    return this.nombre;
  }

  public int getDuracion()
  {
    return this.duracion;
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoentradas;

/**
 *
 * @author daney
 */
public class Pelicula {
      // Atributos de la película
    String titulo;     // Nombre de la película
    String genero;     // Género (acción, comedia, etc.)
    int duracion;      // Duración en minutos
    String estado;     // Si está en "Cartelera" o es "Próximo"

    // para crear una película
    public Pelicula(String titulo, String genero, int duracion, String estado) {
        this.titulo = titulo;     // Se guarda el título
        this.genero = genero;     // Se guarda el género
        this.duracion = duracion; // guarda la duración
        this.estado = estado;     // Guarda el estado
    }

    // muestra la información de la película
    public void mostrarPelicula() {
        System.out.println("Título: " + titulo);       // Muestra el título
        System.out.println("Género: " + genero);       // Muestra el género
        System.out.println("Duración: " + duracion + " minutos"); // Muestra duración
        System.out.println("Estado: " + estado);       // Muestra si está en cartelera o es próximo estreno
    }
}


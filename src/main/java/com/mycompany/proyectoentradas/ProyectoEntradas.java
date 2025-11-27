/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoentradas;

/**
 *
 * @author Isaac
 */
public class ProyectoEntradas {

    public static void main(String[] args) {
        
        
        // Se crea el objeto del menú principal
        MenuPrincipal menu = new MenuPrincipal();
        
        // se agregan películas al sistema
        menu.peliculas[menu.contadorPeliculas++] = 
                new Pelicula("Avatar", "Acción", 150, "Cartelera");
        
        menu.peliculas[menu.contadorPeliculas++] =
                new Pelicula("Noche de paz, noche de horror", "Terror", 120, "Proximo");
        
        menu.peliculas[menu.contadorPeliculas++] =
                new Pelicula("Anaconda", "Aventura", 120, "Proximo");
        
        menu.peliculas[menu.contadorPeliculas++] =
                new Pelicula("Guerra Oculta", "Suspenso", 100, "Proximo");

        // Se llama al menú principal para que el programa empiece 
        menu.mostrarMenuPrincipal();
    }
}
    


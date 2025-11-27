/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoentradas;

/**
 *
 * @author daney
 */
public class Cliente {
     // Atributos del cliente
    String nombre;     // guarda el nombre del cliente
    String correo;     // correo del cliente
    int compras;       // cuántas compras ha hecho

    // crear un nuevo cliente
    public Cliente(String nombre, String correo) {
        this.nombre = nombre;   // Aqui el nombre se guarda en el atributo
        this.correo = correo;   // Sucede lo mismo que con el nombre
        this.compras = 0;       // Empieza en 0 porque aún no ha comprado nada
    }

    // mostrar la información del cliente en pantalla
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);        // Muestra el nombre
        System.out.println("Correo: " + correo);        // Muestra el correo
        System.out.println("Compras realizadas: " + compras); // Muestra cuántas compras lleva
    }

}

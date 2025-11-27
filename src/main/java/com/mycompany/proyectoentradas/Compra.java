/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoentradas;

/**
 *
 * @author julian
 */

public class Compra {
    
     // Cliente que realiza la compra
    private Cliente cliente; 
    // Película seleccionada
    private Pelicula pelicula;  
    // Número de entradas compradas
    private int cantidadEntradas;     

    // Constructor
    public Compra(Cliente cliente, Pelicula pelicula, int cantidadEntradas) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.cantidadEntradas = cantidadEntradas;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public int getCantidadEntradas() {  
        return cantidadEntradas;
    }

    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    // Representacion de la compra
    public String toString() {
        return "Cliente: " + cliente.getNombre() +
               " | Película: " + pelicula.getTitulo() +
               " | Entradas: " + cantidadEntradas;
    }
}


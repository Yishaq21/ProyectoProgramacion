/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoentradas;

import javax.swing.JOptionPane;

/**
 *
 * @author Isaac
 */
public class MenuPrincipal {
    
        // Atributos
    public Pelicula[] peliculas;     // Arreglo de peliculas
    public int contadorPeliculas;    // Contador de películas agregadas

    // Constructores
    public MenuPrincipal() {
        peliculas = new Pelicula[15]; // Capacidad para 15 peliculas
        contadorPeliculas = 0;         // Inicializamos contador
    }

    public void mostrarMenuPrincipal() { // Menu Principal Muestra las opciones del sistema y permite navegar
        int opcion; 

        do {             // Opciones que se muestran en el menú principal
            String[] opciones = {"Gestion de clientes", "Cartelera de peliculas", "Compra de entradas", "Reportes", "Salir"};
            opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opcion:", "Menu Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones, opciones[0]);

            switch (opcion) { // Aqui entramos en los subMenus, de cada opcion
                case 0:
                    submenuClientes();
                    break;
                case 1:
                    submenuCartelera();
                    break;
                case 2:
                    submenuCompras();
                    break;
                case 3:
                    submenuReportes();
                    break;
            }
        } while (opcion != 4);  // Sale del sistema
    }

    private void submenuClientes() {     // SubMenu de clientes Permite registrar, consultar o eliminar clientes
        int opcion;

        do {        // Opciones del submenu
            String[] opciones = { "Registrar cliente", "Consultar cliente", "Eliminar cliente", "Salir"};
            opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opcion:", "Gestion de Clientes",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    // registrarCliente();
                    break;
                case 1:
                    // consultarCliente();
                    break;
                case 2:
                    // eliminarCliente();
                    break;
            }
        } while (opcion != 3); // Sale del submenu
    }

    private void submenuCartelera() { // SubMenu de cartelera, donde se encuentra las peliculas disponibles y proximos lanzamientos
        int opcion;

        do {
            String[] opciones = {
                "Mostrar películas", "Proximos lanzamientos", "Salir"};
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opcion:", "Cartelera de Películas",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    for (int i = 0; i < contadorPeliculas; i++) {
                        peliculas[i].mostrarPelicula();
                    }    
                    break;
                case 1:
                    for (int i = 0; i < contadorPeliculas; i++) {
                        if (peliculas[i].estado.equalsIgnoreCase("Proximo")) {
                            peliculas[i].mostrarPelicula();
                        }
                    }
                    break;
            }
        } while (opcion != 2); // Sale del submenu
    }

    private void submenuCompras() { //SubMenu de compras, Se permite seleccionar cliente, pelicula y confirmar compra
        int opcion;

        do {

            String[] opciones = { "Seleccionar cliente", "Elegir pelicula y cantidad", "Confirmar compra", "Salir"};
            opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opcion:", "Compra de Entradas",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    // seleccionarCliente();
                    break;
                case 1:
                    // seleccionarPelicula();
                    break;
                case 2:
                    // confirmarCompra();
                    break;
            }
        } while (opcion != 3); // Sale del submenu
    }

    // ejemplo: capacidad para 50 compras
    private Compraa[] compras = new Compraa[50]; 
       // contador de compras realizadas
    private int contadorCompras = 0;           

    private void submenuReportes() {
        int opcion;
        Reporte reporte = new Reporte(compras, contadorCompras);

        do {
            String[] opciones = {
                "Total entradas vendidas", 
                "Película más vendida", 
                "Cliente con más compras", 
                "Mostrar compras", 
                "Salir"
            };
            opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opcion:", "Reportes",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    reporte.totalEntradasVendidas();
                    break;
                case 1:
                    reporte.peliculaMasVendida();
                    break;
                case 2:
                    reporte.clienteMasCompras();
                    break;
                case 3:
                    reporte.mostrarCompras();
                    break;
            }
            // Sale del submenu
    } while (opcion != 4); 
}
}
    
    

    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoentradas;

import javax.swing.JOptionPane;

public class Reporte {
    
// Arreglo de compras realizadas
    private Compra[] compras;   
// Número de compras registradas    
    private int contadorCompras;    

// Recibe el arreglo de compras y el contador
    public Reporte(Compra[] compras, int contadorCompras) {
        this.compras = compras;
        this.contadorCompras = contadorCompras;
    }

// Muestra todas las compras realizadas
    public void mostrarCompras() {
        if (contadorCompras == 0) {
            JOptionPane.showMessageDialog(null, "No hay compras registradas.");
            return;
        }
        StringBuilder sb = new StringBuilder("Listado de compras:\n");
        for (int i = 0; i < contadorCompras; i++) {
            sb.append(compras[i].toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Total de entradas vendidas
    public void totalEntradasVendidas() {
        int total = 0;
        for (int i = 0; i < contadorCompras; i++) {
            total += compras[i].getCantidadEntradas();
        }
        JOptionPane.showMessageDialog(null, 
            "Total de entradas vendidas: " + total);
    }

    // Película mas vendida
    public void peliculaMasVendida() {
        if (contadorCompras == 0) {
            JOptionPane.showMessageDialog(null, "No hay compras registradas.");
            return;
        }

        Pelicula peliculaMas = null;
        int maxEntradas = 0;

        for (int i = 0; i < contadorCompras; i++) {
            Pelicula p = compras[i].getPelicula();
            int entradas = contarEntradasPorPelicula(p);
            if (entradas > maxEntradas) {
                maxEntradas = entradas;
                peliculaMas = p;
            }
        }

        JOptionPane.showMessageDialog(null, 
            "Película más vendida: " + peliculaMas.getTitulo() +
            " con " + maxEntradas + " entradas.");
    }

    // Cliente con mas entradas compradas
    public void clienteMasCompras() {
        if (contadorCompras == 0) {
            JOptionPane.showMessageDialog(null, "No hay compras registradas.");
            return;
        }

        Cliente clienteTop = null;
        int maxCompras = 0;

        for (int i = 0; i < contadorCompras; i++) {
            Cliente c = compras[i].getCliente();
            int comprasCliente = contarComprasPorCliente(c);
            if (comprasCliente > maxCompras) {
                maxCompras = comprasCliente;
                clienteTop = c;
            }
        }

        JOptionPane.showMessageDialog(null, 
            "Cliente con más compras: " + clienteTop.getNombre() +
            " con " + maxCompras + " compras.");
    }

    // Métodos auxiliares
    private int contarEntradasPorPelicula(Pelicula pelicula) {
        int total = 0;
        for (int i = 0; i < contadorCompras; i++) {
            if (compras[i].getPelicula().equals(pelicula)) {
                total += compras[i].getCantidadEntradas();
            }
        }
        return total;
    }

    private int contarComprasPorCliente(Cliente cliente) {
        int total = 0;
        for (int i = 0; i < contadorCompras; i++) {
            if (compras[i].getCliente().equals(cliente)) {
                total++;
            }
        }
        return total;
    }
}
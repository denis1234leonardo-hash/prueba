/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasemana01;

/**
 *
 * @author Jack el Neitor
 */
public class PruebaSemana01 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("La Odisea", "Homero");
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibros();

        System.out.println("--> Prestando el libro 1...");
        libro1.prestar();

        biblioteca.mostrarLibros();

        System.out.println("--> Devolviendo el libro 1...");
        libro1.devolver();

        biblioteca.mostrarLibros();
    }
    
}

package co.fundamentos.biblioteca.aplicacion;

import javax.swing.JOptionPane;


import co.uniquindio.prog2.biblioteca.model.Biblioteca;
import co.uniquindio.prog2.biblioteca.model.Libro;

public class Aplicacion {

	public static void main(String[] args) {
		
		Biblioteca bibliotecaUQ = new Biblioteca();
		Libro libro= new Libro();

		bibliotecaUQ.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
		bibliotecaUQ.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion"));

		
		System.out.println(bibliotecaUQ.toString());
		
		libro.setGeneroLiterario(JOptionPane.showInputDialog("Ingrese el genero"));
		libro.setIsb(JOptionPane.showInputDialog("Ingrese el ISBN"));
		
		libro.setBibliotecaUQ(bibliotecaUQ);
		
		System.out.println(libro.toString());
		
	}

}

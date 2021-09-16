package co.uniquindio.prog2.biblioteca.model;

public class Libro {
	
	private String isbn;
	
	private String generoLiterario;
	
	private Biblioteca bibliotecaUQ;
	
	
	public Libro(String isbn, String generoLiterario) {
		this.isbn = isbn;
		this.generoLiterario="accion";
	}
	
	public  Libro(String generoLiterario) {
		this.generoLiterario=generoLiterario;
	}
	
	public  Libro() {
		super();
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsb(String isbn) {
		this.isbn = isbn;
	}
	
	
	
	public String getGeneroLiterario() {
		return generoLiterario;
	}

	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}

	public Biblioteca getBibliotecaUQ() {
		return bibliotecaUQ;
	}

	public void setBibliotecaUQ(Biblioteca bibliotecaUQ) {
		this.bibliotecaUQ = bibliotecaUQ;
	}

	
	public String toString() {
		return "Libro isbn=" +isbn+ ", genero " +generoLiterario+ ", "  +bibliotecaUQ+ ".";
	}
	
	

}

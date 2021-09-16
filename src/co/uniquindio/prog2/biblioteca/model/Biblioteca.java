package co.uniquindio.prog2.biblioteca.model;

public class Biblioteca {
	
	private String nombre;
	private String direccion;
	
	public Biblioteca(String nombre, String direccion) {
		
		this.nombre=nombre;
		this.direccion=direccion;
		
	}
	
	public  Biblioteca(String nombre) {
		this.nombre=nombre;
	}
	
	public  Biblioteca() {
		super();
	}
	
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public String getDirreccion() {
		return direccion;
	}
	
	public String toString() {
		return "Biblioteca " +nombre+ ", direccion " +direccion+ "";
	}
	

}

package Clase01;

public class Contactos {

	String Nombre;
	String Apellido;
	int Numero;
	String Email;
	
	public Contactos (String Nombre, String Apellido, int Numero, String Email) {
		
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Numero = Numero;
		this.Email = Email;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre (String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getApellido() {
		return Apellido;
	}
	
	public void setApellido (String Apellido) {
		this.Apellido = Apellido;
	}
	
	public int getNumero() {
		return Numero;
	}
	
	public void setNumero (int Numero) {
		this.Numero = Numero;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail (String Email) {
		this.Email = Email;
	}
}

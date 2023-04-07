package entidades;

public class Residente {
	// ATRIBUTOS
	String nombre;
	int telefono;
	byte edad;
	int cedula;
	String genero;
	Boolean Colombiano;
	// CONSTRUCTOR VACIO
	public Residente() {
		// VACIO
	}
	// METODOS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Boolean getColombiano() {
		return Colombiano;
	}
	public void setColombiano(Boolean colombiano) {
		Colombiano = colombiano;
	}
	
	
}

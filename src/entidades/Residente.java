package entidades;

public class Residente {
	// ATRIBUTOS
	private String nombre;
	private String telefono;
	private byte edad;
	private String cedula;
	private String genero;
	//byte casa;

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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


}

/**
 * Clase Manager. Permite crear manager a partir de los atributos especificados. Se realiciona
 * mediante asociacion con la clase Artista.
 */
package ejercicio;
/**
 * @author Andrea Fernandez Joglar
 * @version 1.2
 */
public class Manager {

	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	private String empresa;
	
	/**
	 * Constructor de la clase Manager con parametros
	 * @param nombre String
	 * @param apellidos String
	 * @param telefono String
	 * @param email String
	 * @param empresa String
	 */
	public Manager(String nombre, String apellidos, String telefono, String email, String empresa) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.empresa = empresa;
	}

	/**
	 * Metodo get del atributo nombre
	 * @return nombre String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del atributo nombre
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del atributo apellidos
	 * @return apellidos String
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo set del atributo apellidos
	 * @param apellidos String
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo get del atributo telefono
	 * @return telefono String
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Metodo set del atributo telefono
	 * @param telefono String
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Metodo get del atributo email
	 * @return email String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Metodo set del atributo email
	 * @param email String
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Metodo get del atributo empresa
	 * @return empresa String
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * Metodo set del atributo empresa
	 * @param empresa String
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Manager: " + nombre + " " + apellidos 
				+ "\n\tTeléfono: " + telefono + "\n\tEmail: " + email
				+ "\n\tEmpresa: " + empresa;
	}
	
	
	
	
}

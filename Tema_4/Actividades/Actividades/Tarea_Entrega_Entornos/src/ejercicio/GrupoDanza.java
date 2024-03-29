/**
 * Subclase GrupoDanza. Aplica los metodos heredados.
 */
package ejercicio;

/**
 * @author Andrea Fernandez Joglar
 * @version 1.2
 */
public class GrupoDanza extends Artista {
	
	private final String ID_DANZA = "GD";
	
	private static int CONTADOR_ID_DANZA = 0;
	
	private String idDanza;
	private TipoDanza tipo;
	private String pais;
	
	/**
	 * Constructor de la clase GrupoDanza con parametros
	 * @param nombreArtista String
	 * @param manager Manager
	 * @param cache real
	 * @param tipo TipoDanza
	 * @param pais String
	 */
	public GrupoDanza(String nombreArtista, Manager manager, 
					  double cache, TipoDanza tipo, String pais) {
		super(nombreArtista, manager, cache);
		CONTADOR_ID_DANZA++;
		this.idDanza = asignarIdentificador();
		this.tipo = tipo;
		this.pais = pais;
	}

	/**
	 * Metodo get del atributo idDanza
	 * @return idDanza String
	 */
	public String getIdDanza() {
		return idDanza;
	}

	/**
	 * Metodo set del atributo idDanza
	 * @param idDanza String
	 */
	public void setIdDanza(String idDanza) {
		this.idDanza = idDanza;
	}

	/**
	 * Metodo get del atributo tipo
	 * @return tipo TipoDanza
	 */
	public TipoDanza getTipo() {
		return tipo;
	}

	/**
	 * Metodo set del atributo tipo
	 * @param tipo TipoDanza
	 */
	public void setTipo(TipoDanza tipo) {
		this.tipo = tipo;
	}

	/**
	 * Metodo get del atributo pais
	 * @return pais String
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * Metodo set del atributo pais
	 * @param pais String
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String asignarIdentificador() {
		String id = super.asignarIdentificador() + this.ID_DANZA + CONTADOR_ID_DANZA;
		
		super.setIdArtista(id);
		
		return id;
	}

	@Override
	public void mostrarDisciplina() {
		System.out.println("****************************");
		System.out.println("Grupo de danza: " + this.idDanza 
							+ "\nTipo de danza: " + this.tipo + "\nPaís: " + this.pais);
		System.out.println(this.toString());
	}

}

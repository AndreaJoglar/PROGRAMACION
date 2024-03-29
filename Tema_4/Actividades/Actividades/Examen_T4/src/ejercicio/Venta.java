package ejercicio;

public class Venta {

	private static int CONT_VENTAS = 0;
	
	private int idVentas;
	private String nombreVendedor;
	private DetalleVenta [] detalles;
	private int contDetalles;
	

	/**
	 * @param idVentas
	 * @param nombreVendedor
	 * @param detalles
	 * @param contDetalles
	 */
	public Venta( String nombreVendedor) {
		CONT_VENTAS++;
		this.idVentas = CONT_VENTAS;
		this.nombreVendedor = nombreVendedor;
		this.detalles = detalles;
		this.contDetalles = 0;
	}


	public void añadirDetalle (Producto p, int cantidad) {
		DetalleVenta detalle = new DetalleVenta(p, cantidad);
		if (contDetalles < detalles.length) {
			detalles[contDetalles] = detalle;
			contDetalles++;
		}
	}
	
	public double calcularImporteTotal() {
		double total = 0.0;
		for (int i = 0; i < contDetalles; i++) {
			total += detalles[i].precioTotal();
		}
		return total;
	}
	
	public void abonar() {
		
	}


	@Override
	public String toString() {
		String texto = "Venta [idVentas=" + idVentas + ", nombreVendedor=" + nombreVendedor + ", detalles:\n";
		for (int i = 0; i < detalles.length; i++) {
			texto += detalles[i].toString();
		}
		return texto;
	}
	
	
	
	
}

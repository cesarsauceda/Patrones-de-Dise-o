package Factory;

public class FactoriaFactura {
	 
	public static Factura getFactura(String tipo) {
	 
	 if (tipo.equals("iva")) {
	 
	 return new FacturaIva();
	 }
	 else {
	 return new FacturaIvaReducido();
	 }
	 
	 }
}

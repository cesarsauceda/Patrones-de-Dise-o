package Factory;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Factura f= FactoriaFactura.getFactura("ivas");
		 f.setId(1);
		 f.setImporte(100);
		 System.out.println(f.getImporteIva());
		 }
	

}

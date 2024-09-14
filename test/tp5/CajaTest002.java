package tp5;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest002 {
	List<Pagable> cobrables = new ArrayList<Pagable>();
	AgenciaRecaudadora agencia = new AgenciaRecaudadora();
	
	Caja caja = new Caja(agencia);
	Producto banana = new ProductoTrad(5, 500);
	Producto ananá = new ProductoTrad(2, 900);
	Producto peras = new ProductoTrad(59878, 2);
	Producto leche = new ProductoCoop(50, 2000);
	FacturaServicios factura001 = new FacturaServicios(2000, 3);
	FacturaImpuestos factura002 = new FacturaImpuestos(500);
	

	@BeforeEach
	void setUp() throws Exception {
	
		cobrables.add(banana);
		cobrables.add(banana);
		cobrables.add(banana);
		cobrables.add(banana);
		cobrables.add(banana);
		cobrables.add(ananá);
		cobrables.add(peras);
		cobrables.add(leche);
		cobrables.add(factura001);
		cobrables.add(factura002);
		
		caja.registrarProductosCliente(cobrables);
	}

	@Test
	void test() {
		assertEquals(11702, caja.getTotal(), 0.01);
		assertEquals(agencia.getPagosTotales(), 6500, 0.01);
	}

}

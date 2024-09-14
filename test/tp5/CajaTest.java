package tp5;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	List<Pagable> productos = new ArrayList<Pagable>();
	Caja caja = new Caja(null);
	Producto banana = new ProductoTrad(5, 500);
	Producto ananá = new ProductoTrad(2, 900);
	Producto peras = new ProductoTrad(59878, 2);
	Producto leche = new ProductoCoop(50, 2000);

	@BeforeEach
	void setUp() throws Exception {
	
		
		productos.add(banana);
		productos.add(banana);
		productos.add(banana);
		productos.add(banana);
		productos.add(banana);
		productos.add(ananá);
		productos.add(peras);
		productos.add(leche);
		
		caja.registrarProductosCliente(productos);
	}

	@Test
	void test() {
		assertEquals(5202, caja.getTotal(), 0.01);
		assertEquals(0, banana.getStock());
		assertEquals(1, ananá.getStock());
		assertEquals(59877, peras.getStock());
		assertEquals(49, leche.getStock());
	}

}

package observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObserverTest {
	private Articulo art;
	private Investigador emmettBrown;
	private Investigador martiMcFly;
	private SistemaDeReferencias sistem;
	private String preferencia1;
	private String preferencia2;
	
	@BeforeEach
	void setUp() {
		emmettBrown = new Investigador();
		martiMcFly = new Investigador();
		sistem = new SistemaDeReferencias();
		art = new Articulo("Plutonio para viajes en el tiempo");
		preferencia1 = "Viaje en el tiempo";
		preferencia2 = "Tocar guitarra";
		emmettBrown.agregarPreferencias(preferencia1);
		art.agregarPalabraClave(preferencia1);
		martiMcFly.agregarPreferencias(preferencia2);
		sistem.suscribir(emmettBrown);
		sistem.suscribir(martiMcFly);
		
		
	}
	
	@Test
	void testObserver() {
		art.publicar(sistem);
		
		assertEquals(1, emmettBrown.getListaDeArticulosALeer().size());
		assertEquals(0, martiMcFly.getListaDeArticulosALeer().size());
	}

}

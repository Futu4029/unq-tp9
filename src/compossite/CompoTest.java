package compossite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class CompoTest {
	public Cultivo trigo;
	public Cultivo soja;
	
	public void setUp() {
		trigo = new Trigo();
		soja = new Soja();
		
	}
	
	@Test
	void test() {
		assertEquals(300, trigo.getGanancia());
	}

}

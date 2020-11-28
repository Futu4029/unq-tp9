package compossite;

import java.util.ArrayList;
import java.util.List;

public class CultivoMixto extends Cultivo{
	List<Cultivo> cosecha = new ArrayList<Cultivo>();
	
	public float gananciaAnual() {
		float ganancia = 0;
		for(int i = 0; cosecha.size()>i; i++) {
			ganancia = ganancia + (cosecha.get(i).getGanancia() / 4);
		}
		return ganancia;
	}
	
	public void add(Cultivo c) {
		if (cosecha.size()<=4) {
		cosecha.add(c);
		}
	}
	
	public void remove(Cultivo c) {
		cosecha.remove(c);
	}
}

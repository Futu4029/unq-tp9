package observer;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
	//aca van varios datos que para la practica los considero extra
	// solo voy a poner el nombre para testear que funciona.
	
	private String name;
	private List<String> palabrasClave;
	
	public Articulo(String name) {
		super();
		this.setName(name);
		this.setPalabrasClave(new ArrayList<String>());
	}
	public List<String> getPalabrasClave() {
		return palabrasClave;
	}
	public void setPalabrasClave(List<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}
	public void publicar(SistemaDeReferencias sistema) {
		sistema.notificar(this);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void agregarPalabraClave(String palabra) {
		this.getPalabrasClave().add(palabra);
	}
}

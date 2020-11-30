package observer;

import java.util.ArrayList;
import java.util.List;

public class Investigador implements IObserver{
	private List<Articulo> listaDeArticulosALeer;
	private List<String> preferencias;
	
	public Investigador() {
		super();
		this.setListaDeArticulosALeer(new ArrayList<Articulo>());
		this.setPreferencias(new ArrayList<String>());
	}
	
	@Override
	public void update(Articulo articulo) {		
		this.agregarArticulo(articulo);
	}

	private void agregarArticulo(Articulo articulo) {
		this.getListaDeArticulosALeer().add(articulo);
		
	}

	public List<Articulo> getListaDeArticulosALeer() {
		return listaDeArticulosALeer;
	}

	public void setListaDeArticulosALeer(List<Articulo> listaDeArticulosALeer) {
		this.listaDeArticulosALeer = listaDeArticulosALeer;
	}

	@Override
	public List<String> preferencias() {
		return this.preferencias;
	}
	
	public void agregarPreferencias(String preferencia) {
		this.preferencias().add(preferencia);
	}

	public void setPreferencias(List<String> preferencias) {
		this.preferencias = preferencias;
	}

}

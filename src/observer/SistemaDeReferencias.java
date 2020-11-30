package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaDeReferencias implements ISubject{
	private List<IObserver> listaDeInvestigadores;
	
	public SistemaDeReferencias() {
		super();
		listaDeInvestigadores = new ArrayList<IObserver>();
	}
	@Override
	public void suscribir(IObserver investigador) {
		this.getListaDeInvestigadores().add(investigador);
	}

	@Override
	public void desuscribir(IObserver investigador) {
		this.getListaDeInvestigadores().remove(investigador);
		
	}

	@Override
	public void notificar(Articulo articulo) {
		List<String> palabrasClave = articulo.getPalabrasClave();
		List<IObserver> investigadores = this.getListaDeInvestigadores().stream().filter(
				inv -> this.contienePreferencia(inv, palabrasClave)).collect(Collectors.toList());
		investigadores.stream().forEach(inv -> inv.update(articulo));
		
	}
	private Boolean contienePreferencia(IObserver inv, List<String> palabrasClave) {
		return inv.preferencias().stream().anyMatch(pref -> palabrasClave.contains(pref));
	}
	public List<IObserver> getListaDeInvestigadores() {
		return listaDeInvestigadores;
	}
	public void setListaDeInvestigadores(ArrayList<IObserver> listaDeInvestigadores) {
		this.listaDeInvestigadores = listaDeInvestigadores;
	}

}

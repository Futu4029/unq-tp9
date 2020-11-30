package observer;

public interface ISubject {
	public void suscribir(IObserver investigador);
	public void desuscribir(IObserver investigador);
	public void notificar(Articulo articulo);
	
}

package observer;

import java.util.List;

public interface IObserver {
	public void update(Articulo articulo);
	public List<String> preferencias();
}

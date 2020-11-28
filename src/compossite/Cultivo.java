package compossite;

public abstract class Cultivo {
	private int ganancia;
	
	public Cultivo() {
		super();
	}
	public int getGanancia() {
		return this.ganancia;
	}
	
	public void setGanancia(int ganancia) {
		this.ganancia = ganancia;
	}
	
}

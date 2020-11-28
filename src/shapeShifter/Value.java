package shapeShifter;

import java.util.Arrays;
import java.util.List;

public class componente implements IShapeShifter{
	private Integer value;
	private List<IShapeShifter> list;
	
	public componente(Integer value) {
		this.value = value;
	}
	
	public int deepest() {
		return 0;
	}
	
	public IShapeShifter flat() {
		return this;
	}
	
	public List<Integer> values(){
		List<Integer> r = Arrays.asList(value); 
		return r;
	}
	
	public IShapeShifter compose(IShapeShifter nuevoShifter) {
		IShapeShifter shifterCompuesto = new ShapeShifter();
		shifterCompuesto.getList().add(this);
		shifterCompuesto.getList().add(nuevoShifter);
		list.add(shifterCompuesto);
		return shifterCompuesto;
	}

	@Override
	public List<IShapeShifter> getList() {
		return this.list;
	}
}

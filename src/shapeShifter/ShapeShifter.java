package shapeShifter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeShifter implements IShapeShifter{
	private List<IShapeShifter> list;
	private Integer value;
	
	public ShapeShifter(){
		super();
		list = new ArrayList<IShapeShifter>();
	}
	
	public IShapeShifter compose(IShapeShifter nuevoShifter) {
		IShapeShifter shifterCompuesto = new ShapeShifter();
		shifterCompuesto.getList().add(this);
		shifterCompuesto.getList().add(nuevoShifter);
		list.add(shifterCompuesto);
		return shifterCompuesto;
	}
	
	public Integer getValue() { 
		return this.value;
	}

	public void setValue(Integer i) {
		this.value = i;
	}

	public List<IShapeShifter> getList(){
		return this.list;
	}
	public List<IShapeShifter> setList(List<IShapeShifter> lista){
		return this.list = lista;
	}
	
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	@Override
	public int deepest() {
		int resultado = 1;
		return resultado;
	}
	
	public boolean isDeeper() {
		return this.deepest() > 1;
	}
	
	@Override
	public IShapeShifter flat() {
		IShapeShifter resultado = (this.deepest() >= 1) ? this.flatHelper(this.getList())
				:this;
		return resultado;
	}
	
	public IShapeShifter flatHelper(List<IShapeShifter> l) {
		
		IShapeShifter resultado = new ShapeShifter();
		List<IShapeShifter> re2 = l.stream().map(ss -> ss.flat()).collect(Collectors.toList());
		resultado.setList(re2);
		return resultado;
	}

	@Override
	public List<Integer> values() {
		return null;
	}


}

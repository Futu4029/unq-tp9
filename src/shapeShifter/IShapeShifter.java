package shapeShifter;
import java.util.List;

public interface IShapeShifter { 
	   public IShapeShifter compose(IShapeShifter nuevoShifter); 
	   public int deepest(); 
	   public IShapeShifter flat(); 
	   public List<Integer> values();
	   public List<IShapeShifter> getList();
	   public List<IShapeShifter> setList(List<IShapeShifter> list); 
	   public void setValue(Integer i);
	   public Integer getValue();
}


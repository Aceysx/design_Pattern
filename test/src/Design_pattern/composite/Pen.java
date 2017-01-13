package Design_pattern.composite;

import java.util.List;

public class Pen implements PenBox{

	private String name;
	
	public Pen(String name) {
		this.name = name;
	}
	
	@Override
	public void add(PenBox penbox) {
	}

	@Override
	public void remove(PenBox penbox) {
	}
	//œ‘ æµ±«∞± 
	@Override
	public void display() {
		System.out.println(name);
	}

	@Override
	public List<PenBox> getChildren() {
		return null;
	}

}

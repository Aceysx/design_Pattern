package Design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Layer implements PenBox{

	private List<PenBox> layers;
	private String name;

	//给当前层一个名字
	public Layer(String name) {
		layers = new ArrayList<>();
		this.name = name;
	}
	//给当前层添加一支笔
	@Override
	public void add(PenBox penbox) {
		layers.add(penbox);
	}
	//移除当前层中的一支笔
	@Override
	public void remove(PenBox penbox) {
		layers.remove(penbox);
	}
	//显示当前层的名称
	@Override
	public void display() {
		System.out.println(name);
	}
	//获取当前层中的所有笔
	@Override
	public List<PenBox> getChildren() {
		return this.layers;
	}

}

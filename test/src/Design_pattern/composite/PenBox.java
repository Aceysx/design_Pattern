package Design_pattern.composite;

import java.util.List;

public interface PenBox {
	//添加一层或往当前层添加笔
	public void add(PenBox penbox);
	//移除当前层或移除当前层中存放的笔
	public void remove(PenBox penbox);
	//查看当前层或当前层中的笔
	public void display();
	//获取笔盒中的所有层或当前层中的所有笔
	public List<PenBox> getChildren();
}

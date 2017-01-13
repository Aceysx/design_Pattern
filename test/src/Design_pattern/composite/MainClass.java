package Design_pattern.composite;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		//创建一个笔盒，笔盒是一个特殊的层
		PenBox penBox = new Layer("笔盒");
		//为笔盒添加两层
		PenBox penLayer = new Layer("第一层，装中性笔");
		PenBox pencilLayer = new Layer("第二层，装铅笔");
		//将第一层和第一层添加到笔盒中
		penBox.add(penLayer);
		penBox.add(pencilLayer);
		
		
		//向铅笔层中添加三支笔
		pencilLayer.add(new Pen("红色"));
		pencilLayer.add(new Pen("白色"));
		pencilLayer.add(new Pen("蓝色"));
		
		//向中性笔层中添加三支笔
		penLayer.add(new Pen("红色"));
		penLayer.add(new Pen("白色"));
		penLayer.add(new Pen("蓝色"));
		
		//显示笔盒中全部的笔
		display(penBox, 0);
	}
	//迭代打印整个笔盒
	public static void display(PenBox penbox,Integer deep){
		for(int i = 0; i < deep; ++i){
			System.out.print("-");
		}
		penbox.display();
		if(penbox instanceof Pen){
			return;
		}
		List<PenBox> children = penbox.getChildren();
		for(PenBox child : children){
			if(child instanceof Pen){
				for(int i = 0; i <= deep; ++i){
					System.out.print("-");
				}
				child.display();
			}else{
				display(child, deep+1);
			}
		}
	}
}

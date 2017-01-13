package Design_pattern.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Caretaker  {
	//存储所有版本信息
	private Map<String,Version> versions = new HashMap<>();
	private List<String> verNums = new ArrayList<>();
	
	//保存一个版本
	public void addVersion(Version version){
		String verNum = UUID.randomUUID().toString().replace("-", "");
		verNums.add(verNum);
		versions.put(verNum, version);
	}
	
	//返回前一个版本
	public Version getVersion(){ 

		return versions.get(verNums.get(verNums.size() - 2));
	}
	
	//返回指定版本
	public Version getVersion(String verNum){
		return versions.get(verNum);
	}
	
	//显示所有版本号
	public void showVersions(){
		for(String num : verNums){
			System.out.println(num);
		}
			
	}
}

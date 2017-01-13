package Design_pattern.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Caretaker  {
	//�洢���а汾��Ϣ
	private Map<String,Version> versions = new HashMap<>();
	private List<String> verNums = new ArrayList<>();
	
	//����һ���汾
	public void addVersion(Version version){
		String verNum = UUID.randomUUID().toString().replace("-", "");
		verNums.add(verNum);
		versions.put(verNum, version);
	}
	
	//����ǰһ���汾
	public Version getVersion(){ 

		return versions.get(verNums.get(verNums.size() - 2));
	}
	
	//����ָ���汾
	public Version getVersion(String verNum){
		return versions.get(verNum);
	}
	
	//��ʾ���а汾��
	public void showVersions(){
		for(String num : verNums){
			System.out.println(num);
		}
			
	}
}

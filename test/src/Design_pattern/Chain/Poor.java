package Design_pattern.Chain;

//贫困处理
public class Poor extends Handler{

	public Integer getTuition(Student student, Integer tuition) {
		//如果贫困，减免1000
		if(student.isPoor()){
			tuition -= 1000;
			System.out.println("贫困减免后学费:"+tuition);
			//如果有下一环就传入下一环
			if(this.getSuccessor() != null){
				return	this.getSuccessor().getTuition(student, tuition);
			}
		}
		return tuition;
	}

}

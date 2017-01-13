package Design_pattern.Chain;

//助学金处理
public class Grant extends Handler{

	public Integer getTuition(Student student, Integer tuition) {
		//如果有助学金学费减免
		if(student.getGrant() > 0){
			tuition -= student.getGrant();
			System.out.println("助学金减免后学费:"+tuition);
			//如果有下一环就传入下一环
			if(this.getSuccessor() != null){
				return	this.getSuccessor().getTuition(student, tuition);
			}
		}
		return tuition;
	}
}

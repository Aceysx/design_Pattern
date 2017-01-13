package Design_pattern.Chain;

//奖学金处理
public class Scholarship extends Handler{
	@Override
	public Integer getTuition(Student student, Integer tuition) {
		//如果有奖学金学费减免
		if(student.getScholarship() > 0){
			tuition -= student.getScholarship();
			System.out.println("奖学金减免后学费:"+tuition);
			//如果有下一环就传入下一环
			if(this.getSuccessor() != null){
				return	this.getSuccessor().getTuition(student, tuition);
			}
		}
		return tuition;
	}

}

package vn.edu.fita.credit;

public class JavaSubject extends AbstractSubject implements SubjectRule {
	
	public JavaSubject(String subjectCode, String subjectName, int credit) {
		super(subjectCode, subjectName, credit);
		// TODO Auto-generated constructor stub
	}

	private float attendanceMark;
	private float midExamMark;
	private float finalExamMark;

	@Override
	public float calSubjectMark() {
		// TODO Auto-generated method stub
		return attendanceMark*0.1f + midExamMark*0.3f + finalExamMark*0.6f;
	}

	public float getAttendanceMark() {
		return attendanceMark;
	}

	public void setAttendanceMark(float attendanceMark) {
		this.attendanceMark = attendanceMark;
	}


	public float getFinalExamMark() {
		return finalExamMark;
	}

	public void setFinalExamMark(float finalExamMark) {
		this.finalExamMark = finalExamMark;
	}

	public float getMidExamMark() {
		return midExamMark;
	}

	public void setMidExamMark(float midExamMark) {
		this.midExamMark = midExamMark;
	}

	@Override
	public String toString() {
		return getSubjectCode() + "-" + getSubjectName() + "-" + getCredit() + "-" + attendanceMark + "-"  + midExamMark + "-" + finalExamMark + "-" +  
				  "subject mark: " + calSubjectMark() + " - conversion mark: " +
				  calConversionMark();
	}

	@Override
	public void setAttendanceMark(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMidExamMark(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFinalExamMark(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMidExamMark1(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMidExamMark2(int i) {
		// TODO Auto-generated method stub
		
	}

}

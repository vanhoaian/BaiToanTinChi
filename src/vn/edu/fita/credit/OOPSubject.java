package vn.edu.fita.credit;

public class OOPSubject extends AbstractSubject implements SubjectRule{

	public OOPSubject(String subjectCode, String subjectName, int credit) {
		super(subjectCode, subjectName, credit);
		// TODO Auto-generated constructor stub
	}

	private float attendanceMark;
	private float midExamMark1;
	private float midExamMark2;
	private float finalExamMark;

	@Override
	public float calSubjectMark() {
		// TODO Auto-generated method stub
		return attendanceMark * 0.1f + midExamMark1 * 0.2f + midExamMark2 * 0.1f + finalExamMark * 0.5f;
	}

	public float getAttendanceMark() {
		return attendanceMark;
	}

	public void setAttendanceMark(float attendanceMark) {
		this.attendanceMark = attendanceMark;
	}

	public float getMidExamMark1() {
		return midExamMark1;
	}

	public void setMidExamMark1(float midExamMark1) {
		this.midExamMark1 = midExamMark1;
	}

	public float getMidExamMark2() {
		return midExamMark2;
	}

	public void setMidExamMark2(float midExamMark2) {
		this.midExamMark2 = midExamMark2;
	}

	public float getFinalExamMark() {
		return finalExamMark;
	}

	public void setFinalExamMark(float finalExamMark) {
		this.finalExamMark = finalExamMark;
	}

	@Override
	public String toString() {
		return getSubjectCode() + "-" + getSubjectName() + "-" + getCredit() + "-" + attendanceMark + "-" + midExamMark1
				+ "-" + midExamMark2 + "-" + finalExamMark + "-" + "subject mark: " + calSubjectMark()
				+ " - conversion mark: " + calConversionMark();
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

package vn.edu.fita.credit;

public abstract class SubjectMark {
	
	private String subjectCode;
	private String subjectName;
	private int credit;
	
	public SubjectMark(String subjectCode, String subjectName, int credit) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.credit = credit;
	}
		
	public abstract float calSubjectMark();
	
	public String calGrade() {
		float subjectMark = calSubjectMark();
		if (subjectMark < 0)
			return "Error";
		else if (subjectMark <= 3.9)
			return "F";
		else if (subjectMark <= 4.9)
			return "D";
		else if (subjectMark <= 5.4)
			return "D+";
		else if (subjectMark <= 6.4)
			return "C";
		else if (subjectMark <= 6.9)
			return "C+";
		else if (subjectMark <= 7.4)
			return "B";
		else if (subjectMark <= 8.4)
			return "B+";
		else if (subjectMark <= 10)
			return "A";
		else
			return null;
	}
	
	public float calConversionMark(String grade) {
		switch (grade) {
		case ("A"):
			return 4;

		case ("B+"):
			return (float) 3.5;

		case ("B"):
			return 3;

		case ("C+"):
			return (float) 2.5;

		case ("C"):
			return 2;

		case ("D+"):
			return 3;

		case ("D"):
			return (float) 2.5;

		default:
			return 0;
		}
	}
	
	public float calConversionMark() {
		float subjectMark = calSubjectMark();
		if (subjectMark <= 3.9)
			return 0;
		else if (subjectMark <= 4.9)
			return 1;
		else if (subjectMark <= 5.4)
			return (float) 1.5;
		else if (subjectMark <= 6.4)
			return 2;
		else if (subjectMark <= 6.9)
			return (float) 2.5;
		else if (subjectMark <= 7.4)
			return 3;
		else if (subjectMark <= 8.4)
			return (float) 3.5;
		else if (subjectMark <= 10)
			return 4;
		else
			return -1;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getCredit() {
		return credit;
	}

	public int setCredit(int credit) {
		credit = this.credit;
		return 0;
	}
	
	
	  public abstract String toString();
	 

}

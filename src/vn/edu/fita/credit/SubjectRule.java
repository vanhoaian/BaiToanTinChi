package vn.edu.fita.credit;

import java.util.Scanner;

public interface SubjectRule {
	
	float calSubjectMark();
	
	float calConversionMark();
	
	float calConversionMark(String grade);
	
	String calGrade();
	
	void enterInfor(Scanner sc);
	
	String toString();

	int getCredit();

	Object getSubjectCode();

	void setAttendanceMark(int i);

	void setMidExamMark(int i);

	void setFinalExamMark(int i);

	void setMidExamMark1(int i);

	void setMidExamMark2(int i);

	void setCredit(int i);

}

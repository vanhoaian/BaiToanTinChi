package vn.edu.fita.credit;

import java.util.Scanner;

public abstract class AbstractSubject implements ConstMark{
	private String subjectCode;
	private String subjectName;
	private int credit;

	public AbstractSubject() {

	}

	public AbstractSubject(String subjectCode, String subjectName, int credit) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.credit = credit;
	}

	public abstract float calSubjectMark();

	
	  public float calConversionMark() {
		float subjectMark = calSubjectMark();
		if (subjectMark <= LEVL_F)
			return GRADE_F;
		else if (subjectMark <= LEVEL_D)
			return GRADE_D;
		else if (subjectMark <= LEVEL_D_)
			return GRADE_D_;
		else if (subjectMark <= LEVEL_C)
			return 2;
		else if (subjectMark <= LEVEL_C_)
			return GRADE_C_;
		else if (subjectMark <= LEVEL_B)
			return GRADE_C;
		else if (subjectMark <= LEVEL_B_)
			return GRADE_B_;
		else if (subjectMark <= LEVEL_A)
			return GRADE_A;
		else
			return -1;
	}

	public float calConversionMark(String grade) {
		float mark = -1;
		switch (grade) {
		case ("A"):
			mark = GRADE_A;

		case ("B+"):
			mark = GRADE_B_;

		case ("B"):
			mark = GRADE_B;

		case ("C+"):
			mark = GRADE_C_;

		case ("C"):
			mark = GRADE_C;

		case ("D+"):
			mark = GRADE_D_;
			
		case ("D"):
			mark = GRADE_D;

		case ("F"):
			mark = GRADE_F;
		}
		
		return mark;
	}

	public String calGrade() {
		float subjectMark = calSubjectMark();
		String grade = null;
		if (subjectMark < 0)
			grade = null;
		else if (subjectMark <= LEVL_F)
			grade = "F";
		else if (subjectMark <= LEVEL_D)
			grade = "D";
		else if (subjectMark <= GRADE_D_)
			grade = "D+";
		else if (subjectMark <= LEVEL_C)
			grade = "C";
		else if (subjectMark <= GRADE_C_)
			grade = "C+";
		else if (subjectMark <= LEVEL_B)
			grade = "B";
		else if (subjectMark <= LEVEL_B_)
			grade = "B+";
		else if (subjectMark <= LEVEL_A)
			grade = "A";
		return grade;
	}

	public void enterInfor(Scanner sc) {
		System.out.println("Nhập mã môn học: ");
		subjectCode = sc.nextLine();
		System.out.println("Nhập tên môn học: ");
		subjectName = sc.nextLine();
		System.out.println("Nhập số tín chỉ: ");
		credit = sc.nextInt();
	}

	/*
	 * public float calSubjectMark(Scanner sc) { System.out.
	 * println("Bạn có muốn thay đổi cách tính điểm học phần không? (c/k)\nHệ số mẫu: 0.1 : 0.3 : 0.6 "
	 * ); String type = sc.nextLine(); if ("c".equalsIgnoreCase(type)){ List<Mark>
	 * markList = new ArrayList<Mark>(); Mark mark = new Mark(); float factor = 0;
	 * do { factor += mark.enterMark(sc); mark.add(mark);
	 * System.out.println("Tổng hệ số còn lại là:" + (1-factor)); if (factor >1) {
	 * System.out.println("Hệ số vượt quá 1, vui lòng nhập lại.");
	 * System.out.println("Tổng hệ số còn lại là:" + (1-factor)); remove(mark); } }
	 * while (factor !=1);
	 * 
	 * 
	 * } return 0; }
	 */

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

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public abstract String toString();
}

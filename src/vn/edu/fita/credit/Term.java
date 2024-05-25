package vn.edu.fita.credit;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
/**
 * 
 */
public class Term {
	private String termCode;
	private List<SubjectRule> subjectList;

	public Term(String termCode) {
		this.termCode = termCode;
		subjectList = new ArrayList<SubjectRule>();
	}
	
	public int getSumOfCredit() {
		int sum = 0;
		for(SubjectRule sub: subjectList) {
			sum += sub.getCredit();
		}
		return sum;
	}

	public void addSubject(AbstractSubject sub) {
		subjectList.add(sub);
	}

	/*
	 * public void addSubject(Scanner sc) { AbstractSubject subject = new
	 * AbstractSubject(); subject.enterInfor(sc); addSubject(subject); }
	 */

	public boolean removeSubject(String subjectCode) {
		for (SubjectRule subject : subjectList) {
			if (subject.getSubjectCode().equals(subjectCode)) {
				subjectList.remove(subject);
				return true;
			}
		}
		return false;
	}

	/**
	 * @param subjectCode
	 */
	/*
	 * public void editSubject(String subjectCode) { for (AbstractSubject subject :
	 * subjectList) { if (subject.getSubjectCode().equals(subjectCode)) { Scanner sc
	 * = new Scanner(System.in); String type;
	 * 
	 * System.out.println("Có sửa tên môn học không? (c/k)"); type = sc.nextLine();
	 * if ("c".equalsIgnoreCase(type)) {
	 * System.out.println("Nhập tên môn học mới: ");
	 * subject.setSubjectName(sc.nextLine()); }
	 * 
	 * System.out.println("Có sửa số tín chỉ môn học không? (c/k)"); type =
	 * sc.nextLine(); if ("c".equalsIgnoreCase(type)) {
	 * System.out.println("Nhập số tín chỉ môn học mới: ");
	 * subject.setCredit(sc.nextInt()); } sc.nextLine();
	 * 
	 * System.out.println("Có sửa điểm chuyên cần không? (c/k)"); type =
	 * sc.nextLine(); if ("c".equalsIgnoreCase(type)) {
	 * System.out.println("Nhập điểm chuyên cần mới: ");
	 * subject.setAttendanceMark(sc.nextFloat()); } sc.nextLine();
	 * 
	 * System.out.println("Có sửa điểm giữa môn không? (c/k)"); type =
	 * sc.nextLine(); if ("c".equalsIgnoreCase(type)) {
	 * System.out.println("Nhập điểm giữa môn mới: ");
	 * subject.setMidExamMark(sc.nextFloat()); } sc.nextLine();
	 * 
	 * System.out.println("Có sửa điểm hết môn không? (c/k)"); type = sc.nextLine();
	 * if ("c".equalsIgnoreCase(type)) {
	 * System.out.println("Nhập điểm hết môn mới: ");
	 * subject.setFinalExamMark(sc.nextFloat()); } sc.nextLine(); } } }
	 */

	public void editSubject(SubjectRule subject) {
		for (SubjectRule sub : subjectList) {
			if (subject.getSubjectCode().equals(sub.getSubjectCode())) {
				sub = subject;
			}
		}
	}

	public void printSubjectList() {
		for (SubjectRule subject : subjectList) {
			System.out.println(subject.toString());
		}
	}

	public List<SubjectRule> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<SubjectRule> subjectList) {
		this.subjectList = subjectList;
	}

	public float calTermAverageMark() {
		float mark = 0;
		int credit = 0;

		for (SubjectRule sub : subjectList) {
			mark += sub.getCredit() * sub.calConversionMark();
			credit += sub.getCredit();
		}

		if (credit == 0)
			return 0;

		return mark / credit;
	}

	public String getTermCode() {
		return termCode;
	}

	public void setTermCode(String termCode) {
		this.termCode = termCode;
	}
}



//package vn.edu.fita.credit;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Student1 extends Human {
//	private String class_;
//	private Map<String, Term> termList = new HashMap<String, Term>();
//
//	public Student1() {
//
//	}
//
//	public Student1(String code) {
//		super(code);
//	}
//
//	public Student1(String code, String fullname) {
//		super(code, fullname);
//	}
//
//	public Student1(String code, String fullname, String class_) {
//		this(code, fullname);
//		this.class_ = class_;
//	}
//
//	public Student1(String code, String fullname, String class_, String address) {
//		this(code, fullname, class_);
//		this.address = address;
//	}
//
//	public void addTerm(Term term) {
//		termList.put(term.getTermCode(), term);
//	}
//
//	public void addSubject(String termCode, SubjectRule sj3_1) {
//		Term term = termList.get(termCode);
//		term.addSubject(sj3_1);
//	}
//
//	public int getSumOfCredit() {
//		int sum = 0;
//		for (Term term : termList.values()) {
//			sum += term.getSumOfCredit();
//		}
//		return sum;
//	}
//
//	public boolean removeSubject(String termCode, String subjectCode) {
//		return termList.get(termCode).removeSubject(subjectCode);
//	}
//
//	public void editSubject(String termCode, SubjectRule subject) {
//		termList.get(termCode).editSubject(subject);
//	}
//
//	@Override
//	public void enterInfor(Scanner sc) {
//		super.enterInfor(sc);
//		System.out.println("Nhập lớp: ");
//		class_ = sc.nextLine();
//	}
//
//	public String getclass_() {
//		return class_;
//	}
//
//	public void setclass_(String class_) {
//		this.class_ = class_;
//	}
//
//	@Override
//	public String toString() {
//		return super.toString() + "-" + getclass_();
//	}
//
//	public static void main(String[] args) {
//		
//		Student1 std = new Student1("669030", "Nguyen Duc Nam", "Ha Noi", "K66CNTTA");
//
//		Term t1 = new Term("1"); 
//		SubjectRule sj1 = new JavaSubject("SJ1", "Subject 1", 2);
//		sj1.setAttendanceMark(9);
//		sj1.setMidExamMark(9);
//		sj1.setFinalExamMark(10);
//
//		SubjectRule sj2 = new OOPSubject("SJ2", "Subject 2", 3);
//		sj2.setAttendanceMark(9);
//		sj2.setMidExamMark1(8);
//		sj2.setMidExamMark2(8);
//		sj2.setFinalExamMark(10);
//
//		t1.addSubject(sj1);
//		t1.addSubject(sj2);
//
//
//		Term t2 = new Term("2"); 
//		SubjectRule sj3 = new OOPSubject("SJ3", "Subject 3", 2);
//		sj3.setAttendanceMark(7);
//		sj3.setMidExamMark1(6);
//		sj3.setMidExamMark2(9);
//		sj3.setFinalExamMark(10);
//
//		t2.addSubject(sj3);
//
//		
//		std.addTerm(t1);
//		std.addTerm(t2);
//
//		System.out.println(std);
//		System.out.println(t1);
//		System.out.println(t2);
//
//	}
//}
//
//	

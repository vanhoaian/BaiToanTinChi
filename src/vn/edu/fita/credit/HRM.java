package vn.edu.fita.credit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRM {
	private List<Human> hrList;

	public HRM() {
		hrList = new ArrayList<Human>();
	}

	public void addHR(Human human) {
		hrList.add(human);
	}

	public void addHR(Scanner sc) {
		int type;
		System.out.println("Chọn loại nhân sự (sv: 0, gv: 1)");
		type = sc.nextInt();
		sc.nextLine(); // day enter khoi bo dem
	
		Human human = null;
		if (type == 0) {
			human = new Student();
		} else
			human = new Lecturter();
	
		human.enterInfor(sc);
		addHR(human);
	}

	public void printHRList() {
		for (Human human : hrList) {
			System.out.println(human.toString());
		}
	}

	public void printLecturterInfo() {
		for (Human human : hrList) {
			if (human instanceof Lecturter) {
				System.out.println(human);
			}
		}
	}

	public void printStudentInfo() {
		for (Human human : hrList) {
			if (human instanceof Student) {
				// Student std = (Student) human;
				System.out.println(human.toString());
			}
		}
	}

	public void searchHuman(String code) {
		List<Human> humanList = new ArrayList<Human>();
		for (Human human : hrList) {
			if (human.code.contains(code)) {
				humanList.add(human);
			}
			if (human.fullname != null) {
				if (human.fullname.contains(code)) {
					humanList.add(human);
				}
			}

			if (human.address != null) {
				if (human.address.contains(code)) {
					humanList.add(human);
				}
			}
		}
		for (Human human : humanList) {
			System.out.println(human.toString());
		}
	}

	public void initDemoData() {
		Human h1 = new Student("6666", "Nguyen Van A", "CNPMA");
		Human h2 = new Lecturter("1234", "Nguyen Van B", "Hung Yen");

		addHR(h1);
		addHR(h2);
	}

	public void initDemoData(Scanner sc) {
		String type;
		do {
			addHR(sc);
			System.out.println("Ban muon nhap tiep khong (c/k): ");
			type = sc.nextLine();
		} while ("c".equalsIgnoreCase(type));
	}

//	public static void main(String[] args) {
//		HRM hrm = new HRM();
//		hrm.searchHuman("Van");
//		Scanner human = new Scanner(System.in);
//		hrm.initDemoData(human);
//	}

}

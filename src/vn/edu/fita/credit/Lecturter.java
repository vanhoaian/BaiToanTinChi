package vn.edu.fita.credit;

import java.util.Scanner;

public class Lecturter extends Human {
	private String password;
	
	public Lecturter() {
		
	}
	
	public Lecturter(String code, String password) {
		/*this.code = code;
		this.setPassword(password);*/
		
		super(code, password);
	}
	
	public Lecturter(String code, String fullname, String address) {
		/*this.code = code;
		this.fullname = fullname;
		this.address = address;*/
		
		super(code, fullname, address);
	}
	
	@Override
	public void enterInfor(Scanner sc) {
		super.enterInfor(sc);
		System.out.println("Nhập mật khẩu: ");
		setPassword(sc.nextLine());
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

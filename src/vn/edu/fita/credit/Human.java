package vn.edu.fita.credit;

import java.util.Scanner;

public class Human {
	protected String fullname;
	protected String address;
	protected String code;

	public Human() {
		
	}
	
	public Human(String code) {
		this.code = code;
	}
	
	public Human(String code, String fullname) {
		this.code = code;
		this.fullname = fullname;
	}
	
	public Human(String code, String fullname, String address) {
		this(code,fullname);
		this.address = address;
	}
	
	public void enterInfor(Scanner sc) {
		System.out.println("Nhập mã: ");
		code = sc.nextLine();
		System.out.println("Nhập họ tên: ");
		fullname = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		address = sc.nextLine();
	}
	
	public String toString() {
		return code + '-' + fullname + '-' + address;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

package com.bank.employee.api;

public class EmployeeVO {
	private String name;
	private String email;
	private int phone;
	private float balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "EmployeeVO [name=" + name + ", email=" + email + ", phone=" + phone + ", balance=" + balance + "]";
	}
	

}

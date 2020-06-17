// 이 파일의 모든 클래스는 com.example.two 패키지에 포함됩니다.
package com.example.two;

public class Person {
	
	int no; //접근지정자를 명시하지 않으면 같은 패키지에서 사용 가능
	private String name;
	private String email;
	private String phone;
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}

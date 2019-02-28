package br.com.cpelegrin.model;
public class Student {
	private String RA;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String rA, String name) {
		super();
		RA = rA;
		this.name = name;
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String rA) {
		RA = rA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
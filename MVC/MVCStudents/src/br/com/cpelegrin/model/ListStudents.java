package br.com.cpelegrin.model;

import java.util.ArrayList;

public class ListStudents {
	ArrayList<Student> list = new ArrayList<Student>();

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	
	public void addStudent(Student student) {
		this.list.add(student);
	}
	
	public Student getStudentByRa(String RA) {
		for (Student student : list) {
			if(student.getRA().equalsIgnoreCase(RA)) {
				return student;
			}
		}
		return null;
	}
}

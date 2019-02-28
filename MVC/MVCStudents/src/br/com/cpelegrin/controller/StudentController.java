package br.com.cpelegrin.controller;

import br.com.cpelegrin.model.ListStudents;
import br.com.cpelegrin.model.Student;
import br.com.cpelegrin.view.StudentView;

public class StudentController {
	private ListStudents model;
	private StudentView view;

	public StudentController(ListStudents model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public ListStudents getModel() {
		return model;
	}

	public void setModel(ListStudents model) {
		this.model = model;
	}

	public StudentView getView() {
		return view;
	}

	public void setView(StudentView view) {
		this.view = view;
	}

	public void updateView() {
		Student student = model.getStudentByRa("4");
		
		view.printStudentDetails(student.getName(), student.getRA());
	}
}
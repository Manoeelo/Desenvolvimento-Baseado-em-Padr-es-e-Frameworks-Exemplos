package br.com.cpelegrin;

import br.com.cpelegrin.controller.StudentController;
import br.com.cpelegrin.model.ListStudents;
import br.com.cpelegrin.model.Student;
import br.com.cpelegrin.view.StudentView;

public class MVCPatternDemo {
	public static void main(String[] args) {

		//fetch student record based on his roll no from the database
		ListStudents model  = populateDB();

		//Create a view : to write student details on console
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();
	}
	
	private static ListStudents populateDB() {
		ListStudents list = new ListStudents();
		list.addStudent(new Student("1", "carlos"));
		list.addStudent(new Student("2", "joão"));
		list.addStudent(new Student("3", "maria"));
		list.addStudent(new Student("4", "josé"));
		
		return list;
	}
}
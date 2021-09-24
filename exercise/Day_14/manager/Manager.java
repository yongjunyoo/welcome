package manager;

import java.util.ArrayList;

import student.Student;

public class Manager {

	private ArrayList stds = new ArrayList();

	public  void addMember(Student std) {
		this.stds.add(std);
	}
	public ArrayList getMember() {
		return stds;
	}
}

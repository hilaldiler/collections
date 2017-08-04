package tr.org.kamp.linux.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

	private String name;
	private Department  deparment;
	private String lecturerName;
	ArrayList<Student> registeredStudents = new ArrayList<>();
	
	

	public Course(String name, Department deparment, String lecturerName) {
		super();
		this.name = name;
		this.deparment = deparment;
		this.lecturerName = lecturerName;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Department getDeparment() {
		return deparment;
	}


	public void setDeparment(Department deparment) {
		this.deparment = deparment;
	}


	public String getLecturerName() {
		return lecturerName;
	}


	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}


	public ArrayList<Student> getRegisteredStudents() {
		return registeredStudents;
	}


	public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}


	public void registeredToCourse(Student student) {
		registeredToCourse(student);
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", deparment=" + deparment + ", lecturerName=" + lecturerName
				+ ", registeredStudents=" + registeredStudents + "]";
	}
	
	
	

}

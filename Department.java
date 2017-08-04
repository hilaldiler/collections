package tr.org.kamp.linux.collections;

import java.util.HashMap;

public class Department {

	private String departmentName;
	private String facultyName;
	HashMap <String,Student> students=new HashMap<>();
	
	
	
	
	public Department(String departmentName, String facultyName) {
		super();
		this.departmentName = departmentName;
		this.facultyName = facultyName;
	}
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public HashMap<String, Student> getStudents() {
		return students;
	}
	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}
	
	void addStudent(Student student) {

		students.put(student.getId(), student);
		
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", facultyName=" + facultyName + ", students="
				+ students + "]";
	}
	
	
}
	
	
	
	
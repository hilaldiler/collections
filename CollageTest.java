package tr.org.kamp.linux.collections;

public class CollageTest {

	public static void main(String[] args) {
		Student st=new Student("Hilal Diler","123000");
		Student st1=new Student("Ali Tosun","123001");
		Student st2=new Student("Eray Yldırım","123002");
		Student st3=new Student("Ülkü Çor","123003");
		
		Department department =new Department("Yazılım","Mühendislik");
		Course course=new Course ("Java Programlama",department,"Hilal Diler");
		
		department.addStudent(st);
		department.addStudent(st1);
		department.addStudent(st2);
        department.addStudent(st3);
        
        course.registeredToCourse(st);
        course.registeredToCourse(st1);
        course.registeredToCourse(st2);
        course.registeredToCourse(st3);
        
        System.out.println(department.toString());
        
        System.out.println(course.toString());


		
		
		
		
		
		
	}
}

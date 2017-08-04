package tr.org.kamp.linux.collections;

public class Student {
	
	protected String name;
	protected String id;
	public Student(String name, String id) {
		
		super();
		this.name = name;
		this.id = id;
		
	}
	
	

	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + "]";
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	

}

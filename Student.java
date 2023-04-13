package collections2;

public class Student {

	
	String name;
	String branch;
	int marks;
	public Student(String name, String branch, int marks) {
		super();
		this.name = name;
		this.branch = branch;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}

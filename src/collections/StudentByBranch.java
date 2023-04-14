
package collections;

import java.util.ArrayList;
import java.util.List;

public class StudentByBranch {

	String branch;

	int marks;

	String name;

	public StudentByBranch(String branch, int marks, String name) {
		super();
		this.branch = branch;
		this.marks = marks;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		List<StudentByBranch> stu = new ArrayList<>();}}

//		stu.add(new Student("EEE", "aditya", 90));
//		stu.add(new Student("IT", "kumar", 70));
//		stu.add(new Student("CSE", "chaitanya", 80));
//		stu.add(new Student("EEE", "karthik", 60));
//		stu.add(new Student("IT", "jyothish", 70));
//
//		stu.add(new Student("CSE", "deva", 80));
//		ArrayList<Student> al = new ArrayList<Student>();
//
//
//}

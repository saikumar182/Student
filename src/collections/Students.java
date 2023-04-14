package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java_basic.Student;



public class Students {

	String branch;

	int marks;

	String name;

	public Students(String branch, int marks, String name) {
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
		List<Student> stu = new ArrayList<>();

		stu.add(new Student("EEE", "aditya", 90));
		stu.add(new Student("IT", "kumar", 70));
		stu.add(new Student("CSE", "chaitanya", 80));
		stu.add(new Student("EEE", "karthik", 60));
		stu.add(new Student("IT", "jyothish", 70));

		stu.add(new Student("CSE", "deva", 80));
	


		  Map<String, String[]> branchType = new HashMap<>();

		
		
		for (Student student : stu) {
			String branch = student.getbranch();
			if (! branchType.containsKey(branch)) {
			//	branchType.put(branch, new ArrayList<Student>());

			}	
		     //  branchType.get(Branch).add(stu);
			
			
			String[] values= branchType.get(branch);
			double marks = Double.parseDouble(values[0]) + student.getMarks();
			String names = values[1] + student.getName() + ", ";
			branchType.put(branch, new String[] { String.valueOf(marks), names });
		}

		for (String branch : branchType.keySet()) {
//			String[] values = branchType.getBranch();
//			double avgMarks = Double.parseDouble(values[0])
//					/ stu.stream().filter(s -> s.getbranch().equals(branch)).count();
//			String studentsList = values[1].substring(0, values[1].length() - 2);
//			System.out.println("Branch: " + branch);
//			System.out.println("Average Marks: " + avgMarks);
//			System.out.println("Students: " + studentsList);
	}
		

		}

	}


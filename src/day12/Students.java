package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

	@Override
	public String toString() {
		return "Students [branch=" + branch + ", marks=" + marks + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		ArrayList<Students> stu = new ArrayList<>();

		stu.add(new Students("EEE", 90, "aditya"));
		stu.add(new Students("IT", 70, "kumar"));
		stu.add(new Students("CSE", 80, "chaitanya"));
		stu.add(new Students("EEE", 60, "karthik"));
		stu.add(new Students("IT", 70, "jyothish"));
		stu.add(new Students("CSE", 80, "deva"));

		String s1 = "EEE";
		String s2 = "IT";
	String s3 = "CSE";

		Map<String, HashMap<Double, ArrayList<String>>> map = new HashMap<>();
		ArrayList<String> name1 = new ArrayList<>();
		ArrayList<String> name2 = new ArrayList<>();
		ArrayList<String> name3 = new ArrayList<>();
		ArrayList<String> branchs = new ArrayList<>();
		Double marks1 = 0.0;
		Double marks2 = 0.0;
		Double marks3 = 0.0;
		branchs.add(s1);
		branchs.add(s2);
		branchs.add(s3);
		for (var x : stu) {

			if (s1.equalsIgnoreCase(x.getBranch())) {

				name1.add(x.getName());

				marks1 += x.getMarks();

			} else if (s2.equalsIgnoreCase(x.getBranch())) {
				name2.add(x.getName());

				marks2 += x.getMarks();
			} else {
				name3.add(x.getName());

				marks3 += x.getMarks();
			}

		}
		marks1 /= name1.size();
		marks2 /= name2.size();
		marks3 /= name3.size();

		HashMap<Double, ArrayList<String>> hashmap1 = new HashMap<>();
		HashMap<Double, ArrayList<String>> hashmap2 = new HashMap<>();
		HashMap<Double, ArrayList<String>> hashmap3 = new HashMap<>();
		hashmap1.put(marks1, name1);
		hashmap2.put(marks2, name2);
		hashmap3.put(marks3, name3);

		map.put(s1, hashmap1);
		map.put(s2, hashmap2);
		map.put(s3, hashmap3);

		System.out.println(map);
	System.out.println(map);
	}}
//	  Map<String, ArrayList<Students>>branchType = new HashMap<>();
//
//	
//		
//		for (Students student : stu) {
//			
//			String branch = student.getBranch();
//			if (! branchType.containsKey(branch)) {
//				branchType.put(branchType, new ArrayList<Students>());
//			}
//		       branchType.get(branch);
//			
//			
//			 values= branchType.get(branch);
//			double marks = Double.parseDouble(values[0]) + student.getMarks();
//			String names = values[1] + student.getName() + ", ";
//			branchType.put(branch, new String[] { String.valueOf(marks), names });
//		}
//
//		for (String branch : branchType.keySet()) {
//			String[] values = branchType.getBranch();
//			double avgMarks = Double.parseDouble(values[0])
//					/ stu.stream().filter(s -> s.getBranch().equals(branch)).count();
//			String studentsList = values[1].substring(0, values[1].length() - 2);
//			System.out.println("Branch: " + branch);
//			System.out.println("Average Marks: " + avgMarks);
//			System.out.println("Students: " + studentsList);
//		}
//	
//
//	}
//
//}

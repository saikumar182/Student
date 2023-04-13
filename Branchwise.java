package collections2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Branchwise {
	


	public static void main(String[]args) {
	Student s1 =new Student("saikumar","cse",90);
	Student s2 =new Student("kumar","EEE",98);
	Student s3 =new Student("aditya","IT",99);
	Student s4 =new Student("naidu","cse",91);
	Student s5 =new Student("jeeva","IT",95);
	Student s6 =new Student("chaitaya","EEE",96);
	Student s7 =new Student("deva","cse",98);
	Student s8 =new Student("jyothish","cse",99);
	//adding list of students
	List<Student>listOfStudents =List.of(s1,s2,s3,s4,s5,s6,s7,s8);
	
	Map<String,List<Student>> mapofStudentsbranchWise =listOfStudents.stream().collect(Collectors.groupingBy(s->s.getBranch()));
	

	for(Map.Entry<String,List<Student>>entry:mapofStudentsbranchWise.entrySet()){
		
		
		String branchName = entry.getKey();
		String studentNames ="";
		List<Student>listofStudents =entry.getValue();
	
		int sum =0;
		int totalstudents =0;
	
	
	for (Student stu :listofStudents) {
		
		studentNames =studentNames+","+stu.getName();
		
		sum =sum+stu.getMarks();
		
		totalstudents++;
	}
	double avg =sum/totalstudents;
	
	
	System.out.println("Branch Name :"+ branchName);
	System.out.println("Average:"+avg);
	System.out.println("StudentNames :"+studentNames);

	
	}	
	}

}

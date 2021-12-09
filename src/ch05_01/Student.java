package ch05_01;

public class Student {
	String dept;
	int sID;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.dept = "경영학과";
		s1.sID = 2021;
		
		System.out.println(s1.dept + " " + s1.sID);
	}
}

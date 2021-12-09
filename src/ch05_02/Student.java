package ch05_02;

public class Student {
	private String dept;
	private int sID;
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setSID(int sID) {
		this.sID = sID;
	}
	public int getSID() {
		return sID;
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setDept("경영학과");
		s1.setSID(2021);
		
		System.out.println(s1.getDept() + " " + s1.getSID());
	}
}

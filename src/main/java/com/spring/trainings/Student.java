package com.spring.trainings;

public class Student {
	
	private String sname;
	private int rollno;
	private float marks;
	private String collage;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + ", marks=" + marks + ", collage=" + collage + "]";
	}
	public Student(String sname, int rollno, float marks, String collage) {
		super();
		this.sname = sname;
		this.rollno = rollno;
		this.marks = marks;
		this.collage = collage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

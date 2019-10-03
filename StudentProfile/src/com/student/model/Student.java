package com.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Student")   //To mark this class as an entity
							//by the name of entity, the table will be created
public class Student {

	@Id 			//To set roll_no as primary key
	@GeneratedValue //To automatically generate proceeding value of roll_no
	@Column(name="RollNo") //To set column name
	private int roll_no;
	@Column(name="StudentName")
	private String student_name;
	

	@Column(name="Marks")
	private double marks;

	public Student() //default constructor
	{

	}

	//getter and setter for each field
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
}

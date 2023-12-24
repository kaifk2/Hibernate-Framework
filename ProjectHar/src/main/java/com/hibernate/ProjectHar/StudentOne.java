package com.hibernate.ProjectHar;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentOne 
{
	@Id
	int rollNo;
	String name;
	int age;
	
	@OneToOne
	Address adder;
	public StudentOne() 
	{
		
	}
	public StudentOne(int rollNo, String name, int age, Address adder) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.adder = adder;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAdder() {
		return adder;
	}
	public void setAdder(Address adder) {
		this.adder = adder;
	}

}
package com.hibernate.ProjectHar;

import java.beans.Transient;
import java.sql.Date;
import java.util.Locale.LanguageRange;

import javax.annotation.processing.Generated;
import javax.management.loading.PrivateClassLoader;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Comment;
import org.hibernate.query.criteria.internal.expression.function.LengthFunction;



@Entity 
@Table(name = "Employee")
public class Address {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	int EmployeeId;
    
    @Column(length = 50 ,name = "NAME")
    String Name;
    
   
    int Salary;
    
    @Column(length = 13)
    String DeptName;
    
    @javax.persistence.Transient  
    double Moblieno;
  
 
    
    @Lob
    Byte [] image;

	public Address(int employeeId, String name, int salary, String deptName, int moblieno, Date addedData,
			Byte[] image) {
		super();
		EmployeeId = employeeId;
		Name = name;
		Salary = salary;
		DeptName = deptName;
		Moblieno = moblieno;
		this.image = image;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	public double getMoblieno() {
		return Moblieno;
	}

	public void setMoblieno(int moblieno) {
		Moblieno = moblieno;
	}


	

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}

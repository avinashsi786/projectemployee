package com.example.projectemployee;

import javax.persistence.GeneratedValue;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int eid;
	private String eName;
	private String eManagerName;
	private double salary;
	
	
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}
	/**
	 * @param eName the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}
	/**
	 * @return the eManagerName
	 */
	public String geteManagerName() {
		return eManagerName;
	}
	/**
	 * @param eManagerName the eManagerName to set
	 */
	public void seteManagerName(String eManagerName) {
		this.eManagerName = eManagerName;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}

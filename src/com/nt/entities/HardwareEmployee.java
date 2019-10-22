package com.nt.entities;

public class HardwareEmployee extends Employee {

	private int workingHours;
	
    public HardwareEmployee(){
	
     }
	public HardwareEmployee(int id, String name, String email, Integer salary, int workingHours) {
		super(id, name, email, salary);
		this.workingHours = workingHours;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
}

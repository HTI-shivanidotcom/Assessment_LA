package com.hsbc.business;

import java.util.*;

public class Employee {
    private int id;
    private String name;
    private List<Integer> registeredTrainings;
// creating the constructor of employee
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        registeredTrainings = new ArrayList<>();
    }
    // creating the getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getRegisteredTrainings() {
        return registeredTrainings;
    }

    public void registerTraining(int trainingId) {
        registeredTrainings.add(trainingId);
    }
    // creating tostring

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", registeredTrainings=" + registeredTrainings + "]";
	}
    
}

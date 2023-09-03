package com.hsbc.business;

import java.util.*;

import com.hsbc.persistence.ConceptualTraining;
import com.hsbc.persistence.PracticalTraining;
import com.hsbc.persistence.Training;

public class TrainingSystem {
    private Map<Integer, Employee> employees;
    private Map<Integer, ConceptualTraining> conceptualTrainings;
    private Map<Integer, PracticalTraining> practicalTrainings;
// creating constructor for creation
    public TrainingSystem() {
        employees = new HashMap<>();
        conceptualTrainings = new HashMap<>();
        practicalTrainings = new HashMap<>();
    }
// createmep method
    public void createEmployee(int employeeId, String employeeName) throws Exception {
        if (employees.containsKey(employeeId)) {
            throw new Exception("Employee with ID " + employeeId + " already exists.");
        }
        employees.put(employeeId, new Employee(employeeId, employeeName));
    }
// creating createConceptualTraining method
    public void createConceptualTraining(int trainingId, String trainingName, List<Integer> skills, Date startDate, Date endDate) throws Exception {
        if (conceptualTrainings.containsKey(trainingId)) {
            throw new Exception("Training with ID " + trainingId + " already exists.");
        }
        conceptualTrainings.put(trainingId, new ConceptualTraining(trainingId, trainingName, skills, startDate, endDate));
    }
    // creating createPracticalTraining method

    public void createPracticalTraining(int trainingId, String trainingName, List<Integer> skills, Date startDate, Date endDate, int labDuration) throws Exception {
        if (practicalTrainings.containsKey(trainingId)) {
            throw new Exception("Training with ID " + trainingId + " already exists.");
        }
        practicalTrainings.put(trainingId, new PracticalTraining(trainingId, trainingName, skills, startDate, endDate, labDuration));
    }
// the below methods are used to get employees, getConceptualTrainings and getPracticalTrainings
    public Map<Integer, Employee> getEmployees() {
        return employees;
    }

    public Map<Integer, ConceptualTraining> getConceptualTrainings() {
        return conceptualTrainings;
    }

    public Map<Integer, PracticalTraining> getPracticalTrainings() {
        return practicalTrainings;
    }

    // creating registerTraining for registering
    public void registerTraining(int employeeId, int trainingId) throws Exception {
        Employee employee = employees.get(employeeId);
        if (employee == null) {
            throw new Exception("Employee not found.");
        }

        Training training = conceptualTrainings.get(trainingId);
        if (training == null) {
            training = practicalTrainings.get(trainingId);
            if (training == null) {
                throw new Exception("Training not found.");
            }
        }

        employee.registerTraining(trainingId);
    }
    // creating registerForConceptualTraining
    public void registerForConceptualTraining(int employeeId, int trainingId) throws Exception {
        Employee employee = employees.get(employeeId);
        if (employee == null) {
            throw new Exception("Employee not found.");
        }

        ConceptualTraining training = conceptualTrainings.get(trainingId);
        if (training == null) {
            throw new Exception("Conceptual Training not found.");
        }

        employee.registerTraining(trainingId);
        System.out.println("Employee " + employee.getName() + " registered for Conceptual Training: " + training.getName());
    }

    // creating registerForPracticalTraining
    public void registerForPracticalTraining(int employeeId, int trainingId) throws Exception {
        Employee employee = employees.get(employeeId);
        if (employee == null) {
            throw new Exception("Employee not found.");
        }

        PracticalTraining training = practicalTrainings.get(trainingId);
        if (training == null) {
            throw new Exception("Practical Training not found.");
        }

        employee.registerTraining(trainingId);
        System.out.println("Employee " + employee.getName() + " registered for Practical Training: " + training.getName());
    }
	
}

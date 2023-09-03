package com.hsbc.ui;

import java.util.Scanner;

import com.hsbc.business.TrainingSystem;

public class UserUI {
	
	Scanner scanner = new Scanner(System.in);

    // creating registerForConceptualTraining
public static void registerForConceptualTraining(TrainingSystem trainingSystem, int employeeId) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Available Conceptual Trainings:");
    trainingSystem.getConceptualTrainings().forEach((id, training) -> System.out.println(id + ": " + training.getName()));

    System.out.print("Enter the ID of the Conceptual Training you want to register for: ");
    int trainingId = scanner.nextInt();

    try {
        trainingSystem.registerForConceptualTraining(employeeId, trainingId);
        System.out.println("Registered for the Conceptual Training!");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

// creating registerForPracticalTraining
public static void registerForPracticalTraining(TrainingSystem trainingSystem, int employeeId) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Available Practical Trainings:");
    trainingSystem.getPracticalTrainings().forEach((id, training) -> System.out.println(id + ": " + training.getName()));

    System.out.print("Enter the ID of the Practical Training you want to register for: ");
    int trainingId = scanner.nextInt();

    try {
        trainingSystem.registerForPracticalTraining(employeeId, trainingId);
        System.out.println("Registered for the Practical Training!");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}

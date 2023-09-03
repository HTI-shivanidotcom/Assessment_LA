package com.hsbc.ui;

import java.util.*;

import com.hsbc.business.TrainingSystem;

public class MainUI {
    public static void main(String[] args) {
        TrainingSystem trainingSystem = new TrainingSystem();
        // creating the employee  and registering for courses
        System.out.println("1. CREATING AN EMPLOYEE");
    	System.out.println("2. REGISTERING FOR COURSES");
    	Scanner sc=new Scanner(System.in);
    	int choice_choose=0;
    	do {
    		System.out.println("Enter you choice");
        	
        	choice_choose=sc.nextInt();
    		
    		switch(choice_choose) {
    		case 1:
    			// case 1 for creating the employees
    			System.out.println("As we are creating the employee we require you name and id");
            	
            	System.out.println("Enter the id of emp");
            	int id=sc.nextInt();
            	System.out.println("Enter the name of the emp");
            	String name=sc.next();
                try {
					trainingSystem.createEmployee(id, name);
				} catch (Exception e) {
					e.printStackTrace();
				}
                break;
    		case 2:
    			// registerting for courses in case 2 
    			List<Integer> skillsConceptual = Arrays.asList(1, 2, 3);
    	        List<Integer> skillsPractical = Arrays.asList(4, 5, 6);
    	        try {
    	            trainingSystem.createConceptualTraining(100, "Data Science", skillsConceptual, new Date(), new Date());
    	            trainingSystem.createPracticalTraining(200, "Java Programming Lab", skillsPractical, new Date(), new Date(), 120);
    	        } catch (Exception e) {
    	            System.out.println(e.getMessage());
    	        }
    			 System.out.print("Enter your Employee ID: ");
    		        int employeeId = sc.nextInt();

    		        if (!trainingSystem.getEmployees().containsKey(employeeId)) {
    		            System.out.println("Employee not found.");
    		            return;
    		        }

    		        System.out.println("Welcome, " + trainingSystem.getEmployees().get(employeeId).getName() + "!");
    		        System.out.println("Which training do you want to register for?");
    		        System.out.println("1. Conceptual Training");
    		        System.out.println("2. Practical Training");
    		        int choice = sc.nextInt();
    		        UserUI ui=new UserUI();
    		        switch (choice) {
    		            case 1:
    		            	// method in userui
    		                ui.registerForConceptualTraining(trainingSystem, employeeId);
    		                break;

    		            case 2:
    		            	// method in userui
    		                ui.registerForPracticalTraining(trainingSystem, employeeId);
    		                break;

    		            default:
    		                System.out.println("Invalid choice.");
    		        }
    		case 3:
    			System.out.println("Exiting application");
    			System.exit(0);
    		       default:
    		    	   System.out.println("Enter valid choice");
    		    	   break;
    		    }
    		
    			
    			
    		}while(choice_choose!=3);
    		
    		
    	}

}

package a3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Main {

	static ArrayList<Student> students = new ArrayList<>();

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		while (true) {
			System.out.println("Main menu");
			System.out.println("");
			System.out.println("Select one of the following options ");
			System.out.println("");
			System.out.println("1. Add a Student ");
			System.out.println("2. Edit student grades ");
			System.out.println("3. Exit ");

			int userinput = in.nextInt();

			if (userinput == 1) {
				addStudent();

			} else if (userinput == 2) {
				editstudentGrade();
			}

			else if (userinput == 3) {
				exit();
				break;
			}

			else {
				System.out.println("Please select a valid option");
			}
		}
		
	}

	public static void addStudent() {
		System.out.println("Please enter the students name: ");
		in.nextLine();
	    String name = in.nextLine();
	    
	    System.out.println("Please enter a grade for " + name + ":");
	    int grade = in.nextInt();
	 
	    
	    try {
	    if(grade>= 0 && grade<=100) {
	    	System.out.println(grade);	
	    }
	    else {
	    	throw new InputMismatchException();
	    }
	    
		    Student s = new Student(name, grade);//create an object for student
		    students.add(s); //successfully adding the student name and grade  to the the arraylist
	     

	    }catch( InputMismatchException e) {
	    		System.out.println("Please enter a valid number");
	           in.nextLine();
	
	    	}
	    }
	    
	    
	 public static void editstudentGrade() {
	        if (students.isEmpty()) {
	            System.out.println("No students have been added to the list");
	            return;
	        }

	        while (true) {
	            System.out.println("What student would you like to enter a grade for?");

	            for (int i = 0; i < students.size(); i++) {
	                System.out.println((i + 1) + ") " + students.get(i).getname() + " - " + students.get(i).getGrade());
	            }

	            int input;
	            try {
	                input = in.nextInt();

	                if (input < 1 || input > students.size()) {
	                    throw new IndexOutOfBoundsException();
	                }

	                System.out.println("Please enter a grade for " + students.get(input - 1).getname() + ":");
	                int newgrade = in.nextInt();

	                if (newgrade < 0 || newgrade > 100) {
	                    throw new InputMismatchException();
	                }

	                students.get(input - 1).setGrade(newgrade);
	                System.out.println("Updated grade for " + students.get(input - 1).getname() + " to " + newgrade);
	                break; // exit loop after successful update

	            } catch (InputMismatchException e) {
	                System.out.println("Please enter a valid number between 0 and 100.");
	                in.nextLine(); // clear the invalid input
	            } catch (IndexOutOfBoundsException e) {
	                System.out.println("Please enter a valid number");
	                in.nextLine(); // clear the invalid input
	            }
	        }
	    }

	  

	public static void exit() {
		System.out.println("Thank you, Goodbye!");

	}
	}




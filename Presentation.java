package ui;
import java.util.*;
import business.Validation;
import business.Business;


public class Presentation {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String answer = "";
		
		do 
		{
			int studentID = checkID(sc);
			String studentName = checkName(sc);
			String emailAddress = checkEmail(sc);
			float numOfHours = checkHours(sc);
			Business student = new Business(studentID, studentName, emailAddress, numOfHours);
		    calcHours(student, numOfHours);
		    
		    System.out.print("Do you wish to continue? ");
		    answer = sc.next();
		    sc.nextLine();
		    
		}while(answer.equalsIgnoreCase("y"));
		

	} 
	
	public static int checkID(Scanner sc) 
	{
		String studentID = "";
		int min = 1000;
		int max = 9999;
		boolean errorCheck = false;
		
			do 
			{
				System.out.print("Please enter your Student ID: ");
				studentID = sc.nextLine();
				errorCheck = Validation.isInteger(studentID, "Student ID ")&&
			                Validation.isWithinRangeInteger(studentID, min, max, "Student ID ");
			}while(!errorCheck);
			
			return Integer.parseInt(studentID);
	}
	public static String checkName(Scanner sc) 
	{
		String studentName = "";
		boolean errorCheck = false;
		
			do 
			{
				System.out.print("Please enter your name: ");
				studentName = sc.nextLine();
				errorCheck = Validation.isStringPresent(studentName, "Student Name");
				
				
			}while(!errorCheck);
			
			return studentName;
	}
	public static String checkEmail(Scanner sc) 
	{
		String emailAddress = "";
		boolean errorCheck = false;
		
			do 
			{
				System.out.print("Please enter your email address: ");
				emailAddress = sc.nextLine();
				errorCheck = Validation.isStringPresent(emailAddress, "Email Address");
				
			}while(!errorCheck);
			
			return emailAddress;
	}

	public static float checkHours(Scanner sc) 
	{
		String numOfHours = "";
		double min = 3.50;
		double max = 18.00;
		boolean errorCheck = false;
		
			do 
			{
				System.out.print("Please enter the number of hours: ");
				numOfHours = sc.nextLine();
				errorCheck = Validation.isDouble(numOfHours, "Number of Hours") &&
							 Validation.isWithinRangeDouble(numOfHours, min, max, "Number of Hours");
				
			}while(!errorCheck);
				return Float.parseFloat(numOfHours);
				
	}
	public static void calcHours( Business student, float numOfHours) 
	{
		System.out.print("Name: " + student.getStudentName() + 
		"\nStudentID: " + student.getStudentID() +	
		"\nEmail Address: " + student.getEmailAddress() +
		"\nNumber of Hours: " + Validation.formatRound(Business.calcHours(numOfHours)));
	}

}

package business;

public class Business 
{
	private int studentID;
	private String studentName;
	private String emailAddress;
	private float numOfHours;
	
	public Business() 
	{
		studentID = 0;
		studentName = "";
		emailAddress = "";
		numOfHours = 0.00F; 
	}
	

 	public Business(int studentID, String studentName, String emailAddress, float numOfHours) 
 	{ 
 		this.studentID = studentID;
 		this.studentName = studentName;
 		this.emailAddress = emailAddress;
 		this.numOfHours = numOfHours;
 	}
 	
 	public void setStudentID(int studentID) 
 	{
 		this.studentID = studentID;
 	}
 	
 	public int getStudentID() 
 	{
 		return studentID;
 	}
 	
 	public void setStudentName(String studentName) 
 	{
 		this.studentName = studentName;
 	}
 	
 	public String getStudentName() 
 	{
 		return studentName;
 	}
 	
 	public void setEmailAddress(String emailAddress) 
 	{
 		this.emailAddress = emailAddress;
 	}
 	
 	public String getEmailAddress() 
 	{
 		return emailAddress;
 	}
 	
 	public static float calcHours(float numOfHours) 
 	{
 		return numOfHours * 60.50F;
 	}
 	
}
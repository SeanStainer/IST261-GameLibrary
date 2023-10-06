package Model;

//super class
public class Developers
{
	//stores information on the developers of the game
	public String jobTitle;
	public String firstName;
	public String lastName;

	
	//default constructor
	public Developers()
	{
		//initialize each variable
		this.jobTitle = "";
		this.firstName = "";
		this.lastName = "";

	}
	
	//constructor overload
	public Developers(String jobTitle, String firstName, String lastName)
	{
		//initialize variables based on parameters passed
		this.jobTitle = jobTitle;
		this.firstName = firstName;
		this.lastName = lastName;
	}
		
	//getter and setter methods
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	//to string method to display all information within class
	@Override
	public String toString()
	{
		return "\n\tJob Title: " + this.getJobTitle() 
			 + "\n\tFirst Name: " + this.getFirstName() 
			 + "\n\tLast Name: " + this.getLastName() + "\n";
	}	
		
}
	
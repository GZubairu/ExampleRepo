package week1;

public class Person {

	// Fields
	private String Name;
	private int Age;
	private String JobTitle;

	// Constructors
	public Person(String name, int age, String jobTitle) {
		this.Name = name;
		this.Age = age;
		this.JobTitle = jobTitle;
	}

	//Methods
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.JobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + ", JobTitle=" + JobTitle + "]";
	}
	
	

}

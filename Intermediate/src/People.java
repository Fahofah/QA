
public class People {
	 public String name;
	 public int age;
	 public String jobTitle;

	
	public People(String name,int age, String jobTitle){
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		return "Name: " + name + " \n" + "Age: " + age + " \n" + "Job Title: " + jobTitle + "\n\n";
	}
}

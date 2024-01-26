package task10;
import java.util.Scanner;
public class Person {

	// Storing the age as integers
	private int age; 
	//Storing the name as string
	private String name;

	// Parameterized constructor is used and memory is allocated
	public Person(String name,int age)
	{
	this.name = name;
	this.age = age;
	}
	//getter method is used
	public String getname()
	{
	return name;
	}
	public int getage()//getter method is used
	{
		return age;
	}

		public static void main(String[] args) 
		
	{
		//Getting the object during runtime
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		//getting name using scanner
		String name = sc.next();
		System.out.println("Enter the age");
		//getting age using scanner
		int age = sc.nextInt();
		
	}

}

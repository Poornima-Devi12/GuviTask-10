package task10;
import java.util.Scanner;

public class Tea { // Here tea refers to the class name
	public void preparetea()//method of class tea
	 {
		System.out.println("Preparetea- that prepares a basic tea with hot water and leaves");
	 }
	 public void addmilk()//method of class tea
	 {
		 System.out.println("addmilk- to add milk to the basic tea");
	 }
	 public void addsugar()//method of class tea
	 {

		System.out.println("addsugar- to add sugar to the basic tea");
	 }
	 public void add() //A class that has array of tea has this function to show polymorphism
	 {
			
		return;	
	}


	public static void main(String[] args)
	{
		Tea obj=new Tea();//object is created for the class 
		System.out.println("Print the statement given inside the methods:");//Printing the statement
		obj.preparetea();//methods of class are called using the objects//
		obj.addmilk();
		obj.addsugar();
			
	}
}

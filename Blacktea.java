package task10;

public class Blacktea extends Tea {
	
	public void preparetea()//prepareTea is overridden method
	{
		System.out.println("A method to prepare blacktea with water and tea leaves");
		
	}
}
class Greentea extends Tea// Greentea is a subclass of class Tea
{
	public void preparetea() //prepareTea is overridden method
	{
		System.out.println("A method to prepare greentea with water and green leaves");
		
	} 
}
class Herbaltea extends Tea//Herbaltea is a subclass of class Tea
{
	public void preparetea()//prepareTea is overridden method	
	{
		System.out.println("A method to prepare Herbaltea with water and dried herbs");
		
	}
}

 
public class Override {

	public static void main(String[] args) 
	{
		Blacktea obj=new Blacktea();//object for subclass is created
		obj.preparetea();
		Greentea gt=new Greentea();//object for subclass is created
		gt.preparetea();
		Herbaltea ht=new Herbaltea();//object for subclass is created
		ht.preparetea();
	}
}

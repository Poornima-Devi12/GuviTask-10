package task10;

public class Arraytea {

	public Arraytea() {
		// TODO Auto-generated constructor stub
		//instances for tea class and subclass is created
		Tea[] obj = new Tea[4];
        obj[0] = new Tea();
		obj[0].preparetea();
		obj[1] = new Blacktea();
		obj[1].preparetea();
		obj[2] = new Greentea();
		obj[2].preparetea();
		obj[3] = new Herbaltea();
		obj[3].preparetea();
		
		
		

	}
}
	

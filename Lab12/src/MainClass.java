
public class MainClass 
{
	public static void main(String[] args) 
	{
		Add_Matrices obj = new Add_Matrices();
		obj.create();
		obj.display();
		long preTime = System.currentTimeMillis();
		obj.add();
		long postTime = System.currentTimeMillis();
		
		System.out.println("Time taken by the program : " + (postTime - preTime)+"ms");

	}

}

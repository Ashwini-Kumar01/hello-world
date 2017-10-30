
public class Comparison {

	public static void main(String[] args) {
		int i=30;
		int j=90;
		int k=70;
		if(i<j | i<k)
		{
			if(j>k)
			{
				System.out.println("J is the greatest:"+j);
			}
			else
			{
				System.out.println("K is the greatest:"+k);
			}
		}
		else
		{
		System.out.println("I is the greatest:"+i);	
		}
	}
	
	public static void test()
	{
		System.out.println("Test");
	}

}

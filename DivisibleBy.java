
public class DivisibleBy {

	public static void main(String[] args) {
		for (int i=1;i<=100;i++)
		{
			int j=i % 5;
			if (j == 0)
			{
				System.out.println("Number is divisible by 5:"+i);
			}
			else
			{
				System.out.println(i);
			}
		}

	}
}

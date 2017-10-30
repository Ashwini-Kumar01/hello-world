
public class ArraySort {

	public static void main(String[] args) 
	{
	int arr[]={1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
	int arr1[]={1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
	int m=0;
	int f=0;
	int h=0;
	int l=0;
	
	//Print original Array
	System.out.println("Original Array :");
	for (int c=0;c<arr.length;c++)
	{
		System.out.print(arr[c]+" ");
	}
	System.out.println();
	
	//Sort the Array
	System.out.println("Sorted Array :");
	for (int a=0;a<arr1.length;a++)
	{
		for (int b=a+1;b<arr1.length;b++)
		{
			if (arr1[a]>arr1[b])
			{
				m=arr1[b];
				arr1[b]=arr1[a];
				arr1[a]=m;
							}
		}
		m=0;
		System.out.print(arr1[a]+" ");
		
	}
	System.out.println();
	
//Find Greatest and smallest Number	
System.out.println("Greatest Number is :"+arr1[arr1.length-1]);
System.out.println("Smallest Number is :"+arr1[0]);

// Find Unique elements in array

for(int d=0;d<arr1.length;d++)
{
	for (int e=d+1;e<arr1.length;e++)
	{
		if (arr1[d]==arr1[e])
		{
			arr1[e]=0;
		}
	}
	System.out.print(arr1[d]+" ");
	if (arr1[d]!=0)
	{
	f=f+1;
	}
}
System.out.println();
System.out.println("Total Number of unique elements :"+f);

// Create Array with unique elements only
int arr2[]=new int[f];
for (int g=0;g<arr1.length;g++)
{
		if (arr1[g]!=0)
		{
			arr2[h]=arr1[g];
			h=h+1;
		}
		
	}
System.out.println("Array with unique elements :");
for (int i=0;i<arr2.length;i++)
{
	System.out.print(arr2[i]+" ");
}
System.out.println();

//compare with original Array 
for (int j=0;j<arr2.length;j++)
{
	for (int k=0;k<arr.length;k++)
	{
		if (arr2[j]==arr[k])
		{
			l=l+1;
		}
	}
	System.out.println(arr2[j]+ " is repeated "+ l+ " times");
	l=0;
}
	}

}

import java.util.Scanner;
class FindMinMax
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements to work with: ");
	int m=sc.nextInt();
	int[] arr =new int[m];
	System.out.println("Enter Elements ");
	for(int i=0;i<10;i++)
	{
	  arr[i]=sc.nextInt();
	}
	//find maximum
	int max=arr[0];
	for(int i=0;i<10;i++)
	{
	  if(max<arr[i])
	  {
	    max=arr[i];
	  }
	}
	//find minimum
	int min=arr[0];
	for(int i=0;i<10;i++)
	{
	  if(min>arr[i])
	  {
	    min=arr[i];
	  }
	}
	System.out.println("maximum no is: "+max);
	System.out.println("minimum no is: "+min);
  }
}

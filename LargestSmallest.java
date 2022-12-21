import java.util.Scanner;
class LargestSmallest
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int reap = 10, secondSmallest=0, secondLargest=0;
		int[] arr = new int[reap];
		System.out.println("Enter values : ");
		for(int i=0; i<reap; i++)
		{
			arr[i] = s.nextInt();
		}
		int temp;
		for(int m=0; m<reap; m++)
		{
			for(int n=m; n<reap; n++)
			{
				if(arr[m]>arr[n])
				{
					temp = arr[m];
					arr[m] = arr[n];
					arr[n] = temp;
				}
			}
		}
		if(arr[0] != arr[9])
		{
			for(int a =1;a<9;a++)
			{
				if(arr[0]<arr[a])
				{
					secondSmallest = arr[a];
					break;
				}
			}
			for(int z = 8; z>1; z--)
			{
				if (arr[9]>arr[z])
				{
					secondLargest = arr[z];
					break;
				}
			}
		}
		else
		{
			System.out.println("All number are same...");
		}
		System.out.println("Second Smallest Number is : " +secondSmallest);
		System.out.println("Second Largest number is : " +secondLargest);
	s.close();
	}
}
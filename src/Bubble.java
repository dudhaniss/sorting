
public class Bubble {
	
	public void sortA (int [] arr)
	{
		System.out.println("*******Bubble sort*******");
		//For each pass 
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int x= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = x;
				}
			}
		}
	}
	
	public void sortD (int [] arr)
	{
		System.out.println("*******Bubble sort*******");
		//For each pass 
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j] < arr[j+1])
				{
					int x= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = x;
				}
			}
		}
	}
}

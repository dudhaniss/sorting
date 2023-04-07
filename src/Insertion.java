
public class Insertion {
	
	public void sortA (int [] arr)
	{
		System.out.println("*******Insertion Sort*******");
		
		for(int i=1; i<arr.length; i++)
		{
			int tmp=arr[i];
			
			int j=i-1;
			for(; j>=0; j--)
			{
				if(tmp > arr[j])
					break;
				else
					arr[j+1] = arr[j];
			}
			arr[j+1] = tmp;
		}
	}
	
	public void sortD(int [] arr)
	{
		System.out.println("*******Insertion Sort*******");
		
		for(int i=1; i<arr.length; i++)
		{
			int tmp=arr[i];
			
			int j=i-1;
			for(; j>=0; j--)
			{
				if(tmp < arr[j])
					break;
				else
					arr[j+1] = arr[j];
			}
			arr[j+1] = tmp;
		}
	}
	
}

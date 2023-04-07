
public class Selection {
	
	public void sortA (int [] arr)
	{
		System.out.println("*******Selection sort*******");
		//For each pass 
		for(int i=0; i<arr.length-1; i++)
		{
			int tmp=arr[i];
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] < tmp)
				{
					int x= tmp;
					tmp=arr[j];
					arr[j]=x;
				}
			}
			//we have the smallest element in tmp..
			arr[i] = tmp;			
		}
	}
	
	public void sortD (int [] arr)
	{
		System.out.println("*******Selection sort*******");
		//For each pass 
		for(int i=0; i<arr.length-1; i++)
		{
			int tmp=arr[i];
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] > tmp)
				{
					int x= tmp;
					tmp=arr[j];
					arr[j]=x;
				}
			}
			//we have the smallest element in tmp..
			arr[i] = tmp;			
		}
	}
}

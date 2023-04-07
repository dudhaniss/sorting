
public class ShellSort {
	
	public void sortA (int [] arr)
	{
		System.out.println("*******Shell Sort*******");
		int n = arr.length;
		int gap = n/2;
		
		for( ; gap>0; gap/=2)
		{
			for(int i=gap; i<n; i++)
			{
				int tmp = arr[i];
				
				int j = i;
				for(; j >= gap && tmp < arr[j - gap] ; j -= gap)
				{
					arr[j] = arr[j-gap];
				}
				
				arr[j]=tmp;
			}
		}		
	}
	
	public void sortD(int [] arr)
	{
		System.out.println("*******Shell Sort*******");
		int n = arr.length;
				
		for(int gap = n/2 ; gap>0; gap/=2)
		{
			for(int i=gap; i<n; i++)
			{
				int tmp = arr[i];
				
				int j = i;
				for(; j >= gap && arr[j - gap] < tmp ; j -= gap)
				{
					arr[j] = arr[j - gap];
				}
				
				arr[j]=tmp;
			}
		}
	}
	
}

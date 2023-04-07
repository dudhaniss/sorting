
public class QuickSort {
	
	void quicksort(int [] arr, int low, int high, boolean asending)
	{
		if(low < high)
		{
			int m = partition(arr, low, high, asending);
			quicksort(arr, low, m-1, asending);
			quicksort(arr, m+1, high, asending);
		}
	}
	
	int partition(int [] arr, int low, int high, boolean asending)
	{
		int p=arr[high];
		int i=low-1;
		
		
		for(int j=low; j<high; j++)
		{
			if(asending == true)
			{
				if(arr[j] < p)
				{
					i++;
					
					int x=arr[i];
					arr[i]= arr[j];
					arr[j]=x;
				}
			}
			else
			{
				if(arr[j] > p)
				{
					i++;
					
					int x=arr[i];
					arr[i]= arr[j];
					arr[j]=x;
				}
			}
			
		}	
		i++;
		int x= arr[i];
		arr[i]= arr[high];
		arr[high] = x;
		
		return i;
	}
	
	public void sortA (int [] arr)
	{
		System.out.println("*******Quick sort*******");
		quicksort(arr, 0, arr.length-1, true);		
	}
	
	public void sortD (int [] arr)
	{
		System.out.println("*******Quick sort*******");
		quicksort(arr, 0, arr.length-1, false);
	}
}

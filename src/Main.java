
public class Main {

	public static void main(String[] args) {
		
		//int [] arr = new int[] {10,25,7,9,2,45,37};
		
		int [] arr = new int[] {45, 7, 9, 9, 25, 25, 2};

		printArray(arr);
		ShellSort shellSort = new ShellSort();
		shellSort.sortD(arr);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
}

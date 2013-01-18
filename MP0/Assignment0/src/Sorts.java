
public class Sorts
{
	/* Checks in linear time if array is sorted
	 * 
	 * @param - int array
	 * @return - true if sorted, else false
	 */
	public static boolean isSorted(int arr[])
	{
		boolean rv=true;
		
		
		for(int x=0; x<arr.length-1; x++)
		{
			if(arr[x]>arr[x+1])
			{
				rv=false;
			}
		}
		
		
		return rv;
	}
	
	/* Swaps elements at specified indices
	 * 
	 * @param - int array and the 2 indices
	 * @return - elements at those indices are swapped
	 */
	private static void swap(int[] arr, int index1, int index2)
	{
		int temp;
		temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	
	
	/* Implementation of quick sort.
	 * 
	 * @param - int array, starting index, and ending index. index's are primarily
	 * 			used for recursive calls
	 * @return - sent array is sorted
	 */
	public static void quicksort(int arr[], int start, int end)
	{
		if(start<end)
		{
			int pivot=(end-start)/2+start;
			int i=start;
			int k=end;

			swap(arr, i, pivot);
			i++;
			
			
			while(i<k)
			{
				while(i<=k && arr[i]<=arr[start])
				{
					i++;
				}
				while(i<=k && arr[k]>arr[start])
				{
					k--;
				}
				
				if(i<k)
				{
					swap(arr, i, k);
				}
			}
						
			
			swap(arr, start, k);
			
			quicksort(arr, start, k-1);
			quicksort(arr, k+1, end);
		}
		
		
		return;
	}
	
	/* Implementation of bubble sort.
	 * 
	 * @param - int array
	 * @return - sent array is sorted
	 */
	public static void bubbleSort(int arr[])
	{
		boolean swapMade=true;
		int index1=0;
		
		
		while(swapMade)			//if swap isn't made, then 
		{						//remaining elements are in order
			swapMade=false;
			for(int index2=0; index2<arr.length-index1-1; index2++)
			{
				if(arr[index2]>arr[index2+1])
				{
					swap(arr, index2, index2+1);
					swapMade=true;
				}
			}
			
			index1++;
		}
		
		
		return;
	}
	
	/* Implementation of selection sort.
	 * 
	 * @param - int array
	 * @return - sent array is sorted
	 */
	public static void selectionSort(int arr[])
	{
		int minIndex;	//created here to avoid unnecessary recreation each
							//iteration of loop		
		
		for(int index1=0; index1<arr.length; index1++)
		{
			minIndex=index1;
			for(int index2=index1; index2<arr.length; index2++)
			{
				if(arr[minIndex]>arr[index2])
				{
					minIndex=index2;
				}
			}
			swap(arr, minIndex, index1);
		}
	}
	
	
}

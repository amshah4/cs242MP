
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
		
		
		return;
	}
	
	
	/* Implementation of quick sort.
	 * 
	 * @param - int array, starting index, and ending index. index's are primarily
	 * 			used for recursive calls
	 * @return - sent array is sorted
	 */
	public static void quickSort(int arr[], int start, int end)
	{
		if(start<end)
		{
			int pivot=(end-start)/2+start;
			int i=start;
			int k=end;

			swap(arr, i, pivot);
			i++;
			
			
			while(i<=k)
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
			
			quickSort(arr, start, k-1);
			quickSort(arr, k+1, end);
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
		
		
		return;
	}
	
	/* Merge Sort
	 * 
	 * @param - int array, starting index, and ending index. index's are primarily
	 * 			used for recursive calls
	 * @return - sent array is sorted
	 */
	public static void mergeSort(int arr[], int start, int end)
	{
		if(start<end)
		{
			int midIndex=(end-start)/2+start;
			mergeSort(arr, start, midIndex);
			mergeSort(arr, midIndex+1, end);
			
			merge(arr, start, midIndex, end);			
		}
		
		
		return;
	}
	
	private static void merge(int arr[], int start1, int end1, int end2)
	{
		int start2=end1+1;
		int start1Dup=start1;
		int sorted[]=new int[end2-start1+1];
		int index=0;
		
		
		while(start1<end1 && start2<end2)
		{
			if(arr[start1]<arr[start2])
			{
				sorted[index]=arr[start1];
				start1++;
			}
			else
			{
				sorted[index]=arr[start2];
				start2++;
			}
			index++;
		}
		
		while(start1<end1)
		{
			sorted[index]=arr[start1];
			start1++;
			index++;
		}
		while(start2<end2)
		{
			sorted[index]=arr[start2];
			start2++;
			index++;
		}
		
		for(int ind=start1Dup; ind<end2; ind++)
		{
			arr[ind]=sorted[ind-start1Dup];
		}
		
		
		return;
	}
}

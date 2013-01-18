
public class MergeSortThread extends Thread
{
	private int arr[];
	
	
	//CONSTRUCTORS
	public MergeSortThread(int[] unsortedArr)
	{
		super();
		arr=unsortedArr;
	}
	
	
	public void run()
	{
		Sorts.mergeSort(arr, 0, arr.length-1);
		Main.println("MERGE IS DONE!");
		return;
	}
}

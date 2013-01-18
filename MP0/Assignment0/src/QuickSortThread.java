
public class QuickSortThread extends Thread
{
	private int arr[];
	
	
	//CONSTRUCTORS
	public QuickSortThread(int[] unsortedArr)
	{
		super();
		arr=unsortedArr;
	}
	
	
	public void run()
	{
		Sorts.quickSort(arr, 0, arr.length-1);
		Main.println("QUICK IS DONE!");
		return;
	}
}

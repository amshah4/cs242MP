
public class SelectionSortThread extends Thread
{
	private int arr[];
	
	
	//CONSTRUCTORS
	public SelectionSortThread(int[] unsortedArr)
	{
		super();
		arr=unsortedArr;
	}
	
	
	public void run()
	{
		Sorts.selectionSort(arr);
		Main.println("SELECTION IS DONE!");
		return;
	}
}

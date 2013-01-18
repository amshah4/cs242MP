
public class BubbleSortThread extends Thread
{
	private int arr[];
	
	
	//CONSTRUCTORS
	public BubbleSortThread(int[] ar)
	{
		super();
		arr=ar;
	}
	
	
	public void run()
	{
		Sorts.bubbleSort(arr);
		Main.println("BUBBLE IS DONE!");
		return;
	}
}

/************************************************************************************
 * Ankoor Shah
 * CS 242
 * This program uses threads to simultaneously run sorts, and then print out times
 * in the approximate order that they finish.
 ************************************************************************************/
public class Main
{
	private static final int NUM_VALUES=10000;
	
	
	public static void main(String args[])
	{	
		int values1[]=new int[NUM_VALUES];
		int values2[]=new int[NUM_VALUES];
		int values3[]=new int[NUM_VALUES];
		int values4[]=new int[NUM_VALUES];
		for(int index=0; index<NUM_VALUES; index++)
		{
			int randVal=(int) (Math.random()*9+1);	//random 1...10 
			values1[index]=randVal;
			values2[index]=randVal;
			values3[index]=randVal;
			values4[index]=randVal;
		}
		
		BubbleSortThread t1=new BubbleSortThread(values1);
		SelectionSortThread t2=new SelectionSortThread(values2);
		MergeSortThread t3=new MergeSortThread(values3);
		QuickSortThread t4=new QuickSortThread(values4);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		return;
	}


/* Thread-safe way of printing
 * 
 * @param - String
 * @return - mesage printed to System.out
 */
	public synchronized static void println(String message)
	{
		System.out.println(message);
		
		
		return;
	}
}
/**
 * Quick sort is MOST efficient , there efficieny is AVG : O(Log.n)   
 *             it follow Divide & Conquer approach  
 * algorithm : step1 - first value consist as Pivot element ,  
 *                     Pivot element compare from RIGHT to LEFT side,  
 *                          if value smaller than Pivot - exchange it
 *            
 *             step2 - after exchanging Pivot element , divide array into two part (skip pivot element)
 *                          left : first is left element ,last is MID-1
 *                          right: first is MID+1        ,last is End element
 *                     for left and right sub-array follow step-1
 *             step3 - follow step-2 until sub-array contain only one element
 *             step4 - once each array contain only one element, add all element in array as resultant array
 *  *  NO-require extra memory
 * */
import java.util.*;
class QuickSort
{
    public static void swap(int[] arr, int x, int y) 
    {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static int[] quickSort(int[] arr, int left, int right) 
    {
		// 0. if partition has single element or invalid partition, return.
		if(left >= right)
			return new int[]{-1};
		// consider left element as pivot -- arr[left]
		int i=left, j=right;
		while(i < j) {
			// 1. from left (i-index) find element greater than pivot.
			while(i <= right && arr[i] <= arr[left])
				i++;
			// 2. from right (j-index) find element less than or equal to pivot.
			while(arr[j] > arr[left])
				j--;
			// 3. if i less than j, swap ith element with jth element
			if(i < j)
				swap(arr, i, j);
		} // 4. repeat steps 1-3, till i < j
		// 5. swap jth element with pivot element
		swap(arr, j, left);
		// 6. apply quick sort to left partition - left to j-1
		quickSort(arr, left, j-1);
		// 7. apply quick sort to right partition - j+1 to right
		quickSort(arr, j+1, right);
        return arr;
	}    

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int arr[] = new int[sc.nextInt()];         //size 
        System.out.println("enter "+arr.length+" values :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("after selection sort :");
        System.out.println(Arrays.toString(arr));

        System.out.println("after selection sort :");
        arr = quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
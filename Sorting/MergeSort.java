/**
 * Merge sort is efficient , there efficieny is TIME : O(Log.n) , SPACE : O(n)         (efficiency less than Quick)  
 *             it follow Divide & Conquer approach  
 * algorithm : step1 - 1) (zero index + last index)/2 is MID , 
 *                     2) divide list into two part 
 *                         a) left : first is zero index ,  last is MID
 *                         b) right: first is MID+1,        last is last index  
 *             step2 - follow step-1 until sub-array contain single element 
 *             step3 - take two sub-array , sort if possible  , and merge as a single array
 *             step4 - follow step-3 until reaching combine all array to become single array
 *  * required Extra Memory space
 * */
import java.util.*;
class MergeSort
{
    public static int[] mergeSort(int arr[],int left,int right)
    {
        // if partition is invalid or have single element, then return
		if(left >= right)
			return new int[]{-1};
		// divide array in two equal partitions
		int mid = (left + right) / 2;
		// sort left partition [left to mid]
		mergeSort(arr, left, mid);
		// sort right partition [mid+1 to right]
		mergeSort(arr, mid+1, right);
		// create temp array to accomodate both partitions
		int[] temp = new int[right - left + 1];
		// merge two sorted partitions into temp array
		int i = left, j = mid+1, k = 0;
		// compare elements from both partitions and copy the smaller one 
		// (until any one partition is done)
		while(i <= mid && j <= right) {
			if(arr[i] < arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}
		// copy remaining elements from other partition
		while(i <= mid)
			temp[k++] = arr[i++];
		while(j <= right)
			temp[k++] = arr[j++];
		// overwrite temp array back to original array
		for(i = 0; i < temp.length; i++)
			arr[left + i] = temp[i];
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
        
        System.out.println("before sort :");
        System.out.println(Arrays.toString(arr));

        System.out.println("after Merge sort :");
        arr = mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

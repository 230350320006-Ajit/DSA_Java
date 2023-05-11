/**
 * Insertion sort is efficient for smaller size array , there AVG. efficieny is O(n^2)    same as bubble sort (Best,Avg,Worst)
 * algorithm : itr1 - (first element compare with zero), (then second with first, first with zero), (third with second, second with first, first wit zero), so on.......
 *             itrN -  
 * element sorted from LEFT to RIGHT side
 * */
import java.util.*;
class InsertionSort
{
    public static int[] insertion(int arr[])
    {
        for(int i=1;i<arr.length;i++)            // start with 1 upto n
        {
            for(int j=0;j<i;j++)               // start with 0 upto i-1
            {
                if(arr[i]<arr[j])             // 0th > 1th
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionEfficient(int arr[])
    {
        for(int i=1;i<arr.length;i++)             // n-1 passes: in each pass consider ith element as last element of array
        {
            int j,temp = arr[i];                  // copy last element into temp var
            for(j=i-1; j>=0 && arr[j]> temp; j--) // compare temp will all elements before that, find appropriate position for the element and insert temp at that position
            {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
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
      //  arr = insertion(arr);
        arr = insertionEfficient(arr);
        System.out.println(Arrays.toString(arr));
    }
}
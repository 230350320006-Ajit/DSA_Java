/**
 * Bubble sort is little efficient Selection sort in Best-case , there AVG. efficieny is O(n^2)
 * algorithm : itr1 - first element compare with second, then second with third, third with fourth so on.......
 *             itr2 - first element compare with second, then second with third, third with fourth so on.......
 *             itrN - Consecutive comparsion 
 * element sorted from RIGHT to LEFT side
 * */
import java.util.*;
class BubbleSort
{
    public static int[] bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)              // for iterations
        {                                            // 
            for(int j=0;j<arr.length-1;j++)          // start with 0 upto n-1
            {
                if(arr[j]>arr[j+1])                  // first comapre with second , ....
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleEfficient(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swapflag = false;
            for(int j=0;j<arr.length-1;j++)
            {
               if(arr[j]>arr[j+1])                  // first comapre with second , ....
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapflag=true;
                } 
            }
            if(!swapflag)
            break;
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
        arr = bubble(arr);
     //   arr = bubbleEfficient(arr);
        System.out.println(Arrays.toString(arr));
    }
}
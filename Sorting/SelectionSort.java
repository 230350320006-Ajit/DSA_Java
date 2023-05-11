/**
 * selection sort is not efficient , there efficieny is O(n^2)
 * algorithm : itr1 - first element compare with second, then third, then fourth so on.......
 *             itr2 - second element compare with third, then fourth, so on .......
 *             upto (n-1) iterations
 * element sorted from LEFT to RIGHT side
 * */
import java.util.*;
class SelectionSort
{
    public static int[] selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)       //start with 0 upto 8 
        {
            for(int j=i+1;j<arr.length;j++)   //start with i+1 (cause left value is alredy sorted) , upto
            {
                if(arr[i]>arr[j])
                {
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem; 
                }
            }
        }
        return arr;
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int arr[] = new int[sc.nextInt()];         //size 10
        System.out.println("enter "+arr.length+" values :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("after selection sort :");
        System.out.println(Arrays.toString(arr));

        System.out.println("after selection sort :");
        arr = selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}


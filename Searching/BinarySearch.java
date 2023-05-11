class BinarySearch    //for performing binary search , list should be sorted
{
    public static int binarySear(int arr[],int value)
    {
        int left=0;
        int right=arr.length-1;
        int mid;
        while(left<=right)
        {
        mid=(left+right)/2;
            if(arr[mid]==value)
                return mid;
            else if(arr[mid]<value)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
    public static int recursiveBinary(int arr[],int left,int right,int key)
    {
        if(left>right)
        return -1;
        
        int mid=(left+right)/2,index;
        if(arr[mid]==key)
            return mid;
        else if(arr[mid]<key)
            index=recursiveBinary(arr,(mid+1),right,key);
        else
            index = recursiveBinary(arr,left,(mid-1),key);
        return index;
    }
    public static void main(String arg[])
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter size of array :");
        int []arr=new int[sc.nextInt()];
        
        System.out.println("enter values in sorted order");
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        
        java.util.Arrays.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));

        System.out.println("enter value for search");
//        System.out.println("value found at :"+binarySear(arr,sc.nextInt()));
        System.out.println("value found at :"+recursiveBinary(arr,0,arr.length-1,sc.nextInt()));
    }
}
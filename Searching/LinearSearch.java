class LinearSearch
{
    static int pos;
    static boolean flag;
    public static void Linear(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                pos=i;
                flag=true;
                break;
            }

        }
    }
    public static void main(String args[])
    {
       java.util.Scanner sc=new java.util.Scanner(System.in);

       System.out.println("enter the size of array :");
       int arr[]=new int[sc.nextInt()];
       System.out.println("enter "+arr.length+" values :");
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=sc.nextInt();
       }
       System.out.println(java.util.Arrays.toString(arr));
       
       System.out.println("enter value to search :");
       Linear(arr,sc.nextInt());
       if(flag==true)
       System.out.println("fount at :"+pos);
       else
       System.out.println("not found");
      
    }
}
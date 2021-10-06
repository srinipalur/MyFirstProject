public class SelectionSort
{
    public static void main(String[] args)
    {
        int arr[]={6,2,478,245,1,4,25,1,34,2,5};

        for(int i=arr.length;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                int temp;
                if(arr[i-1]<arr[j])
                {
                    temp=arr[i-1];
                    arr[i-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i:arr)
            System.out.println(i);
    }
}

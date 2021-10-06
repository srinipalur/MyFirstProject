public class QuickSort
{
    public static void main(String[] args)
    {
        int arr[]= {6,2,478,245,1,4,25,34,2,5};
        System.out.print("Initial array: ");
        for(int k: arr) System.out.print(k+" ");

        qSort(arr,0,arr.length-1);

        System.out.print("\nFinal array: ");
        for(int k: arr) System.out.print(k+" ");
    }

    public static void qSort(int numbers[],int left, int right)
    {
        int comparand = numbers[(left + right) / 2];
        int i=left;
        int j=right;

        if((left+1)==right && numbers[left] <= numbers[right])
            return;

        while(i<j)
        {
            while(numbers[i] < comparand && i < right) i++;
            while(numbers[j] > comparand && j > left) j--;

            int temp=numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=temp;
        }
        if(i < right)
            qSort(numbers, i+1, right);
        if(j > left)
            qSort(numbers, left, j-1);
    }
}
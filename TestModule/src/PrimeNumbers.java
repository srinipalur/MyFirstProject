public class PrimeNumbers {
    public static void main(String[] args) {
        int count,prime_sum=1;
        for(int i=3;i<100;i+=2)
        {
            count=0;
            for(int j=3;j<=i/2;j++){
                if(i%j==0)
                    count++;
            }
            if(count==0) {
                System.out.println(i);
                prime_sum++;
            }
        }
        System.out.println(prime_sum);
    }
}
import java.io.*;
import java.lang.String;
//[2021-07-19] Challenge #399 [Easy] Letter value sum
public class LetterValueSum {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter word:");
        String str = br.readLine();

        int sum=0;
        for(int i=0;i<str.length();i++)
            sum+=(int)str.charAt(i) - 96;
        System.out.println("Sum of letters: "+sum);
    }
}

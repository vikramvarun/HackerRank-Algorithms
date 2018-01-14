import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
    static int migratoryBirds(int n, int[] ar) 
    {
        int [] type = new int[5];
        for(int type_i = 0; type_i < 5; type_i++)
            type[type_i] = 0;
        for(int ar_j = 0; ar_j < n; ar_j++) 
        {
            int position = ar[ar_j] - 1;
            type[position] += 1;
        }
        int maxIndex = 0;
        for(int type_j = 1; type_j < 5; type_j++) 
        {
            if (type[type_j] > type[maxIndex])
                maxIndex = type_j;
        }
        int result = maxIndex + 1;
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++)
            ar[ar_i] = in.nextInt();
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}

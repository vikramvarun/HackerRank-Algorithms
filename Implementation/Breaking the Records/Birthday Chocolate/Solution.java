import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt(); }
        int d = in.nextInt();
        int m = in.nextInt();
        in.close();
        int result = 0;
        for(int s_j=0; s_j <= n-m; s_j++)
        {
            int count = s[s_j];
            for(int s_k=1; s_k < m; s_k++)
                count = count + s[s_j + s_k];
            if (count == d)
                result+=1;
        }
        System.out.println(result);
    }
}

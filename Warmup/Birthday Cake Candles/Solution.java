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
        int height_max = 0;
        int count = 0;
        int height_curr = 0;
        int height[] = new int[n];
        
        for(int height_i=0; height_i < n; height_i++)
        {
            height[height_i] = in.nextInt();
            height_curr = height[height_i];
            if (height_curr > height_max)
                count = 1;
            else if (height_curr == height_max)
              count += 1;
            height_max = Math.max(height_max, height_curr);
        }
        System.out.print(count);
     }
}

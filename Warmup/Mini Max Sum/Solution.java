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
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong(); 
        long sum = a + b + c + d + e; 
        long min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        long max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
        System.out.print(sum-max + " ");
        System.out.print(sum-min);
    }
}

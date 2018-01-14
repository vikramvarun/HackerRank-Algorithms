import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
    public static int gcd(int first, int second) 
    {
        while (first > 0 && second > 0) {            
            if (first >= second) {
                first = first % second;
            }
            else {
                second = second % first;
            }
        }
        return first + second;
    }    
    public static int lcm(int first, int second) 
    {  return (first / gcd(first, second)) * second;}          
    public static int getTotalX(int[] first, int[] second) 
    {        
        int multiple = 0;
        for(int i : second) 
        {  multiple = gcd(multiple, i);}
        int factor = 1;
        for(int i : first) 
        {
            factor = lcm(factor, i);
            if (factor > multiple) 
            {  return 0;}
        }
        if (multiple % factor != 0) 
        {  return 0;}        
        int value = multiple / factor;        
        int max = Math.max(factor, value);
        int totalX = 1;        
        for (int i = factor; i < multiple; i++) 
        {
            if (multiple % i == 0 && i % factor == 0) 
            {  totalX++;}
        }
        return totalX;    
    }   
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int N1 = in.nextInt();
        int N2 = in.nextInt();
        int[] first = new int[N1];
        for(int fi=0; fi<N1; fi++)
        { first[fi] = in.nextInt(); }
        int[] second = new int[N2];
        for(int si=0; si<N2; si++)
        { second[si] = in.nextInt(); }
        in.close();
        int total = getTotalX(first, second);
        System.out.println(total);
        
    }
}

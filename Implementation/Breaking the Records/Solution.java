import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    static int[] getRecord(int[] s){
        int max = s[0];
        int min = s[0];
        int max_count = 0;
        int min_count = 0;
        int result[] = {max_count, min_count};
        for(int s_j=0; s_j < s.length; s_j++){
            if (s[s_j] > max)  {
                max_count+=1;
                max = s[s_j];
            }
            else if (s[s_j] < min)  {
                min_count+=1;
                min = s[s_j];
            }
        }
         System.out.print(max_count + " " + min_count);
        return result; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        getRecord(s);
    }
}

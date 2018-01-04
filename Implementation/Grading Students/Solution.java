import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    static int solve(int[] grades)
    { 
        for(int grades_j=0; grades_j < grades.length; grades_j++)
        {
            if (grades[grades_j] < 38 || grades[grades_j]%5<=2)
                grades[grades_j] = grades[grades_j];     
            else
                grades[grades_j] = ((grades[grades_j] + 2 ) / 5) * 5;
            System.out.println(grades[grades_j]);
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++)
        {
            grades[grades_i] = in.nextInt();
        }
        //int result = 
        solve(grades);
        
    }
}

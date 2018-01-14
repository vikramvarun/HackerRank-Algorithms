#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int m, n; 
    double sum = 0;
    scanf("%d",&n);
    if (n<1 || n>10){
        
        printf ("Please enter an array size from 1 to 10.\n");
        
    }
    else 
        {
        m=n;
    }
    double arr[m];
    for(int arr_i = 0; arr_i < m; arr_i++){
       scanf("%lf",&arr[arr_i]);
        if (arr[arr_i]<0 || arr[arr_i] >10000000000)
            
           {
            printf ("Please enter the value from 0 to 10^10.\n");
        }
        
        else {
        sum = sum + arr[arr_i];
        }
        
    }
    
    printf("%.0lf", sum);
    return 0;
}

#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    int one =0;
    int two =0;
    scanf("%d",&n);
    int a[n][n];
    for(int a_i = 0; a_i < n; a_i++){
       for(int a_j = 0; a_j < n; a_j++){
          
          scanf("%d",&a[a_i][a_j]);
         //  printf("%d\n", a[a_i][a_j]);
           
           if (a_i == a_j){
               one = one + a[a_i][a_j];
          
           }
           
           if (a_i + a_j == (n-1)){
               two = two + a[a_i][a_j];
           }
              
       }
    }
   printf("%d\n", abs(one-two));
    
    return 0;
}

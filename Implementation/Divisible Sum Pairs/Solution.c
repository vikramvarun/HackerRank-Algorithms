#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    int k; 
    scanf("%d %d",&n,&k);
    int *a = malloc(sizeof(int) * n);
    for(int a_i = 0; a_i < n; a_i++){
       scanf("%d",&a[a_i]);
    }
        
    int count = 0;
    for (int x = 0; x  < n-1; x++){
        for (int y = x+1; y  < n; y++) {
          if ((a[x]+a[y])%k == 0){
              count = count + 1;
          }  
        }
    }
    printf("%d", count);
    return 0;
}

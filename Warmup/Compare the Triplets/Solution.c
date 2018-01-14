#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int a0; 
    int a1; 
    int a2; 
    int a = 0;
    scanf("%d %d %d",&a0,&a1,&a2);
    int b0; 
    int b1; 
    int b2; 
    int b=0;
    scanf("%d %d %d",&b0,&b1,&b2);
    if (a0>b0){a=a+1;}
    else if (a0<b0){b=b+1;}
     if (a1>b1){a=a+1;}
    else if (a1<b1){b=b+1;}
       if (a2>b2){a=a+1;}
    else if (a2<b2){b=b+1;}
    printf ("%d %d", a, b);

    return 0;
}

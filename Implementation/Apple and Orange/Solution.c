#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
int main(){
    int s, t, a, b, i, j, m, n, apples=0, oranges=0, point, apple_i, orange_i; 
    scanf("%d %d", &s, &t);
    scanf("%d %d", &a, &b);
    scanf("%d %d", &m, &n);
    
    for(int i = 0; i < m; i++){
       scanf("%d",&apple_i);
       point = a + apple_i;
       if (s <= point && point <= t) 
       apples+=1; }
    
    for(int j = 0; j < n; j++){
       scanf("%d", &orange_i);
       point = b + orange_i;
       if (s <= point && point <= t)
       oranges+=1; }
    
    printf ("%d\n%d", apples, oranges);
    return 0; }

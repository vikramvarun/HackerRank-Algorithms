#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n, k, paid;
    int sum, diff;
    scanf ("%d %d", &n, &k);
    int c[n];
    int sum0 = 0;
    for (int i=0; i<n; i++)
    {
        scanf ("%d", &c[i]);
        sum0 = sum0 + c[i];
    }
    scanf("%d", &paid);
    sum = (sum0 - c[k])/2;
    diff = paid - sum;
    if (paid != sum) {printf("%d", diff);}
    else {printf("Bon Appetit");}
    return 0;
}

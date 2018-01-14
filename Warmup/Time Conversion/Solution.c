#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
   char* time = (char *)malloc(10240 * sizeof(char));
    int h, m, s;
    char t[3];
    
    scanf("%d:%d:%d%s", &h, &m, &s, &t);    
    
    if (h == 12){
        if (strcmp(t,"AM") == 0)  
            {printf("00:%02d:%02d", m, s);}
    
        else if (strcmp(t,"PM") == 0)
          {printf("12:%02d:%02d", m, s);}
    }

    else if (strcmp(t,"PM") == 0)
        {printf("%02d:%02d:%02d", h+12, m, s);   }  

    else    
        {printf("%02d:%02d:%02d", h, m, s);}



    return 0;
}

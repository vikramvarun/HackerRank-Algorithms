#include <stdio.h>
int main()
{
    int x1, v1, x2, v2; 
    scanf("%d %d %d %d",&x1,&v1,&x2,&v2);
    if (x2 > x1 && x1 >= 0 && x2 <= 10000 && v1 > 0 && v2 > 0 && v1 <= 10000 && v2 <= 10000)
    {       
        if (v2>= v1)
            printf("NO");        
        else if ((x2-x1)%(v1-v2)!=0)
            printf("NO");        
        else     
            printf("YES");                         
    }           
    return 0;
}

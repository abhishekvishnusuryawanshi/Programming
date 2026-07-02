//INPUT: 5
//OUTPUT : 1 2 3 4 5 
#include<stdio.h>


int main()
{
    int iCnt = 0;

    iCnt= 1 ;
    while(iCnt <= 5)
    {
        printf("%d",iCnt);
        iCnt++;
    }

    printf("\n");
    
    return 0;
}
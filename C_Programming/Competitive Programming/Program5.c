//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and prints '*' that many times.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

void Accept(int iNo)
{
    int iCnt = 0;

    for ( iCnt = 0; iCnt < iNo; iCnt++)
    {
        printf("\t*");
    }
    
}
int main()
{
    int iValue=0;
    
    printf("Enter the Number:\n");
    scanf("%d",&iValue);

    Accept(iValue);

    return 0;
}
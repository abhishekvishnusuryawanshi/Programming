//////////////////////////////////////////////////////////////
//
// This program checks whether the given number is divisible by 5.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

typedef int BOOL;
#define TRUE 1
#define FAlSE 0

int Check(int iNO)
{
    if((iNO %5)==0)
    {
        return TRUE;
    }
    else
    {
        return FAlSE;
    }
}
int main()
{
    int iValue = 0;
    BOOL bRet = FAlSE;

    printf("Enter Number");
    scanf("%d",&iValue);

    bRet = Check(iValue);

    if(bRet==TRUE)
    {
        printf("Divisible by 5");
    }
    else
    {
        printf("Not Divisible by 5");
    }
    return 0;
}

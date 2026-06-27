/*
Write a program which which check whether 7th and 15th and 21st , 28th bit is ON or OFF.
*/
#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL CheckBit(UINT iNo)
{
    UINT iMask = 0x08104040;
    UINT Ans = 0;

    Ans = iMask & iNo ;

    if(Ans == iMask )
    {
        return TRUE; 
    }
    return FALSE;

}

int main()
{
    UINT iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter a Number : ");
    scanf("%d",&iValue);

    bRet = CheckBit(iValue);

    if(bRet == TRUE)
    {
        printf("The Bit is ON");
    }
    else
    {
        printf("The Bit is OFF");
    }

    return 0;
}

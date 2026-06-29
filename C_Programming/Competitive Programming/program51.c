/*
Write a program which which check whether 15th bit is ON or OFF.
*/

#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0x4000;  //Hexadecimal for (15Decimal)
    UINT Ans = 0;

    Ans = iNo & iMask;

    if(Ans == iMask)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}


int main()
{
    UINT iNo = 0;
    BOOL bRet ;

    printf("Emter a Number:");
    scanf("%d",&iNo);

    bRet = ChkBit(iNo);

    if(bRet==TRUE)
    {
        printf("The Bit is ON");
    }
    else
    {
        printf("The Bit is OFF");
    }

    return 0;
}

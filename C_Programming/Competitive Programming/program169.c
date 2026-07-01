/*
write a program which accept one number, two position from user and check whether bit at first or secound position is ON or OFF
*/
#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL CheckBit(UINT iNo, int iPos1, int iPos2)
{
    UINT iMask1 = 0;
    UINT iMask2 = 0;
    UINT iMask = 0;

    iMask1 = 1 << (iPos1 - 1);
    iMask2 = 1 << (iPos2 - 1);

    iMask = iMask1 | iMask2;

    if((iNo & iMask) != 0)
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
    UINT iValue = 0;
    int iPos1 = 0, iPos2 = 0;
    BOOL bRet = FALSE;

    printf("Enter number : ");
    scanf("%u", &iValue);

    printf("Enter first position : ");
    scanf("%d", &iPos1);

    printf("Enter second position : ");
    scanf("%d", &iPos2);

    bRet = CheckBit(iValue, iPos1, iPos2);

    if(bRet == TRUE)
    {
        printf("Bit at first or second position is ON.\n");
    }
    else
    {
        printf("Both bits are OFF.\n");
    }

    return 0;
}

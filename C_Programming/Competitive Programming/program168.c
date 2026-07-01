/*
write a program which accept two number from user and check whether 9th or 12th bit is on or off.
*/

#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL CheckBit(UINT iNo)
{
    UINT iMask = 0x00000900;
    UINT iResult = 0;

    iResult = iNo & iMask;

    if(iResult != 0)
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
    BOOL bRet = FALSE;

    printf("Enter a number : ");
    scanf("%u", &iValue);

    bRet = CheckBit(iValue);

    if(bRet == TRUE)
    {
        printf("Either 9th bit or 12th bit is ON.\n");
    }
    else
    {
        printf("Both 9th and 12th bits are OFF.\n");
    }

    return 0;
}

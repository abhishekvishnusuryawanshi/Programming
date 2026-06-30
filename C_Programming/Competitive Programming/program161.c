/*
Write a program which accept one number and Position from user and check whether bit at that position is on or off. if bit is ON return TRUE otherwise return FALSE.
*/
#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo , UINT iPos)
{
    int iMask = 0 ;
    int iResult = 0;

    iMask = 1 << (iPos - 1);

    iResult = (iMask & iNo);

    if(iResult != 0)
    {
        return TRUE;
    }
    return FALSE;

}

int main()
{
    UINT iValue1 = 0;
    UINT iValue2 = 0;
    BOOL bRet = FALSE;

    printf("Enter a Number : ");
    scanf("%d",&iValue1);

    printf("Enter a Position : ");
    scanf("%d",&iValue2);

    bRet = ChkBit(iValue1,iValue2);

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

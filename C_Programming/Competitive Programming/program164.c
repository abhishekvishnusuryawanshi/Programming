/*
Write a program which accept one number and Position from user and Toggle that Bit. Return Modified Bit.
*/
#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo , UINT iPos)
{
    UINT iMask = 0;

    iMask = 1 << (iPos - 1);

    return (iMask ^ iNo);
}

int main()
{
    UINT iValue1 = 0 , iValue2 = 0 , iRet = 0;

    printf("Enter a Number :");
    scanf("%d",&iValue1);

    printf("Enter the Position :");
    scanf("%d",&iValue2);

    iRet = ToggleBit(iValue1 , iValue2);

    printf("Toggle Bit is : %d",iRet);

    return 0;
}

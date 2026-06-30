/*
Write a program which accept one number and Position from user and ON that Bit. Return Modified Bit.
*/
#include<stdio.h>

typedef unsigned int UINT;

UINT OnBit(UINT iNo , UINT iPos)
{
    UINT iMask = 0;

    iMask = 1 << (iPos - 1);

    return (iMask | iNo);
}

int main()
{
    UINT iValue1 = 0 , iValue2 = 0 , iRet = 0;

    printf("Enter a Number :");
    scanf("%d",&iValue1);

    printf("Enter the Position :");
    scanf("%d",&iValue2);

    iRet = OnBit(iValue1 , iValue2);

    printf("Modified Bit is : %d",iRet);

    return 0;
}

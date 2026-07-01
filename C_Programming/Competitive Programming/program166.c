/*
Write a program which acept one number from user and count number of ON(1) Bits in it without using % and / operator.
*/

#include<stdio.h>

typedef unsigned int UINT;

UINT CountOne(UINT iNo)
{
    UINT iCount = 0;

    while(iNo != 0)
    {
        if((iNo & 1) == 1)
        {
            iCount++;
        }

        iNo = iNo >> 1;
    }
    return iCount;
}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter a Number :");
    scanf("%u",&iValue);

    iRet = CountOne(iValue);

    printf("The On bits are :%u",iRet);


    return 0;
}

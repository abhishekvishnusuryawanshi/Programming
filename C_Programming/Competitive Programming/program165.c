/*
Write a program which accept one number from user and Toggle contents of first and last nibble of the number. modified number. (Nibble is a group of four bits)
*/
#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo )
{
    UINT iMask = 0;

    iMask = 0xf000000f;

    return (iMask ^ iNo);
}

int main()
{
    UINT iValue1 = 0 , iRet = 0;

    printf("Enter a Number :");
    scanf("%u",&iValue1);

    iRet = ToggleBit(iValue1);

    printf("Toggle Bit is : %u",iRet);

    return 0;
}

/*
Write a program which accept one number from user and Toggle 7th and 10th bit of that number if it is on. Return modified number.
*/
#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(int iNo)
{
    UINT iMask = 0x00000240 ;

    return (iNo ^ iMask);
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter a Number : ");
    scanf("%d",&iValue);

    iRet = ToggleBit(iValue);

    printf("After Toggle Number is :%d",iRet);

    return 0;
}

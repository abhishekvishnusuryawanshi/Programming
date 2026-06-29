/*
Write a program which accept one number from user and on its first 4 bits. Return modified number.
*/
#include<stdio.h>

typedef unsigned int UINT ;

UINT OnBit(UINT iNo)
{
    UINT imask = 0x0000000f;

    return (iNo | imask);
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter a Number: ");
    scanf("%d",&iValue);

    iRet = OnBit(iValue);

    printf("The Modified Number is : %d",iRet);

    return 0;
}

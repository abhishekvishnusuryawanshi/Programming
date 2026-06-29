/*
Write a program which accept one number from user and off 7th and 10th bit of that number if it is on. Return modified number.
*/

#include<stdio.h>
typedef unsigned int UINT;

UINT OffBit(UINT iNo)
{
    UINT iMask = 0xFFFFFCBF; ;
    
    return (iNo & iMask);


}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter a Number:");
    scanf("%d",&iValue);

    iRet = OffBit(iValue);

    printf("Modified Bit is : %d",iRet);
    
    return 0;
}

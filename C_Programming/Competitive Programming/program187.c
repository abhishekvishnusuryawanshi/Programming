/*
Write a recursive program which Accept number from user and return Summation of Digit.
INPUT -     879
OUTPUT -    24
*/
#include<stdio.h>

int Sum(int iNo)
{
    static int iSum = 0;

    if(iNo == 0)
    {
        return iSum;
    }

    iSum = iSum + (iNo % 10);

    Sum(iNo / 10);      

    return iSum;
}

int main()
{
    int iValue = 0 ;
    int iRet = 0;

    printf("Enter a Number : \n");
    scanf("%d",&iValue);

    iRet = Sum(iValue);

    printf("%d",iRet);

    return 0;
}

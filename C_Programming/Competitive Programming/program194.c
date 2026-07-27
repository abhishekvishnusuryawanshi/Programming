/*
Write a recursive program which Accept Number from user and return smallest digit.
INPUT  : 2516514
OUTPUT : 1
*/

#include<stdio.h>

int CountSmall(int iNo)
{
    static int iSmall = 9;

    if(iNo != 0)
    {
        if((iNo % 10) < iSmall)
        {
            iSmall = iNo % 10;
        }

        CountSmall(iNo / 10);
    }

    return iSmall;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d", &iValue);

    iRet = CountSmall(iValue);

    printf("Smallest Digit in Number : %d\n", iRet);

    return 0;
}

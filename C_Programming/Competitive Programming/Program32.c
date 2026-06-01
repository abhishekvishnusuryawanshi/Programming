//////////////////////////////////////////////////////////////
//
// This program accepts an amount in US dollars from the user and converts it
// into Indian rupees using a fixed conversion rate.
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

int DollarToINR(int iNo)

{
    int iAmount = 0;

    iAmount = iNo * 70;

    return iAmount;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a Number of USD :\n");
    scanf("%d",&iValue);

    iRet=DollarToINR(iValue);

    printf("The value of INR is %d",iRet);

    return 0;

}
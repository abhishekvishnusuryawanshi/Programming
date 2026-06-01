//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and returns the difference
// between the product of even numbers and odd numbers up to that number.
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

int FactorialDif(int iNO)
{
    int iCnt = 0;
    int iEvenFact = 1;
    int iOddFact = 1;

    if(iNO < 0)
    {
        iNO = -iNO;
    }

    for(iCnt = 1; iCnt <= iNO; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iEvenFact = iEvenFact * iCnt;
        }
        else
        {
            iOddFact = iOddFact * iCnt;
        }
    }

    return (iEvenFact - iOddFact);
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a Number :\n");
    scanf("%d",&iValue);

    iRet = FactorialDif(iValue);

    printf("The Diffrence between Even Factorial and Odd Factorial is : %d\t",iRet);

    return 0;
}
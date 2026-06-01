//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and calculates the factorial
// using only even numbers.
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

int EvenFactorial(int iNo)
{
    int iCnt = 0;
    int iFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iFact = iFact * iCnt;
        }
    }

    return iFact;
}
 
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a Number :\n");
    scanf("%d",&iValue);

    iRet=EvenFactorial(iValue);

    printf("The Even Factorial is %d",iRet);

    return 0;

}
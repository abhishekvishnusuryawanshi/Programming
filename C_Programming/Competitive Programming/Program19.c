//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and returns the sum of all non-factors
// of that number.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

int NonFactSum(int iNo)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if((iNo % iCnt) != 0)
        {
            iSum = iSum + iCnt;
        }
    }

    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a Number :\n");
    scanf("%d", &iValue);

    iRet = NonFactSum(iValue);

    printf("Sum of non factors is : %d\n", iRet);

    return 0;
}
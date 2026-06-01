//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and prints the pattern "* $"
// for the given number of times.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for (iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("\t*\t$",iCnt);
    }
    
}

int main()
{
    int iValue = 0;

    printf("Enter a Number :\n");
    scanf("%d",&iValue);

    Pattern(iValue);
    return 0;

}
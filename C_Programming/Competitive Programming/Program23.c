//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and prints all numbers
// from negative of that number to positive of that number.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for (iCnt = -iNo; iCnt <= iNo; iCnt++)
    {
        printf("\t%d",iCnt);
    }
    
}

int main()
{
    int iValue = 0;

    printf("Enter a Number :\n");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;

}
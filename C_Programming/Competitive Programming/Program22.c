//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and prints numbers from 1
// up to that number.
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

    for (iCnt = 1; iCnt <= iNo; iCnt++)
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
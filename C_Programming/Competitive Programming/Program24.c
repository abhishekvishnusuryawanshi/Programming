//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and prints all odd numbers
// from 1 up to that number.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

void OddDisplay(int iNo)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if((iCnt % 2) != 0)
        {
            printf("%d\t", iCnt);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a Number :\n");
    scanf("%d",&iValue);

    OddDisplay(iValue);
    return 0;

}
//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and prints its first 5 multiples.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

void MultipleDisplay(int iNo)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= 5; iCnt++)
    {
        printf("%d\t", iNo * iCnt);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a Number :\n");
    scanf("%d",&iValue);

    MultipleDisplay(iValue);
    return 0;

}
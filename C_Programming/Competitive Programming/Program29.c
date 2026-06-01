//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and prints its multiplication table (1 to 10).
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

int Table(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt < 1; iCnt <= 10; iCnt++)
    {
        
        printf("%d\t",iNo * iCnt);
    }

    
}

int main()
{
    int iValue = 0;
    
    printf("Enter a number:\n");
    scanf("%d", &iValue);

    Table(iValue);


    return 0;
}
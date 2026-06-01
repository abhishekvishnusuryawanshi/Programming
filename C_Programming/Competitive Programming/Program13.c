//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and displays all even factors of that number.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

void DisplayFactor(int iNO)
{
    int iCnt =0;

    if(iNO <= 0)
    {
        iNO = -iNO;
    }
    if(iNO == 0)
    {
        printf("Enter Invalid Input :%d",iNO);
    }
    for ( iCnt = 1; iCnt < iNO; iCnt++)
    {
        if((iNO % iCnt == 0) && (iCnt % 2 == 0))
        {
            printf("%d\t",iCnt);
        }
    }
    printf("\n");
    
}

int main()
{
    int iValue = 0;
    
    printf("Enter a Number:\n");
    scanf("%d",&iValue);

    DisplayFactor(iValue);

    return 0;
}
/*
Write a recursive program which Accept number from user and return its factorial.
INPUT -     5
OUTPUT -    120
*/
#include<stdio.h>
#include<string.h>

int Fact(int iNo)
{
    static int iFact = 1;

    if(iNo != 0)
    {
        iFact = iFact * iNo;
        iNo--;

        Fact(iNo);
    }

    return iFact;
}



int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a Number : \n");
    scanf("%d",&iValue);

    iRet = Fact(iValue);

    printf("%d",iRet);

    return 0;
}

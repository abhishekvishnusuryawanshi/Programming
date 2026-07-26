/*
Write a recursive program which Accept number from user and return its product of digit.
INPUT -     523
OUTPUT -    30
*/
#include<stdio.h>
#include<string.h>

int Product(int iNo)
{
    static int iProd = 1;

    if(iNo != 0)
    {
        iProd = iProd * (iNo % 10);
        iNo = iNo / 10;

        return Product(iNo);
    }

    return iProd;
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

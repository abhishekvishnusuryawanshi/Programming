/*
Write a recursive program which Accept Number from user and return reverse number.
INPUT  : 253
OUTPUT : 352
*/

#include<stdio.h>

int Reverse(int iNo)
{
    static int iRev = 0;

    if(iNo != 0)
    {
        iRev = (iRev * 10) + (iNo % 10);
        Reverse(iNo / 10);
    }

    return iRev;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d", &iValue);

    iRet = Reverse(iValue);

    printf("Reverse Number : %d\n", iRet);

    return 0;
}

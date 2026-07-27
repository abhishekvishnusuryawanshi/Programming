/*
Write a recursive program which Accept Number from user and count largest digit .
INPUT -     78459
OUTPUT -    9
*/
#include<stdio.h>

int LargestDigit(int iNo)
{
   int iDigit = 0;
   static int Num = 0;

   if(iNo != 0)
   {
        iDigit = iNo % 10;

        if(Num < iDigit)
        {
            Num = iDigit;
        }

        iNo = iNo / 10;

        return LargestDigit(iNo);
   }

       return Num;
}


int main()
{

    int iValue = 0;
    int iRet = 0;

    printf("Enter a Number : \n");
    scanf("%d",&iValue);

    iRet = LargestDigit(iValue);

    printf("The Largest Digit in the Number is : %d",iRet);

    return 0;
}

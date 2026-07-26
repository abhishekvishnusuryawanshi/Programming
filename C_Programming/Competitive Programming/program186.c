/*
Write a recursive program which display below pattern.
INPUT -     4
OUTPUT -    4   *   3   *   2   *   1   *
*/
#include<stdio.h>

void Display(int iNo)
{
    if(iNo != 0)
    {
        printf("\t%d\t*",iNo);
        iNo--;
        Display(iNo);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a Number : \n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}

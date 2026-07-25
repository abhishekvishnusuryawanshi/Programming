/*
Write a recursive program which display below pattern.
INPUT -     4
OUTPUT -    1   2   3   4
*/

#include<stdio.h>

void Display(int iNo)
{
    static int iCount = 1;

    if(iNo != 0)
    {
        printf("%d\t",iCount);
        iCount++;
        iNo--;
        Display(iNo);
    }

}

int main()
{
    int iValue = 0 ;

    printf("Enter a Number : \n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}
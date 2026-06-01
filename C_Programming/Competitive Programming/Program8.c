//////////////////////////////////////////////////////////////
//
// This program prints "Hello" if the number is less than or equal to 10,
// otherwise it prints "Demo".
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
    if(iNo<=10)
    {
        printf("Hello\n");
    }
    else
    {
        printf("Demo");
    }
}
int main()
{
    int iValue = 0;

    printf("Enter Number:\n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}
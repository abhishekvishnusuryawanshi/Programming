/*
Write a recursive program which display below pattern.
INPUT -     4
OUTPUT -    a   b   c   d
*/

#include<stdio.h>

void Display(int iNo)
{
    static char ch = 'a';

    if(iNo != 0)
    {
        printf("%c\t",ch);
        ch++;
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

/*
  Accept character from user and display its ASCII vaule in decimal ,octal and Hexadecimal.
*/

#include<stdio.h>

void Display(char ch)
{
    printf("Character : %c\n", ch);
    printf("Decimal   : %d\n", ch);
    printf("Octal     : %o\n", ch);
    printf("Hexa      : %X\n", ch);
}

int main ()
{
    char cValue = '\0';

    printf("Enter a Character :");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}

/*
    Write a program which display ASCII table contain symbol,decimal,Hexadecimal and Octal reprentation of every member from 0 to 255. 
*/

#include<stdio.h>

void DisplayASCII()
{
    int i = 0;

    printf("Symbol\tDecimal\tHexadecimal\tOctal\n");
    printf("-------------------------------------------------\n");

    for(i = 0; i <= 255; i++)
    {
        printf("%c\t%d\t%x\t%o\n", i, i, i, i);
    }
}

int main()
{
    DisplayASCII();

    return 0;
}

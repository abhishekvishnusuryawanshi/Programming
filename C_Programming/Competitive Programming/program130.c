/*
Write a program which accept string from user and display it in reverse order.
*/
#include<stdio.h>

void Reverse(char *str)
{
    int iLength = 0;
    int i = 0;

    while(str[i] != '\0')
    {
        iLength++;
        i++;
    }

    for(i = iLength - 1; i >= 0; i--)
    {
        printf("%c", str[i]);
    }
}

int main()
{
    char arr[20];

    printf("Emter a String : \n");
    scanf("%[^\n]",arr);

    Reverse(arr);

    return 0;
}

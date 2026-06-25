/*
Write a program which accept string from user and reverse that string in place.
*/

#include<stdio.h>

void StringReverse(char *str)
{
    char *start = str;
    char *end = str;
    char temp;

    while(*end != '\0')
    {
        end++;
    }

    end--;   // Move to last character

    while(start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}

int main()
{
    char Arr[20];

    printf("Enter String : \n");
    scanf("%[^\n]", Arr);

    StringReverse(Arr);

    printf("Reversed String : %s\n", Arr);

    return 0;
}

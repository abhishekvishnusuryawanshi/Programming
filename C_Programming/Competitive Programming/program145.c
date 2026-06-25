/*
Write a program which  two string from user and concat Second string after first string.
*/

#include<stdio.h>

void StrCat(char *src, char *dest)
{
    while(*src != '\0')
    {
        src++;
    }

    while(*dest != '\0')
    {
        *src = *dest;
        src++;
        dest++;
    }

    *src = '\0';
}

int main()
{
    char Arr[50];
    char Brr[50];

    printf("Enter First String : \n");
    scanf("%[^\n]", Arr);

    getchar();

    printf("Enter Second String : \n");
    scanf("%[^\n]", Brr);

    StrCat(Arr, Brr);

    printf("Concatenated String : %s\n", Arr);

    return 0;
}

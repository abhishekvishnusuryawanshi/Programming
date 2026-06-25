/*
Write a program which accept string from user and copy the contents of that string into another string.(Implement strcpy() Function)
*/

#include<stdio.h>

void StrCpy(char *src , char *dest)
{

    while(*src != '\0')
    {
        *dest = *src;
        src++;
        dest++;
    }
    *dest = '\0';  
}

int main()
{
    char Arr[30];
    char Brr[30];

    printf("Enter String : \n");
    scanf("%[^\n]", Arr);

    StrCpy(Arr,Brr);

    printf("Copied String : %s\n", Brr);

    return 0;
}

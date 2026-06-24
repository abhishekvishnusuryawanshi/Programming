/*
Write a program which accept string from user and Convert it into lower case.
*/
#include<stdio.h>

void StrLower(char *str)
{
    int i = 0;

    while(str[i] != '\0')
    {
        if(str[i] >= 'A' && str[i] <= 'Z')
        {
            str[i] = str[i] + 32;
        }
        i++;

    }
}

int main()
{
    char arr[20];

    printf("Enter a String : \n");
    scanf("%[^\n]",arr);

    StrLower(arr);

    printf("Updated String is : %s ",arr);

    return 0;
}

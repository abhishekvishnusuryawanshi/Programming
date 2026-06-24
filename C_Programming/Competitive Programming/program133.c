/*
Write a program which accept string from user and toggle the case.
*/

#include<stdio.h>

void StrToggle(char *str)
{
    int i = 0;

    while(str[i] != '\0')
    {
        if(str[i] >= 'a' && str[i] <= 'z')
        {
            str[i] = str[i] - 32;
        }
        else if (str[i] >= 'A' && str[i] <= 'Z')
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

    StrToggle(arr);

    printf("Updated String is : %s ",arr);

    return 0;
}

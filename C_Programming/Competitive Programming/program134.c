/*
Write a program which accept string from user and Display only digits from that string.
*/

#include<stdio.h>

void DisplayDigit(char *str)
{
    int i = 0;

    while(str[i] != '\0')
    {
        if(str[i] >= '0' && str[i] <= '9')
        {
            printf("%c", str[i]);
        }

        i++;
    }
}

int main()
{
    char arr[20];

    printf("Enter a String : \n");
    scanf("%[^\n]", arr);

    printf("Digits are : ");
    DisplayDigit(arr);

    return 0;
}

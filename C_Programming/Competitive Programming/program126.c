/*
Write a program which accept string from user and count number of capital character.
*/
#include<stdio.h>

int CountCapital(char str[])
{
    int i = 0, iCount = 0;

    while(str[i] != '\0')
    {
        if((str[i] >= 'A') && (str[i] <= 'Z'))
        {
            iCount++;
        }
        i++;
    }

    return iCount;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter a string : ");
    scanf("%[^\n]", arr);

    iRet = CountCapital(arr);

    printf("Number of capital characters are : %d\n", iRet);

    return 0;
}

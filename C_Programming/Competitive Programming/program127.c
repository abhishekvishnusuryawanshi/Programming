/*
Write a program which accept string from user and count number of Small character.
*/
#include<stdio.h>

int CountSmall(char str[])
{
    int i = 0, iCount = 0;

    while(str[i] != '\0')
    {
        if((str[i] >= 'a') && (str[i] <= 'z'))
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

    iRet = CountSmall(arr);

    printf("Number of Small characters are : %d\n", iRet);

    return 0;
}

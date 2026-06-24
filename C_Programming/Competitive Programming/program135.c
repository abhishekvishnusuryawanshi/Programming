/*
Write a program which accept string from user and Count number of white spaces.
*/

#include<stdio.h>

int CountWhiteSpace(char *str)
{
    int i = 0;
    int iCount = 0;

    while(str[i] != '\0')
    {
        if(str[i] == ' ')
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

    printf("Enter a String : \n");
    scanf("%[^\n]", arr);

    iRet = CountWhiteSpace(arr);

    printf("Number of white spaces are : %d\n", iRet);

    return 0;
}

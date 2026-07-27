/*
Write a recursive program which Accept String from user and count number of small characters.
INPUT  : HelloWorld
OUTPUT : 8
*/

#include<stdio.h>

int CountSmall(char *str)
{
    static int Count = 0;

    if(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            Count++;
        }

        CountSmall(str + 1);
    }

    return Count;
}

int main()
{
    char iValue[100];
    int iRet = 0;

    printf("Enter a String : ");
    scanf("%s", iValue);

    iRet = CountSmall(iValue);

    printf("The Small Letter in String : %d\n", iRet);

    return 0;
}

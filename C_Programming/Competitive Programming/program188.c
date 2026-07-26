/*
Write a recursive program which Accept string from user and count number of character.
INPUT -     Hello
OUTPUT -    5
*/
#include<stdio.h>
#include<string.h>

int Count(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        iCount++;
        str++;

        return Count(str);
    }
    return iCount;
}



int main()
{
    char Arr[100] ;
    int iRet = 0;

    printf("Enter a String : \n");
    scanf("%[^'\n']s", Arr);

    iRet = Count(Arr);

    printf("%s",iRet);

    return 0;
}

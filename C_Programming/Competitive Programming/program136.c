/*
Write a program which accept string from user and accept one character. check whether that character is present in string or not.
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckCharacter(char *str,char ch)
{
    int i = 0;
    
    while(str[i] != '\0')
    {
        if(str[i] == ch)
        {
            return TRUE;
        }

        i++;
    }

    return FALSE;
}

int main()
{
    char arr[20];
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter a String : \n");
    scanf("%[^\n]", arr);

    printf("Enter a Character : \n");
    scanf(" %c", &cValue);

    bRet = CheckCharacter(arr,cValue);

    if(bRet == TRUE)
    {
        printf("The Character is present in String");
    }
    else
    {
        
        printf("The NOT Character is present in String");
    }
    
    return 0;
}

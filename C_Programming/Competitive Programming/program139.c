/*
Write a program which accept string from user and accept one character.Return index of Last occurrence of that character.
*/

#include<stdio.h>


int LastCharacter(char *str,char ch)
{
    int i = 0;
    int iLast = -1;
    
    while(str[i] != '\0')
    {
        if(str[i] == ch)
        {
            iLast = i;
        }
        i++;

    }
    return iLast;
}

int main()
{
    char arr[20];
    char cValue = '\0';
    int iRet = 0;

    printf("Enter a String : \n");
    scanf("%[^\n]", arr);

    printf("Enter a Character : \n");
    scanf(" %c", &cValue);

    iRet = LastCharacter(arr,cValue);

    printf("The Character Location is : %d",iRet);
    

    
    return 0;
}

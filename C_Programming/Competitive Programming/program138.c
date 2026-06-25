/*
Write a program which accept string from user and accept one character.Return index of first occurrence of that character.
*/

#include<stdio.h>


int FirstCharacter(char *str,char ch)
{
    int i = 0;
    
    while(str[i] != '\0')
    {
        if(str[i] == ch)
        {
            return i;
        }

        i++;
    }

    return -1;
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

    iRet = FirstCharacter(arr,cValue);

    printf("The Character Location is : %d",iRet);
    

    
    return 0;
}

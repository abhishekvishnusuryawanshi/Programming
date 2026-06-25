/*
Write a program which accept string from user and accept one character.Return frequency of that character.
*/

#include<stdio.h>


int CountCharacter(char *str,char ch)
{
    int i = 0;
    int iCount = 0;
    
    while(str[i] != '\0')
    {
        if(str[i] == ch)
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
    char cValue = '\0';
    int iRet = 0;

    printf("Enter a String : \n");
    scanf("%[^\n]", arr);

    printf("Enter a Character : \n");
    scanf(" %c", &cValue);

    iRet = CountCharacter(arr,cValue);

    printf("The Character Frequency is : %d",iRet);
    

    
    return 0;
}

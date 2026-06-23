/*
Write a program which accept string from user and return difference between frequency of small characters and frequency of Captoal character.
*/
#include<stdio.h>

int Difference(char str[])


{
    int iSmall = 0, iCaptial = 0;
    int i = 0;

    while(str[i] != '\0')
    {

        if(str[i] >= 'A' && str[i] <= 'Z')
        {
            iCaptial++;
        }
        else if (str[i] >= 'a' && str[i] <= 'z')
        {
            iSmall++;
        }
        i++;
    }
    return iSmall-iCaptial;
    
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter a string : ");
    scanf("%[^\n]", arr);

    iRet = Difference(arr);

    printf("Number of Difference between characters are : %d\n", iRet);

    return 0;
}

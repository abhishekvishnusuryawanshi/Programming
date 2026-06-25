
/*
Write a program which accept string from user and copy the Small characters of that string into another string.
*/

#include<stdio.h>

void StrCpySmall(char *src , char *dest)
{
    while(*src != '\0')
    {

        if((*src >= 'a') && (*src <= 'z'))
        {
            *dest = *src;
            dest++;
            
        }
        src++; 
    }    
    *dest = '\0';  
}

int main()
{
    char Arr[30];
    char Brr[30];

    printf("Enter String : \n");
    scanf("%[^\n]", Arr);

    StrCpySmall(Arr,Brr);

    printf("Small from String are : %s\n", Brr);
    return 0;
}

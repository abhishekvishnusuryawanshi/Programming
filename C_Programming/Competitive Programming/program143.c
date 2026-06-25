
/*
Write a program which accept string from user and copy the capital characters of that string into another string.
*/

#include<stdio.h>

void StrCpyCap(char *src , char *dest)
{
    while(*src != '\0')
    {

        if((*src >= 'A') && (*src <= 'Z'))
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

    StrCpyCap(Arr,Brr);

    printf("Capital from String are : %s\n", Brr);
    return 0;
}

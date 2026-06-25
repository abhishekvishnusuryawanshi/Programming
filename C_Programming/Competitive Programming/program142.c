
/*
Write a program which accept string from user and copy the contents of that string into another string.(Implement strcpy() Function)
*/

#include<stdio.h>

void StrCpyX(char *src , char *dest, int iCnt)
{

    while((*src != '\0') && (iCnt != 0))
    {
        *dest = *src;
        src++;
        dest++;
        iCnt--;
    }
    *dest = '\0';   
}

int main()
{
    char Arr[30];
    char Brr[30];

    printf("Enter String : \n");
    scanf("%[^\n]", Arr);

    StrCpyX(Arr,Brr,10);

    printf("Copied String : %s\n", Brr);
    return 0;
}

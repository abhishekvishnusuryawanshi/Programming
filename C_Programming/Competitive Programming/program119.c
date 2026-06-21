/*
Accept character from user and check ehether it is special symbol or not (!,@,#,$,%,^,&,*).

*/
#include<stdio.h>
#define FALSE 0
#define TRUE 1
typedef int BOOL;

BOOL ChkSpecial(char ch)
{
    if(ch == '!' || ch == '@' || ch == '#' || ch == '$' ||
       ch == '%' || ch == '^' || ch == '&' || ch == '*')
    {
        return TRUE;
    }
    else 
    {
        return FALSE;
    }

}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter a Character : ");
    scanf("%c",&cValue);

    bRet = ChkSpecial(cValue);

    if(bRet == TRUE)
    {
        printf("The enter character is Special character: %c",cValue);
    }
    else
    {
        printf("The enter character is NOT Special character: %c",cValue);
    }
    return 0 ;
}

/*
Accept character from user. if character is small display its corresponding capital character, and if it is small then
display its coresponding capital. in other cases display as it is.
*/
#include<stdio.h>

void Display(char ch)
{
    if( ch >= 'a' && ch <= 'z' )
    {
        ch = ch - 32;   
    }
    else if (ch >= 'A' && ch <= 'Z' )
    {
        ch= ch +32;
    }

    printf("the Updated Character is : %c\n",ch); 

}

int main()
{
    char cValue = '\0';

    printf("Enter the Character :");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}

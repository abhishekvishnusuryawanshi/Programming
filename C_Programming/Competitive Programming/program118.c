/*
Accept character from user. if it is capital then display all the character from the inout character til Z
if input character is small then print all the character in reverse order till a. in other casese return directly
*/
#include<stdio.h>

void Display(char ch)
{
    char icount = 0;

    if(ch >= 'A' && ch <= 'Z')
    {
        for(icount = ch ; icount <= 'Z'; icount++)
        {
            printf("%c\t",icount);
        }
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        for(icount = ch ; icount >= 'a'; icount--)
        {
            printf("%c\t",icount);
        }
    }
    else
    {
        return;
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter the Character :");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}

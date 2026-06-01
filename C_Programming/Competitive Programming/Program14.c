//////////////////////////////////////////////////////////////
//
// This program accepts a character from the user and converts uppercase
// letter to lowercase and lowercase letter to uppercase.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

void DisplayConvert(char CValue)
{
       if (CValue >= 'A' && CValue <= 'Z')
    {
        // Convert to lowercase by adding 32
        printf("Output is: %c\n", CValue + 32);
    }
    // Check if the character is lowercase using the && operator
    else if (CValue >= 'a' && CValue <= 'z')
    {
        // Convert to uppercase by subtracting 32
        printf("Output is: %c\n", CValue - 32);
    }
    else
    {
        printf("Invalid input. Please enter an alphabet.\n");
    }
}



int main()
{

    char cValue = '\0';

    printf("Enter a letter :\n");
    scanf("%c",&cValue);

    DisplayConvert(cValue);

    return 0;
}
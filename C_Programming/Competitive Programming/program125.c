/*
 Accept a character representing a student's division and display the exam schedule accordingly. The input should be case-insensitive.
*/

#include<stdio.h>


void DisplaySchedule(char chDiv)
{
    if((chDiv >= 'a') && (chDiv <= 'z'))
    {
        chDiv = chDiv - 32;
    }

    if (chDiv == 'A' )
    {
        printf("Exam Timing is : 7 Am\n");
    }
    else if (chDiv == 'B')
    {
        printf("Exam Timing is : 8:30 Am \n");
    }
    else if (chDiv == 'C')
    {
        printf("Exam Timing is : 8:20 Am \n");
    }
    else if (chDiv == 'D')
    {
        printf("Exam Timing is : 10:30 Am \n");
    }
    else
    {
        printf("Invaild input\n");
    }
    

}

int main()
{

    char cValue = '\0';

    printf("Enter a Division of Student : \n");
    scanf("%c",&cValue);

    DisplaySchedule(cValue);

    return 0;
}

// Accept number from user and display below pattern.
/*
Input:  5
Output: 5   #   4   #   3   #   2   #   1   #

*/
#include<stdio.h>

void Pattern(int iNo)
{

    while(iNo >= 1)
    {
        printf("%d \t # \t",iNo);
        iNo--;
    }

}

int main()
{
    int iValue = 0;

    printf("Enter number of Elements:");
    scanf("%d",&iValue);

    Pattern(iValue);

    return 0;
}

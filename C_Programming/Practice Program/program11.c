/*
    START
        Accept number as No
        If No is Completely divisible by 2
            then print even
        Otherwise
            print Odd
    STOP

    START
        Accept Number as NO
        Divide No by 2
        If remainder is 0
            then print as Even
        otherwise
            print odd    

    Stop
*/

#include<stdio.h>

int main()
{
    int iValue=0;
    int iRemainder=0;
    
    printf("Enter Number:\n");
    scanf("%d",&iValue);

    iRemainder = iValue % 2;

    if (iRemainder == 0)
    {
        printf("Number is Even\n");
    }

    else
    {
        printf("Number is Odd\n");
    }
    

    return 0;
}

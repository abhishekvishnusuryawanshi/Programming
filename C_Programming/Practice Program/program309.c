#include<stdio.h>

int main()
{
    unsigned iNo = 0;
    unsigned iMask = 4;
    unsigned iAns = 0;

    printf("Enter a Number :");
    scanf("%d",&iNo);

    iAns = iNo & iMask ;

    if(iAns == iMask)
    {
        printf("Third bit is on ");
    }
    else
    {
        printf("Third bit is off ");
    }
    return 0;
}
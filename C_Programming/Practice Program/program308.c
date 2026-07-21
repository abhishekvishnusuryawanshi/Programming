#include<stdio.h>

int main()
{
    int iNo = 0;
    int iMask = 4;
    int iAns = 0;

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
#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0x1;
    UINT iAns = 0;
    UINT iPos = 0;

    printf("Enter a Number :");
    scanf("%d",&iNo);

    printf("Enter the Position :");
    scanf("%d",&iPos);

    iMask = iMask << (iPos -1);

    iAns = iNo & iMask ;

    if(iAns == iMask)
    {
        printf("bit is on ");
    }
    else
    {
        printf("bit is off ");
    }
    return 0;
}
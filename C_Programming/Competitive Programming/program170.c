/*
write a program which accept one number from user and range of position from user. Toggle all bits from that range.
*/
#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBitRange(UINT iNo, int iStart, int iEnd)
{
    UINT iMask = 0;
    int i = 0;

    for(i = iStart; i <= iEnd; i++)
    {
        iMask = iMask | (1 << (i - 1));
    }

    return (iNo ^ iMask);
}

int main()
{
    UINT iValue = 0, iRet = 0;
    int iStart = 0, iEnd = 0;

    printf("Enter number : ");
    scanf("%u", &iValue);

    printf("Enter starting position : ");
    scanf("%d", &iStart);

    printf("Enter ending position : ");
    scanf("%d", &iEnd);

    iRet = ToggleBitRange(iValue, iStart, iEnd);

    printf("Modified number is : %u\n", iRet);

    return 0;
}

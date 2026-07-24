#include<stdio.h>
typedef unsigned int UINT;

//Position : 3 And 8
int main()
{
    UINT iMask1 = 0x00000004;
    UINT iMask2 = 0x00000080;
    UINT iMask = 0;

    UINT iValue = 0,iResult = 0;

    printf("Enter a Number : \n");
    scanf("%d",&iValue);

    iMask = iMask1 | iMask2;

    iResult = iValue ^ iMask;
    printf("Updated Number : %d\n",iResult);

    return 0;
} 
#include<stdio.h>
typedef unsigned int UINT;

//Position : 3 And 8
int main()
{
    UINT iMask = 0x00000084;
    UINT iValue = 0,iResult = 0;

    printf("Enter a Number : \n");
    scanf("%d",&iValue);

    iResult = iValue ^ iMask;
    printf("Updated Number : %d\n",iResult);

    return 0;
} 
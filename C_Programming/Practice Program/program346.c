#include<stdio.h>
typedef unsigned int UINT;

//Position : 21 And 27
int main()
{
    UINT iMask = 0x04100000;
    UINT iValue = 0,iResult = 0;

    printf("Enter a Number : \n");
    scanf("%d",&iValue);

    iResult = iValue ^ iMask;
    printf("Updated Number : %d\n",iResult);

    return 0;
} 
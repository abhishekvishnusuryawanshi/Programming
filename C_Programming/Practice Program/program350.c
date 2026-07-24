#include<stdio.h>
typedef unsigned int UINT;

UINT ToggleBits(UINT iNO , UINT iPos1 , UINT iPos2)
{
    UINT iMask1 = 0x1 , iMask2 = 0x1 , iMask = 0;
    UINT iResult = 0;

    iMask1 = iMask1 << (iPos1 -1);
    iMask2 = iMask2 << (iPos1 -1);

    iMask = iMask1 | iMask2 ;

    iResult = iNO ^ iMask ;

    return iResult;

}

int main()
{
    UINT iValue = 0 , iLocation1 = 0, iLocation2 =0, iRet = 0;

    printf("Enter a Number : ");
    scanf("%d",&iValue);

    printf("Enter first Bit Location : ");
    scanf("%d",&iLocation1);

    printf("Enter Second Bit Location : ");
    scanf("%d",&iLocation2);

    iRet = ToggleBits(iValue,iLocation1,iLocation2);

    printf("Updated Number: %d",iRet);


    return 0;
} 
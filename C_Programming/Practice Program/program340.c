#include<stdio.h>
typedef unsigned int UINT;

UINT OffBit(UINT iNo , UINT iPos)
{
    UINT iMask = 0x1;
    UINT iResult = 0;

    if(iPos < 1 || iPos > 32)
    {
        printf("Invaild Bit position \n");
        return iNo;
    }

    iMask = iMask << (iPos - 1);

    iMask = ~iMask;         //imporatant

    iResult = iNo & iMask ;

    return iResult;
}

int main()
{
    UINT iValue = 0,iRet = 0;
    UINT iLocation = 0;
    
    printf("Enter a Number : \n");
    scanf("%d",&iValue);

    printf("Enter the BIT Position : \n");
    scanf("%d",&iLocation);

    iRet = OffBit(iValue ,iLocation);

    printf("Updated Number is : %d\n",iRet);

    return 0;
}
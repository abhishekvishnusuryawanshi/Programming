/*
Write a program which which check whether first and Last bit is ON or OFF.
First bit means bit number 1 and last bit means bit number 32.
*/
#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0


BOOL CheckBit(UINT iNo)
{
    UINT iMask = 0x80000001;
    UINT Ans = 0;

   if((iNo & iMask) == iMask)
    {
       return TRUE; 
    }
    else
    {
        return FALSE;
    }

}

int main()
{
    UINT iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter a Number : ");
    scanf("%d",&iValue);

    bRet = CheckBit(iValue);

    if(bRet == TRUE)
    {
        printf("First and Last bits are ON\n");
    }
    else
    {
        printf("Either First bit or Last bit is OFF\n");
    }

    return 0;
}

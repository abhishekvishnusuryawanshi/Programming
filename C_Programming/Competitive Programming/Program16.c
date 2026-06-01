//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and returns the multiplication
// of all its factors (excluding the number itself).
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

int MultFact(int iNO)
{
    int iCnt = 0;
    int iMult =1;
    if(iNO <= 0)
    {
        iNO = -iNO;
    }
    for(iCnt = 1;iCnt < iNO  ; iCnt++)
    {
        if((iNO % iCnt)==0)
        {
          iMult= iMult * iCnt;  
        }
    }
        return iMult;
}

int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter a Number:\n");
    scanf("%d",&iValue);

    iRet = MultFact(iValue);

    printf("%d",iRet);

    return 0;
}
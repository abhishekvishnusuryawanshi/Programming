//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and returns the difference
// between the sum of its factors and non-factors.
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

int FactDiff(int iNO)
{
   int iCnt = 0;
   int iSumNF = 0;
   int iSumF = 0;


   for(iCnt = 1 ; iCnt <= iNO; iCnt++)
   {
    if((iNO % iCnt) !=0)
    {   
         iSumNF = iSumNF + iCnt;
    }
    else if((iNO % iCnt) ==0)
    {
        iSumF = iSumF + iCnt;
    }
   }
   return (iSumF - iSumNF);
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a Number :\n");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("The Diffrence between Sumation of Factor and Non Factor is : %d\t",iRet);

    return 0;
}
//////////////////////////////////////////////////////////////
//
// This program accepts area in square feet from the user
// and converts it into square meters.
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

double SquareMeter(int iValue)
{
    double dAns = 0.0;

    dAns = iValue * 0.0929;

    return dAns;
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in square feet : ");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf("Area in square meter is : %lf\n",dRet);

    return 0;
}
//////////////////////////////////////////////////////////////
//
// This program accepts area in square feet from the user
// and converts it into square meters.
//
// Conversion formula:
// 1 square foot = 0.0929 square meters
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

double SquareMeter(double dValue)
{
    if(dValue < 0)
    {
        dValue = -dValue;
    }
    double dSquareM = 0.0;

    dSquareM =dValue * 0.0929;

    return dSquareM;

}

int main()
{
    double fValue = 0.0;
    double dRet = 0.0;

    printf("Enter area in square feet :\n");
    scanf("%lf",&fValue);

    dRet=SquareMeter(fValue);

    printf("The Area in Square Meter is : %lf",dRet);

    return 0;

}
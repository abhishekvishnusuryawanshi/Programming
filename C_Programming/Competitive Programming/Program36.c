//////////////////////////////////////////////////////////////
//
// This program accepts radius of a circle from the user and calculates
// its area.
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

double CircleArea(float fRadius)
{
    float fPI = 3.14f;
    double dArea = 0.0f;

    dArea = fPI * fRadius *fRadius;

    return dArea;
}


int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter Radius :");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf("%lf",dRet);
}
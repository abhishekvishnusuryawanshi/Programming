//////////////////////////////////////////////////////////////
//
// This program accepts height and width of a rectangle from the user and
// calculates its area.
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

double RectArea(float fHeight,float fWidth)
{
    double dArea;

    dArea = fHeight * fWidth;

    return dArea;
}


int main()
{
    float fValue1 = 0.0;
    float fValue2 = 0.0;
    double dRet = 0.0;

    printf("Enter Height of Rectangle :");
    scanf("%f",&fValue1);

    printf("Enter Width of Rectangle :");
    scanf("%f",&fValue2);

    dRet = RectArea(fValue1,fValue2);

    printf("%lf",dRet);
}
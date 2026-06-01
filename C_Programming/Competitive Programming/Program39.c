//////////////////////////////////////////////////////////////
//
// This program accepts temperature in Fahrenheit from the user and converts
// it into Celsius.
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

double FhToCs(float fTemp)
{
    double fCelsius = 0;

    if(fTemp < 0)
    {
        fTemp = -fTemp;
    }
    

    fCelsius = (fTemp-32)*(5.0/9.0);

    return fCelsius;

}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter temperture in Fahrenheit :\n");
    scanf("%f",&fValue);

    dRet=FhToCs(fValue);

    printf("Temperture in Celsius %lf",dRet);

    return 0;

}
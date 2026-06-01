//////////////////////////////////////////////////////////////
//
// This program accepts distance in kilometers from the user and converts
// it into meters.
//
//////////////////////////////////////////////////////////////

#include<stdio.h>

int KMtoMeter(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    int iMeter = 0;

    iMeter = iNo * 1000;

    return iMeter;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a Distance in KM :\n");
    scanf("%d",&iValue);

    iRet=KMtoMeter(iValue);

    printf("The Distance in Meter %d",iRet);

    return 0;

}
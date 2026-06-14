//////////////////////////////////////////////////////////////
//
// This program accepts a number and frequency from the user and prints
// that number repeatedly for the given frequency.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo,int iFrequency)
{
    int iCnt=0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for (iCnt = 0; iCnt<iFrequency; iCnt++)
    {
        printf("%d\n",iNo);
    }
    
}
int main()
{
    int iValue=0;
    int iCount=0;

    printf("Enter Number\n");
    scanf("%d",&iValue);

    printf("Enter Frequency\n");
    scanf("%d",&iCount);

    Display(iValue,iCount);

    return 0;

}

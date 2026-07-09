#include<stdio.h>

int Summation(int Arr[], int iSize)
{
    int icnt = 0;
    int iSum = 0;

    for(icnt = 0 ; icnt <iSize ;icnt++)
    {
        iSum = iSum + Arr[icnt];
    }    
    return iSum;
}
 
int main()
{
    int iCnt = 0;
    int iRet = 0;
    int iLength = 4;
    int Brr[iLength];
    
    printf("Enter the Element\n");
    for(iCnt = 0; iCnt <iLength ; iCnt ++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    iRet = Summation(Brr,iLength);

    printf("Addtion of all Elements:%d\n",iRet);

    return 0;
}
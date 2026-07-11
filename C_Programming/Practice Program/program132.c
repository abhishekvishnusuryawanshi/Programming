#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

// Time Complexity o(N)
bool LinearSearch(int Arr[],int iSize,int iNo)
{
    int iCnt = 0;
    int iCount = 0;

    for(iCnt= 0 ; iCnt <iSize ; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            iCount++;
            break;
        }
    }
    if(iCount == 0)
    {
        return false;
    }
    else
    {
        return true;
    }
}

int main()
{
    int *Brr = NULL;
    int iLength= 0 , iCnt = 0, iValue = 0;
    bool bRet = false;

    printf("Enter the Number of Element:\n");
    scanf("%d",&iLength);

    Brr = (int *)malloc(sizeof (int)*iLength);

    printf("Enter The Elements:\n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    printf("Enter the Element that you want to Search :\n");
    scanf("%d",&iValue);

    bRet = LinearSearch(Brr,iLength,iValue);

    if(bRet == 1)
    {
        printf("Element is Present");
    }
    else
    {
        printf("Element is Not Present");
    }

    free(Brr);

    return 0;

}
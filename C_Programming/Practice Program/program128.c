#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool LinearSearch(int Arr[],int iSize)
{
    int iCnt = 0;

    for(iCnt= 0 ; iCnt <iSize ; iCnt++)
    {
        if(Arr[iCnt] == 11)
        {
            return true;   //Bad Programming
        }
    }

    return false;
}

int main()
{
    int *Brr = NULL;
    int iLength= 0 , iCnt = 0;
    bool bRet = false;

    printf("Enter the Number of Element:\n");
    scanf("%d",&iLength);

    Brr = (int *)malloc(sizeof (int)*iLength);

    printf("Enter The Elements:\n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    bRet = LinearSearch(Brr,iLength);

    if(bRet == true)
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
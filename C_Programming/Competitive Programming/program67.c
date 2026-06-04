//Accept N Number from user and return difference between frequency of even and odd Numbers

#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[], int iLength)
{
    int iCnt = 0;
    int iEven = 0;
    int iOdd = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if ((Arr[iCnt] % 2) ==0)
        {
            iEven++;
            
        }
        else
        {
            iOdd ++;
        }  
    }
    return iEven - iOdd;
}

int main()
{
    int iSize = 0, iCnt = 0, iRet = 0;
    int *p = NULL;

    printf("Enter Number of Elements: \n");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate Memory");
        return -1;
    }

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter Element %d : \n",iCnt);
        scanf("%d",&p[iCnt]);
    }
    iRet = Frequency(p,iSize);

    printf("The Diffrence between Even And Odd Number: %d",iRet);

    free(p);

    return 0;

}

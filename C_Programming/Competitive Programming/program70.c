//Accept N Number from user and accept one number as NO,return frequency of NO form it

#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[], int iLength,int iNo)
{
    int iCnt = 0;
    int iFreq = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if (Arr[iCnt]  == iNo)
        {
            iFreq++;
            
        }  
    }
    return iFreq;
}

int main()
{
    int iSize = 0, iCnt = 0, iRet = 0,iValue = 0;
    int *p = NULL;

    printf("Enter Number of Elements: \n");
    scanf("%d",&iSize);

    printf("Enter Number : \n");
    scanf("%d",&iValue);

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
    iRet = Frequency(p,iSize,iValue);

    printf("The Frequency of No in Array: %d",iRet);

    free(p);

    return 0;

}

//Accept N Number from user and return frequency of 11 form it

#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[], int iLength)
{
    int iCnt = 0;
    int iFreq = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if (Arr[iCnt]  == 11)
        {
            iFreq++;
            
        }  
    }
    return iFreq;
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

    printf("The Frequency of 11 in Array: %d",iRet);

    free(p);

    return 0;

}

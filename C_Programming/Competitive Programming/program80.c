//Accept N number from user and display Summation of digits of each number

#include<stdio.h>
#include<stdlib.h>

void DigitsSum(int Arr[], int iLength)
{
    int iCnt = 0;
    int iNo = 0, iSum = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        iNo = Arr[iCnt];

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        iSum = 0;

        while(iNo != 0)
        {
            iSum = iSum + (iNo % 10);
            iNo = iNo / 10;
        }

        printf("Sum of digits of %d is %d\n", Arr[iCnt], iSum);
    }
}

int main()
{
    int iSize = 0, iCnt = 0, iRet = 0;
    int *p = NULL;

    printf("Enter Number of Elements:\n");
    scanf("%d", &iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate Memory");
        return -1;
    }

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter Element %d:\n", iCnt);
        scanf("%d", &p[iCnt]);
    }
     DigitsSum(p, iSize);
     free(p);

     return 0;
}

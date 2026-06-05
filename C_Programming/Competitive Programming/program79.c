//Accept N number from user and display all such numbers which contain 3 digits in it

#include<stdio.h>
#include<stdlib.h>

void Digits(int Arr[], int iLength)
{
    int iCnt = 0;
    
     printf("3-digit numbers are:\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if((Arr[iCnt] >= 100 && Arr[iCnt] <= 999) || (Arr[iCnt] <= -100 && Arr[iCnt] >= -999))
        {
            printf("%d\t", Arr[iCnt]);
        }
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
     Digits(p, iSize);
     free(p);

     return 0;
}

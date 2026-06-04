//Accept N number from user and Accept Range, Display all Elements From that Range

#include<stdio.h>
#include<stdlib.h>

void Range(int Arr[], int iLength,int iStart,int iEnd)
{
    int iCnt = 0;

    printf("Elements in the range %d to %d are:\n", iStart, iEnd);
  
    for(iCnt = 0; iCnt < iLength ; iCnt++)
    {
        if((Arr[iCnt] >=iStart)&&(Arr[iCnt] <= iEnd))
        {
            printf("%d\t",Arr[iCnt]);
        }
    }
}

int main()
{
    int iSize = 0, iCnt = 0,iValue1 = 0,iValue2 = 0;
    int *p = NULL;

    printf("Enter Number of Elements: \n");
    scanf("%d",&iSize);

    printf("Enter Number of Starting point: \n");
    scanf("%d",&iValue1);

    printf("Enter Number of Ending point: \n");
    scanf("%d",&iValue2);

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
    Range(p,iSize,iValue1,iValue2);

    free(p);

    return 0;

}

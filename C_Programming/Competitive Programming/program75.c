//AcceptN number from user and return product of all odd Elements

#include<stdio.h>
#include<stdlib.h>

int Product(int Arr[], int iLength)
{
    int iCnt = 0;
    int iProduct = 1;
    int iFlag = 0;
    
    for(iCnt =0 ; iCnt < iLength ; iCnt++)
    {
        if((iCnt[Arr] %2) != 0)
        {
            iProduct = iProduct * Arr[iCnt];
            iFlag = 1;
        }

    }   
    return (iFlag == 0) ? 0 : iProduct;
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
    iRet = Product(p,iSize);

    printf("Product is %d",iRet);


    free(p);

    return 0;

}

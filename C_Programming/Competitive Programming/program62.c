// Program: Display elements divisible by 5 from array

#include<stdio.h>
#include<stdlib.h>

void Display(int Arr[],int iLength)
{
    int iCnt = 0;

    for(iCnt =0; iCnt<iLength;iCnt++)
    {
        if ((Arr[iCnt] % 5)==0)
        {
            printf("The Number Divisible by 5: %d\n",Arr[iCnt]);
        }

        
    }

 
}

int main()
{
    int iLength = 0;
    int iSize = 0, iRet = 0, iCnt = 0;
    int *p = NULL;

    printf("Entter Number of Elements: \n");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate Memory");
        return -1;
    }

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter Element : \n");
        scanf("%d",&p[iCnt]);
    }
    Display(p,iSize);

    free(p);

    return 0;

}

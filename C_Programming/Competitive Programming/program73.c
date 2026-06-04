//Accept N Number from user and accept one number as NO,return index of last occurrence of that NO

#include<stdio.h>
#include<stdlib.h>

int LastOcc(int Arr[], int iLength,int iNo)
{
    int iCnt = 0;
    

    for(iCnt = iLength; iCnt >= 0 ; iCnt--)
    {
        if(iCnt[Arr] == iNo)
        {
            return iCnt;
        }

    }   
    return -1; 
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
    iRet = LastOcc(p,iSize,iValue);

    if(iRet == -1)
    {
        printf("There is No such Number");
    }
    else
    {
        printf("Last occurrence of Number is at index %d",iRet);
    }

    free(p);

    return 0;

}

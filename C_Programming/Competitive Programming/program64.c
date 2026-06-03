//Program to display elements of an array divisible by 3 and 5

#include<stdio.h>
#include<stdlib.h>

void Display(int Arr[], int iLength)
{
    int iCnt = 0;
    int found = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if((Arr[iCnt] % 5) == 0 && (Arr[iCnt] % 3) == 0)
        {
            printf("The Number Divisible by 5 AND 3: %d\n", Arr[iCnt]);
            found = 1;
        }
    }

    if(found == 0)
    {
        printf("No such element found.\n");
    }
}

int main()
{
    int iSize = 0, iCnt = 0;
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
    Display(p,iSize);

    free(p);

    return 0;

}

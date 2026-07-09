#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *Brr = NULL;
    int iLength = 0;
    int iCnt = 0;

    //Step 1 : Accept the number of Elements
    printf("Enter Number of Elements:\n");
    scanf("%d",&iLength);

    //Step 2 : Alloacate the Memory
    Brr = (int *)malloc(iLength * sizeof(int));

    //Step 3 : Accept the Values from User

    printf("Enter the Elements:\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    //Step 4 : Use the Memory (Logic)

    //Step 5 : Deallocate the Memory

    free(Brr);

    return 0;
}
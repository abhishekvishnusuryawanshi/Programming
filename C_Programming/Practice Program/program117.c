#include<stdio.h>

void Display(int Arr[], int iSize)

{
    int icnt = 0;

    for(icnt = 0 ; icnt <iSize ;icnt++)
    {
        printf(" %d\n",Arr[icnt]);
    }    
}
 
int main()
{
    int iCnt = 0;
    int iLength = 4;
    int Brr[iLength] ;
    
    printf("Enter the Element\n");
    for(iCnt = 0; iCnt <iLength ; iCnt ++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    Display(Brr,iLength);

    return 0;
}
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
    int iLength = 4;
    int Brr[iLength] ;
    
    Brr[0] = 10;
    Brr[1] = 20;
    Brr[2] = 30;
    Brr[3] = 40;

    Display(Brr,iLength);

    return 0;
}
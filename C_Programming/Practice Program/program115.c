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
    int Brr[iLength] = {10,20,30,40,};  //ERROR

    Display(Brr,iLength);

    return 0;
}
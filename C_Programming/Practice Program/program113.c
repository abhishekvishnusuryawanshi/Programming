#include<stdio.h>

void Display(int Arr[])

{
    int icnt = 0;
    for(icnt = 0 ; icnt <8 ;icnt++)
    {
        printf(" %d\n",Arr[icnt]);
    }    
}
 
int main()
{
    int Brr[4] = {10,20,30,40,};

    Display(Brr);

    return 0;
}
#include<stdio.h>

void Display(int Arr[])

{
    int icnt = 0;
    for(icnt = 0 ; icnt <5;icnt++)
    {
        printf(" %d\n",Arr[icnt]);
    }    
}
 
int main()
{
    int Brr[5] = {10,20,30,40,50};

    Display(Brr);

    return 0;
}
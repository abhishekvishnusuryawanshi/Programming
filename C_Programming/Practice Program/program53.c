//INPUT : 5
//OUTPUT : 0 1 2 3 4 5
#include<stdio.h>

void Display(int iNO)
{
    int iCnt = 0;
    for (iCnt = 0; iCnt <= iNO; iCnt++)
    {
        Printf("%d\t",iCnt);
    }

    
}
int main()
{
    int iValue=0;

    printf("Enter a number:\n");
    scanf("%d",&iValue);

    Display(iValue);


    return 0;
}
//INPUT : 5
//OUTPUT : -5 -4 -3 -2 -1 0 1 2 3 4 5
#include<stdio.h>

void Display(int iNO)
{
    int iCnt = 0;
    for (iCnt = -iNO; iCnt <= iNO ; iCnt++)
    {
        printf("%d\t",iCnt);
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
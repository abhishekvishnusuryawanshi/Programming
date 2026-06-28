//INPUT : 5
//OUTPUT : 1 3 5
#include<stdio.h>

void Display(int iNO)
{
    int iCnt = 0;
    for (iCnt = 1; iCnt <= iNO; iCnt += 2)
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
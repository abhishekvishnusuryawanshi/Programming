#include<stdio.h>

int main()
{
    int No1 = 0,No2 = 0 ,Ans = 0;
    int iDigit = 0;

    printf("Enter a first Number :");
    scanf("%d",&No1);

    printf("Enter a Secound Number :");
    scanf("%d",&No2);

    Ans = No1 & No2;
    printf("AND : %d\n",Ans);

    Ans = No1 | No2;
    printf("OR : %d\n",Ans);

    Ans = No1 ^ No2;
    printf("XOR : %d\n",Ans);
    
    return 0;
}
#include<stdio.h>
typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0xFFFFFFF7;
    
    printf("Enter a Number : \n");
    scanf("%d",&iNo);

    iNo = iNo & iMask ;

    printf("Updated Number : %d\n",iNo);

    return 0;
}
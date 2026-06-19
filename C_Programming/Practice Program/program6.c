/* 
    Algorithm-
    START
        Accept first number as no1
        Accept second number as no2
        perform Addtion of no1 and no2
        Display the result
    STOP

*/

#include<stdio.h>

int main()
{
    //Variable creation with default values
    float i=0.0f,j=0.0f,k=0.0f;

    printf("Enter First Number : \n");
    scanf("%f",&i);

    printf("Enter Second Number : \n");
    scanf("%f",&j);

    k = i+j;

    printf("Addtion is : %f\n",k);      

    return 0;
}
#include<stdio.h>

float AddTwoNumbers(
                        float fno1,           //First input
                        float fno2            //Second input
                    )
{
    float fAns = 0.0f;                        //Variable to Store Result
    fAns = fno1 + fno2;                       //Perform Addition

    return fAns;
}
int main()
{
   float fValue1 = 0.0f;                      // To store first input
   float fValue2 = 0.0f;                      // To store second input
   float fResult = 0.0f;                      //To store the result

    printf("Enter First Number : \n");
    scanf("%f",&fValue1);

    printf("Enter Second Number : \n");
    scanf("%f",&fValue2);

    fResult = AddTwoNumbers(fValue1 , fValue2);           

    printf("Addtion is : %f\n",fResult);      

    return 0;
}
#include<stdio.h>

//User define macro
#define AGE_INVALID -1

int CalculateTicketPrice(int iAge)
{
    //Input filter
    if(iAge < 0)
    {
        return AGE_INVALID;
    }
    
    if(iAge >= 0 && iAge <=5)
    {
        return 0;
    }
    else if(iAge>=6 && iAge <=18)
    {
        return 500;
    }
    else if(iAge>= 19 && iAge<=50)
    {
        return 900;
    }
    else
    {
        return 400;
        
    }
}

int main()
{
   int iValue=0;
   int iRet=0;

   printf("Please Enter Your Age to Calculate ticket Price :");
   scanf("%d",&iValue);

   iRet=CalculateTicketPrice(iValue);

   if(iRet == AGE_INVALID)
   {
        printf("Please Enter Positive Age\n");
   }
   else
   {
        printf("\nYour Ticket Price Will be: %d ruppes",iRet);
   }

    return 0;
}

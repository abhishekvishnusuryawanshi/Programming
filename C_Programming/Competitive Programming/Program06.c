//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and prints '*' that many times.
//
//////////////////////////////////////////////////////////////
#include<Stdio.h> 

void Display(int iNo)
{
    int iCnt = 0;
    //Write Updater
    while (iCnt < iNo)
    {
       printf("\t*");
       iCnt++;
    }
    
}
int main()
{
    int iValue = 0;

    printf("Enter Number:\n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;

}

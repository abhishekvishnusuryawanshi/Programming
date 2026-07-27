/*
Write a recursive program which Accept string from user and count number of White Spaces.
INPUT -     H ell o
OUTPUT -    2
*/
#include<stdio.h>

int CountWhiteSpace(char *str)
{
   static int iCount = 0;

    if(*str != '\0')
    {
        if(*str ==' ')
        {
            iCount++;
           
        }
        
        return CountWhiteSpace(str + 1);
    }

    return iCount;

}


int main()
{

    char Arr[100]={'\0'};
    int iRet = 0;

    printf("Enter a String : \n");
    scanf("%[^'\n']s",&Arr);

    iRet = CountWhiteSpace(Arr);

    printf("The White Spaces in the String : %d",iRet);

    return 0;
}

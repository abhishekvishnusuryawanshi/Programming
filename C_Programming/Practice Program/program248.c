#include<stdio.h>

int StrlenX(char * const str)
{
    int iCount = 0;

    
    while(*str != '\0')
    {
        iCount++;
        str++;          // const type
    }
    return iCount;

}
int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0 ;

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);  

    iRet = StrlenX (Arr);

    printf("The Length is : %d\n",iRet);

    return 0;
}
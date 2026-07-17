#include<stdio.h>

void StrlenX( char *str)
{
    *str = 'A';

}
int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0 ;

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);  

    StrlenX (Arr);

    printf("String is : %s\n",Arr);

    return 0;
}
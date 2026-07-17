#include<stdio.h>

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string : \n");
    scanf("%s",Arr);                //Issue

    printf("Entered the String : %s\n",Arr);

    return 0;
}
#include<stdio.h>

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);              // %[^'\n']s Regx or Regular Expersion

    printf("Entered the String : %s\n",Arr);

    return 0;
}
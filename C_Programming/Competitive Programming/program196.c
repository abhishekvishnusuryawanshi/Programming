/*
    Write a program which accepts file name from user and
    returns the number of Count Capital characters in that file.
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CountCapital(char FileName[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};

    int iRet = 0 , iCount = 0 , i = 0 ;
    int fd = 0;

    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to Open File\n");
        return -1;
    }

    while((iRet = read(fd,Buffer,sizeof(Buffer)))!=0)
    {
        for(i = 0 ; i< iRet; i++)
        {
            if(Buffer[i] > 'A' || Buffer[i] < 'Z')
            {
                iCount ++;
            }
        }
        memset(Buffer,'\0',sizeof(Buffer));
    }

    return iCount;
}
int main()
{
    char Fname[30] = {'\0'};
    int iRet = 0;

    printf("Enter the File Name:\n");
    scanf("%[^'\n']s",&Fname);

    iRet = CountCapital(Fname);
    printf("The Number of Captial in File: %d",iRet);

    return 0;
}

/*
    Write a program which accepts file name from user and
    returns the number of white space characters in that file.
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CountWhiteSpace(char FileName[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};

    int iRet = 0, iCount = 0, i = 0;
    int fd = 0;

    fd = open(FileName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        for(i = 0; i < iRet; i++)
        {
            if(Buffer[i] == ' ' || Buffer[i] == '\t' || Buffer[i] == '\n')
            {
                iCount++;
            }
        }

        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);

    return iCount;
}

int main()
{
    char Fname[30] = {'\0'};
    int iRet = 0;

    printf("Enter the File Name: ");
    scanf("%s", Fname);

    iRet = CountWhiteSpace(Fname);

    if(iRet != -1)
    {
        printf("The Number of White Space characters in File is : %d\n", iRet);
    }

    return 0;
}

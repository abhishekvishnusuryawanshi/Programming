/*
    Write a program which accepts file name from user and
    returns the number of white space characters in that file.
*/
#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CountFrequency(char FileName[], char ch)
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
            if(Buffer[i] == ch)
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
    char cValue = '\0';

    printf("Enter the File Name: ");
    scanf("%s", Fname);

    printf("Enter the character to check the frequency: ");
    scanf(" %c", &cValue);

    iRet = CountFrequency(Fname, cValue);

    if(iRet != -1)
    {
        printf("Frequency of '%c' is : %d\n", cValue, iRet);
    }

    return 0;
}

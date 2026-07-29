/*
    Write a program which accepts file name and one count from user
    and read that number of characters from starting position.
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

void DisplayN(char FileName[], int iCount)
{
    char Buffer[1024] = {'\0'};
    int fd = 0;
    int iRet = 0;

    fd = open(FileName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }

    iRet = read(fd, Buffer, iCount);

    if(iRet > 0)
    {
        write(1, Buffer, iRet);
    }

    close(fd);
}

int main()
{
    char Fname[30] = {'\0'};
    int iValue = 0;

    printf("Enter the File Name : ");
    scanf("%s", Fname);

    printf("Enter the Number of Characters : ");
    scanf("%d", &iValue);

    DisplayN(Fname, iValue);

    return 0;
}

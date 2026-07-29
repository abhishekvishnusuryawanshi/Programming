/*
    Write an application which accepts file name from user
    and display size of file.
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

#define BUFFER_SIZE 1024

int main()
{
    char Fname[30];
    char Buffer[BUFFER_SIZE];
    int fd = 0;
    int iRet = 0;
    int iSize = 0;

    printf("Enter the File Name : ");
    scanf("%s", Fname);


    fd = open(Fname, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        iSize = iSize + iRet;
    }

    printf("File size is %d bytes\n", iSize);


    close(fd);

    return 0;
}

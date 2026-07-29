/*
    Write an application which accepts file name from user
    and read all data from that file and display contents on screen.
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

int main()
{
    char Fname[30];
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0;
    int iRet = 0;

 
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
        write(1, Buffer, iRet);
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);

    return 0;
}

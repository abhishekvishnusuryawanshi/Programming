/*
    Write an application which accepts file name and one string
    from user and write that string at the end of file.
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

int main()
{
    char Fname[30];
    char Data[100];
    int fd = 0;
    int iRet = 0;

    printf("Enter the File Name : ");
    scanf("%s", Fname);

    fd = open(Fname, O_WRONLY | O_APPEND);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    printf("Enter the string : ");
    scanf(" %[^\n]", Data);

    iRet = write(fd, Data, strlen(Data));

    if(iRet == -1)
    {
        printf("Unable to write data\n");
    }
    else
    {
        printf("Data written successfully\n");
    }

    close(fd);

    return 0;
}

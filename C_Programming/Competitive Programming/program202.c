/*
    Write an application which accepts file name from user
    and open that file in read mode.
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    char Fname[30];
    int fd = 0;

    printf("Enter the File Name : ");
    scanf("%s", Fname);

    fd = open(Fname, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File opened successfully\n");
        close(fd);
    }

    return 0;
}

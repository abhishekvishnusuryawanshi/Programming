/*
write a program to Count the frequency of given number element in singly linear linkedlist.
*/
#include<stdio.h>
#include<stdlib.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void InserFirst(PPNODE first , int iNo)
{
    PNODE newn = NULL;

    newn =(PNODE)malloc(sizeof(NODE));

    newn-> data = iNo;
    newn-> next = NULL;

    if(NULL == *first)     
    {
        *first = newn;
    }
    else                    
    {
        newn ->next = *first;
        *first = newn;
    }
}
int Frequency(PPNODE Head , int iNo)
{
    PNODE temp = NULL;
    int iCount = 0;
    temp = *Head;

    while(temp != NULL)
    {
        if(temp ->data  == iNo)
        {
            iCount++;
        }
        temp = temp->next;
    }
    return iCount;

}

int main()
{
    PNODE head = NULL;
    int iRet = FALSE;
    int iValue = 0;

    printf("Enter Element to check frequency of that number in LinkedList : ");
    scanf("%d",&iValue);

    InserFirst(&head,101);
    InserFirst(&head,51);
    InserFirst(&head,21);
    InserFirst(&head,11);
    

    iRet = Frequency(&head,iValue);

    printf("The frequency of number is : %d", iRet);

    return 0;
}

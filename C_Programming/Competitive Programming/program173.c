/*
write a program to Count odd element in singly linear linkedlist.
*/
#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

void InserFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if (NULL == *first)
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        *first = newn;
    }
}

int CountOdd(PNODE first)
{
    int iCount = 0;

    while (first != NULL)
    {
        if (first->data % 2 != 0)
        {
            iCount++;
        }
        first = first->next;
    }

    return iCount;
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;
    int iValue = 0;

    InserFirst(&head, 101);
    InserFirst(&head, 51);
    InserFirst(&head, 21);
    InserFirst(&head, 11);

    iRet = CountOdd(head);

    printf("The Odd Element in the Linkedlist are : %d", iRet);

    return 0;
}

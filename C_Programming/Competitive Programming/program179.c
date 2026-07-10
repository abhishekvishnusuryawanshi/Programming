/*
write a program to Count elements greater then given number in singly linear linkedlist.
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

void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if (*first == NULL)
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        *first = newn;
    }
}

int CountGreater(PNODE first, int iNo)
{
    int iCount = 0;

    while(first != NULL)
    {
        if(first->data > iNo)
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

    InsertFirst(&head, 101);
    InsertFirst(&head, 51);
    InsertFirst(&head, 21);
    InsertFirst(&head, 11);

    iRet = CountGreater(head, 20);

    printf("Count of elements greater than 20 is : %d\n", iRet);

    return 0;
}

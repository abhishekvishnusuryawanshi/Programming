/*
write a program to return the position of First Occurence element in singly linear linkedlist.
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

int FirstOccurrence(PNODE first, int no)
{
    int iPos = 1;

    while(first != NULL)
    {
        if(first->data == no)
        {
            return iPos;
        }

        first = first->next;
        iPos++;
    }

    return -1;
}

int main()
{
    PNODE head = NULL;

    InsertFirst(&head, 101);
    InsertFirst(&head, 51);
    InsertFirst(&head, 21);
    InsertFirst(&head, 11);

    FirstOccurrence(head, 21);

    return 0;
}

/*
write a program to Display even element in singly linear linkedlist.
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

void Display(PNODE first)
{
    int check = 0;
    
    while (first != NULL)
    {
        if (first->data % 2 == 0)
        {
           printf("%d \t",first->data);
           check++;
        }
        first = first->next;
    }

    if(check==0)
    {
        printf("There is No Even Number in Linkedlist:");
    }


}

int main()
{
    PNODE head = NULL;

    InserFirst(&head, 101);
    InserFirst(&head, 51);
    InserFirst(&head, 21);
    InserFirst(&head, 11);

    Display(head);

    return 0;
}

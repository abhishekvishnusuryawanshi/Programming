//////////////////////////////////////////////////////////////
//
// This program accepts a digit from the user and displays its corresponding
// word using switch case (0 to 9).
//
//////////////////////////////////////////////////////////////
#include<stdio.h>

void Number(int iNo)
{
    switch(iNo)
    {
    case 0:
    printf("Zero");
    break; 

    case 1:
    printf("One");
    break; 

        case 2:
        printf("Two");
    break; 

        case 3:
        printf("Three");
    break; 

    case 4:
    printf("Four");
    break; 

    case 5:
    printf("Five");
    break; 

    case 6:
    printf("Six");
    break; 

    case 7:
    printf("Seven");
    break; 

    case 8:
    printf("Eight");
    break; 

    case 9:
    printf("Nine");
    break; 

    default:
    printf("Invaild Input");
    break;
    
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a Number :\n");
    scanf("%d",&iValue);

    Number(iValue);
    return 0;

}
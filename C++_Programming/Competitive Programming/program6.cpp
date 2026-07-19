/*
Write genric program to accept one value and one number from user. print that value that number of times on screen.
*/
#include<iostream>
using namespace std;

template <class T>

void Display(T Value , int Size)
{
    int i = 0;

    for(i = 1 ; i <= Size ; i++)
    {
        cout<<Value<<"\t";
    }

}

int main()
{
    char ch = '\0'; 
    int Value = 0;

    cout<<"Enter a Value: "<<"\n";
    cin>>ch;

    cout<<"Enter a Frequency: "<<"\n";
    cin>>Value;

    Display(ch,Value);


    return 0;
}

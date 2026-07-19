/*
Write generic program to accpet N value and reverse the contents.
*/
#include<iostream>
using namespace std;

template <class T>

void Reverse(T *Arr , int iSize)
{
    int i = 0;

    for(i = iSize - 1; i >= 0; i--)
    {
        cout<<Arr[i]<<"\t";
    }
}

int main()
{
    int i = 0 ,iSize = 0;
    int Arr [100] ;

    cout<<"Enter the Size of Array : "<<"\n";
    cin>>iSize;

    cout<<"Enter the Elements : "<<"\n";
    for(i= 0 ; i < iSize ; i++)
    {
        cin>>Arr[i];
    }
    
    Reverse(Arr,iSize);

    return 0;
}

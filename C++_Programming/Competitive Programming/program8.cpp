/*
Write genric program to accept N values and Search first Occurence of any specify value.
*/
#include<iostream>
using namespace std;

template <class T>

T SearchFirst(T *Arr , int Size , T iNo)
{
    int i = 0;


    for(i = 0 ; i < Size ; i++)
    {
        if( Arr[i] == iNo)
        {
            return i;
        }
    }
}

int main()
{
    int i = 0;
    int Arr[100] ;
    int iSize = 0;
    int Pos = 0;
    int iRet = 0;
    
    cout<<"Enter the Size of Array : "<<"\n";
    cin>>iSize;

    cout<<"Enter a Value to Search: "<<"\n";
    cin>>Pos;

    cout<<"Enter the Elements : "<<"\n";
    for(i= 0 ; i < iSize ; i++)
    {
        cin>>Arr[i];
    }

    iRet = SearchFirst(Arr,iSize,Pos);

    cout<<"The First Occurrence at index : "<<iRet<<"\n";

    return 0;
}

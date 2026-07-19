/*
Write genric program to accept N values and count frequency of any specify value.
*/
#include<iostream>
using namespace std;

template <class T>

T Frequency(T *Arr , int Size , T Target)
{
    int i = 0;
    int iCount = 0;

    for(i = 0 ; i < Size ; i++)
    {
        if( Arr[i] == Target)
        {
            iCount ++;
        }
    }
    return iCount;
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

    cout<<"Enter a Value to check Frequency: "<<"\n";
    cin>>Pos;

    cout<<"Enter the Elements : "<<"\n";
    for(i= 0 ; i < iSize ; i++)
    {
        cin>>Arr[i];
    }

    iRet = Frequency(Arr,iSize,Pos);

    cout<<"Frequency : "<<iRet<<"\n";

    return 0;
}

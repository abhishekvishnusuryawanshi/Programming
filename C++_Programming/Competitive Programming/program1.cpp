/*
Write generic program to multiply two Numbers.
*/

#include<iostream>
using namespace std;

template<class T>

T Multiply(T No1 , T No2)
{
    T Ans;
    Ans = No1 * No2;
    return Ans;
}

int main()
{

    int iRet = Multiply(10,20);

   cout<<iRet<<"\n";

    float fRet = Multiply(10.0f,20.0f);

    cout<<fRet<<"\n";

    return 0;
}

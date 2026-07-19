/*
Write generic program toacceptN values from user and return addition of that values.
*/
#include<iostream>
using namespace std;

template<class T>

T AddN(T *Arr, int iSize)
{
    T Sum = 0 ;
    int i = 0;

    for(i = 0 ; i < iSize ; i++)
    {
        Sum = Sum + Arr[i];
    }
    return Sum;

}

int main()
{
    int Arr[] = {10,20,30,40,50};
    float Brr[] = {10.0f,3.7f,9.8f,8.7f};

    int iSum = AddN(Arr,5);

    cout<<iSum<<"\n";

    float fSum = AddN(Brr,4);

    cout<<fSum<<"\n";


    return 0;
}

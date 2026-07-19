/*
Write generic program toacceptN values from user and return Largest of that values.
*/
#include<stdio.h>
using namespace std;

template<class T>

T AddN(T *Arr, int iSize)
{
    T Largest = 0 ;
    int i = 0;

    for(i = 0 ; i < iSize ; i++)
    {
        
        if(Largest < Arr[i])
        {
            Largest =  Arr[i];
        }

    }
    return Largest;

}

int main()
{
    int Arr[] = {10,20,30,40,50};
    float Brr[] = {7.0f,3.7f,9.8f,8.7f};

    int iSum = AddN(Arr,5);

    printf("%d\n",iSum);

    float fSum = AddN(Brr,4);

    printf("%f\n",fSum);


    return 0;
}

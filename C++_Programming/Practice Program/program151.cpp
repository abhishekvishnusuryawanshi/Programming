#include<iostream>
using namespace std;

class ArrayX
{
    //Access Specifer is PRIVATE
        int Summation(int Arr[], int iSize)
    {
        int iCnt = 0, iSum=0;

        for(iCnt = 0; iCnt < iSize ; iCnt++)
        {
        iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
};

int main()
{
    int *Brr = NULL;
    int iLength = 0,iRet =0, iCnt = 0;
    ArrayX aobj;

    cout<<"Enter Number of Elements:\n";
    cin>>iLength;

    //C: Brr= (int *)malloc(sizeof(int) * iLength)
    Brr = new int[iLength];

    cout<<"Enter the Elements :\n";

    for(iCnt = 0 ; iCnt < iLength ; iCnt++)
    {
        cin>>Brr[iCnt];
    }

    cout<<"Elements of Array Are:\n";
        for(iCnt = 0 ; iCnt < iLength ; iCnt++)
    {
        cout<<Brr[iCnt]<<endl;
    }

    iRet = aobj.Summation(Brr,5);

    cout<<"Summation :"<<iRet<<endl;
    
    delete[]Brr;
   

    return 0;
}
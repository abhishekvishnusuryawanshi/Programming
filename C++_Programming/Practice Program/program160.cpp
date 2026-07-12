#include<iostream>
using namespace std;

#pragma pack(1)

class ArrayX
{
    public:
        int *Arr;
        int iSize;

        //Parameterised Constructor
        ArrayX(int X)
        {
            cout<<"Inside Constructor\n";
            iSize = X;                  //Characteristics Intialisation
            Arr = new int[iSize];       //Resource Allocation
        }

        //Destructor
        ~ArrayX()
        {
            cout<<"Inside Destructor\n";
            delete []Arr;               //Resource Dealloaction
        }

};

int main()
{
    //Static MemoryAllocation for object
    //ArrayX aobj1(5); 
    ArrayX *aobj1 = new ArrayX(5);

    delete aobj1;

    cout<<"End of Main\n";
      

    return 0;
}
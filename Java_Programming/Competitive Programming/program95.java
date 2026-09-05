/*
    write a program to Reverse the Contents of Each Column
*/
import java.util.*;

class MatrixX
{
    public void ReverseCol(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int Temp = 0;

        for(j = 0; j < iCol; j++)
        {
            for(i = 0; i < iRow / 2; i++)
            {
                Temp = Arr[i][j];

                Arr[i][j] = Arr[iRow - i - 1][j];

                Arr[iRow - i - 1][j] = Temp;
            }
        }
    }
}

class program95
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[][] = new int[4][4];

        int i = 0;
        int j = 0;

        System.out.println("Enter the elements of matrix :");

        for(i = 0; i < 4; i++)
        {
            for(j = 0; j < 4; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        MatrixX obj = new MatrixX();

        obj.ReverseCol(Arr, 4, 4);

        System.out.println("Matrix after reversing each column :");

        for(i = 0; i < 4; i++)
        {
            for(j = 0; j < 4; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }

            System.out.println();
        }
    }
}

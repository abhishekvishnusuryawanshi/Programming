/*
    write a program to Display Transpose of Matrix
*/

import java.util.*;

class MatrixX
{
    public void Transpose(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for(i = 0; i < iCol; i++)
        {
            for(j = 0; j < iRow; j++)
            {
                System.out.print(Arr[j][i] + "\t");
            }

            System.out.println();
        }
    }
}

class program93
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

        System.out.println("Transpose of matrix :");

        obj.Transpose(Arr, 4, 4);
    }
}

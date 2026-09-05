/*
    write a program to check Addition of Elements from Each Column
*/
import java.util.*;

class MatrixX
{
    public void AddColumn(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int iSum = 0;

        for(j = 0; j < iCol; j++)
        {
            iSum = 0;

            for(i = 0; i < iRow; i++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.print(iSum + "\t");
        }

        System.out.println();
    }
}

class program91
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[][] = new int[4][4];
        int i = 0, j = 0;

        System.out.println("Enter the elements of matrix :");

        for(i = 0; i < 4; i++)
        {
            for(j = 0; j < 4; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        MatrixX obj = new MatrixX();

        System.out.println("Addition of each column :");

        obj.AddColumn(Arr, 4, 4);
    }
}

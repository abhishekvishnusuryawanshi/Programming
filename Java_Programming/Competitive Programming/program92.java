/*
    write a program to Swap Contents of Consecutive Rows
*/
import java.util.*;

class MatrixX
{
    public void SwapRow(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int Temp = 0;

        for(i = 0; i < iRow - 1; i = i + 2)
        {
            for(j = 0; j < iCol; j++)
            {
                Temp = Arr[i][j];
                Arr[i][j] = Arr[i + 1][j];
                Arr[i + 1][j] = Temp;
            }
        }
    }
}

class program92
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

        obj.SwapRow(Arr, 4, 4);

        System.out.println("Matrix after swapping consecutive rows :");

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

/*
    write a program to Reverse the Contents of Each Row
*/
import java.util.*;

class MatrixX
{
    public void ReverseRow(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int Temp = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol / 2; j++)
            {
                Temp = Arr[i][j];

                Arr[i][j] = Arr[i][iCol - j - 1];

                Arr[i][iCol - j - 1] = Temp;
            }
        }
    }
}

class program94
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

        obj.ReverseRow(Arr, 4, 4);

        System.out.println("Matrix after reversing each row :");

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

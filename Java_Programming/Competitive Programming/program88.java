/*
    write a program to check Addition of diagonal elements
*/
import java.util.*;

class MatrixX
{
    public int AddDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int iSum = 0;

        for(i = 0; i < iRow && i < iCol; i++)
        {
            iSum = iSum + Arr[i][i];
        }

        return iSum;
    }
}

class program88
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[][] = new int[4][4];
        int i = 0, j = 0;
        int iRet = 0;

        System.out.println("Enter the elements of matrix :");

        for(i = 0; i < 4; i++)
        {
            for(j = 0; j < 4; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        MatrixX obj = new MatrixX();

        iRet = obj.AddDiagonal(Arr, 4, 4);

        System.out.println("Addition of diagonal elements : " + iRet);
    }
}

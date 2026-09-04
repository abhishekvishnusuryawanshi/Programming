/*
    write a program to check Largest Number from Both Diagonals
*/
import java.util.*;

class MatrixX
{
    public int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int iMax = Arr[0][0];

        for(i = 0; i < iRow && i < iCol; i++)
        {
            if(Arr[i][i] > iMax)
            {
                iMax = Arr[i][i];
            }

            if(Arr[i][iCol - i - 1] > iMax)
            {
                iMax = Arr[i][iCol - i - 1];
            }
        }

        return iMax;
    }
}

class program90
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

        iRet = obj.MaxDiagonal(Arr, 4, 4);

        System.out.println("Largest number from both diagonals : " + iRet);
    }
}

/*
    write a program to Check Whether Matrix is Sparse Matrix
*/
import java.util.*;

class MatrixX
{
    public boolean ChkSparse(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int iZero = 0;
        int iTotal = iRow * iCol;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iZero++;
                }
            }
        }

        if(iZero > iTotal / 2)
        {
            return true;
        }

        return false;
    }
}

class program97
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

        boolean bRet = obj.ChkSparse(Arr, 4, 4);

        System.out.println("Output : " + bRet);
    }
}

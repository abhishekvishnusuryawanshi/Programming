/*
    write a program to Check Whether Matrix is Identity Matrix
*/
import java.util.*;

class MatrixX
{
    public boolean ChkIdentity(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    if(Arr[i][j] != 1)
                    {
                        return false;
                    }
                }
                else
                {
                    if(Arr[i][j] != 0)
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

class program96
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

        boolean bRet = obj.ChkIdentity(Arr, 4, 4);

        System.out.println("Output : " + bRet);
    }
}

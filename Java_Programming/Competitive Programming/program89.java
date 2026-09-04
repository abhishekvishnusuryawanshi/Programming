/*
    write a program to check Frequency of Number
*/
import java.util.*;

class MatrixX
{
    public int Frequency(int Arr[][], int iRow, int iCol, int iNo)
    {
        int i = 0;
        int j = 0;
        int iCount = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }
}

class program89
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[][] = new int[4][4];
        int i = 0, j = 0;
        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter the elements of matrix :");

        for(i = 0; i < 4; i++)
        {
            for(j = 0; j < 4; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Enter number to search :");
        iNo = sobj.nextInt();

        MatrixX obj = new MatrixX();

        iRet = obj.Frequency(Arr, 4, 4, iNo);

        System.out.println("Frequency : " + iRet);
    }
}
